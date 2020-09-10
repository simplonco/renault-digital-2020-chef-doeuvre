import {Component, OnInit} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Router} from "@angular/router";
import {FormBuilder, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-synths',
  templateUrl: './synths.component.html',
  styleUrls: ['./synths.component.css']
})
export class SynthsComponent implements OnInit {

  model: any;
  synths: any;
  uploadForm: FormGroup;

  constructor(private http: HttpClient,
              private router: Router,
              private formBuilder: FormBuilder) {
  }

  ngOnInit(): void {
    // Initialise le modele pour le from
    this.model = {};

    // Initialise le composant synth
    this.http
      .get("http://127.0.0.1:8080/api/synths", SynthsComponent.getAuthenticatedHttpOptions())
      .subscribe(
        synths => this.synths = synths,
        error => alert(`You need to be logged in to see this page: ${error}`)
      )
    // Initialise le composant form
    this.uploadForm = this.formBuilder.group({profile: ['']});
  }

  // Formulaire synth submit
  synth() {
    console.log(this.model.brand)
    this.http
      .post("http://127.0.0.1:8080/api/synths", {
        "brand": this.model.brand,
        "name": this.model.name,
        "creationYear": this.model.creationYear,
      }, SynthsComponent.getAuthenticatedHttpOptions())
      .subscribe(
        () => this.ngOnInit(),
        error => alert(`Error: ${error}`)
      );
  }

  // Nouvelle image selectionne
  onFileSelect(event) {
    // Mettre le contenu de l'image dans le composant
    // "uploadForm" (pour afficher le nom du fichier
    if (event.target.files.length > 0) {
      const file = event.target.files[0];
      this.uploadForm.get('profile').setValue(file);
    }
  }

  onSubmit(event) {
    // Envoi du formulaire, on ajoute au formulaire le
    // contenu du fichier
    const synthId = event.target[0].attributes.id.value
    const formData = new FormData();
    formData.append('file', this.uploadForm.get('profile').value);
    this.http
      .post<any>(
        `http://127.0.0.1:8080/api/synths/${synthId}/image`,
        formData,
        SynthsComponent.getAuthenticatedHttpOptions())
      .subscribe(
        () => this.ngOnInit(),
        error => alert(`Error: ${error}`)
      );
  }

  private static getAuthenticatedHttpOptions(): any {
    const token = sessionStorage.getItem('token');
    if (token) {
      return {
        headers: new HttpHeaders({
          'Authorization': `Basic ${token}`,
        })
      };
    }
    return undefined;
  }

}

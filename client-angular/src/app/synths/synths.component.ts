import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-synths',
  templateUrl: './synths.component.html',
  styleUrls: ['./synths.component.css']
})
export class SynthsComponent implements OnInit {

  synths: any;

  constructor(private http: HttpClient,
              private router: Router) {
  }

  ngOnInit(): void {
    this.http
      .get("http://127.0.0.1:8080/api/synths", SynthsComponent.getAuthenticatedHttpOptions())
      .subscribe(synths => {
          this.synths = synths
        },
        error => {
          alert(`You need to be logged in to see this page: ${error}`)
        })
  }

  private static getAuthenticatedHttpOptions(): any {
    const token = sessionStorage.getItem('token');
    console.log(token)
    if (token) {
      return {
        headers: new HttpHeaders({
          'Authorization': `Basic ${token}`,
          'Content-Type': 'application/json'
        })
      };
    }
    return undefined;
  }


}

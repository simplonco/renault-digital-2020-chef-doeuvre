import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  model: any;

  constructor(private http: HttpClient,
              private router: Router) {
  }

  ngOnInit() {
    this.model = {};
    sessionStorage.setItem('token', '');
  }

  register() {
    this.http
      .post("http://127.0.0.1:8080/register", {
        "username": this.model.username,
        "password": this.model.password,
      })
      .subscribe(() => {
          this.router.navigate(["/login"])
        },
        error => {
          alert(`Register failed: ${error}`)
        })
  }

}

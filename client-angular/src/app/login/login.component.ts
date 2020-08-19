import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  model: any;

  constructor(private http: HttpClient,
              private router: Router) {
  }

  ngOnInit() {
    this.model = {};
    sessionStorage.setItem('token', '');
  }

  login() {
    this.http
      .post("http://127.0.0.1:8080/login", {
        "username": this.model.username,
        "password": this.model.password,
      })
      .subscribe(() => {
          let base64hash = btoa(this.model.username + ':' + this.model.password);
          sessionStorage.setItem('token', base64hash);
          this.router.navigate(["/synths"])
        },
        error => {
          alert(`Login failed: ${error}`)
        })
  }

}

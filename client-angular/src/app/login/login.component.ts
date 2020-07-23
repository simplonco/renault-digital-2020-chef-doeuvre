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

  }

}

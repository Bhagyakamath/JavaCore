import { Component, inject, signal } from '@angular/core';
import { Login1, Springservice } from '../../service/springservice';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { Userstore } from '../../service/userstore';

@Component({
  selector: 'app-login',
  imports: [CommonModule, FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {
  store=inject(Userstore);
  route:any;
  constructor(route:Router){this.route=route;}
  l1:boolean=false;
  sservice=inject(Springservice);
  user:Login1={uemail:"",
    password:""};
  loginf=()=>{
    this.sservice.f1(this.user).subscribe((res)=>{
      if(res===true){
        this.store.store(this.user);
        this.route.navigate(["home"]);
      }
    })
  }
}

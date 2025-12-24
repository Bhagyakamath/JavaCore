import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { toSignal } from '@angular/core/rxjs-interop';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class Springservice {
   url:string="http://localhost:9091/m1";
   http=inject(HttpClient);
   f1=(user:Login1):Observable<any>=>{
    return this.http.post(this.url+"/login", user);
   
   }

   f2=(user:Student1):Observable<any>=>{
    return this.http.post(this.url+"/useradd", user,{responseType:'text'});
   }
}

export interface Login1{
  uemail:string; 
  password:string;
}

export interface Student1{
    sid: string;
    name: string;
    username : string;
    password: string;
    salary : number;
    dob :string;
    phonenumber: string;
    marks : number;
}
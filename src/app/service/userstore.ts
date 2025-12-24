import { Injectable } from '@angular/core';
import { Login1 } from './springservice';

@Injectable({
  providedIn: 'root',
})
export class Userstore {
  userdata:Login1={uemail:"", password:""};
  store=(x:Login1)=>{
    this.userdata=x;
  }

  restore=():Login1=>{
    return this.userdata;
  }
}

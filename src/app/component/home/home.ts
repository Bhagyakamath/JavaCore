import { Component, inject } from '@angular/core';
import { Userstore } from '../../service/userstore';
import { Login1 } from '../../service/springservice';
import { Navbar } from '../navbar/navbar';
import { Footer } from '../footer/footer';
import { Parent } from '../parent/parent';

@Component({
  selector: 'app-home',
  imports: [Navbar, Footer, Parent],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {
  store=inject(Userstore);
  user:Login1={uemail:"", password:""};
  constructor(){
    this.user=this.store.restore();
  }
}

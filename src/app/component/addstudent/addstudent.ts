import { Component, inject, signal } from '@angular/core';
import { Navbar } from '../navbar/navbar';
import { Footer } from '../footer/footer';
import { Springservice, Student1 } from '../../service/springservice';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-addstudent',
  imports: [Navbar, Footer, FormsModule],
  templateUrl: './addstudent.html',
  styleUrl: './addstudent.css',
})
export class Addstudent {
  service=inject(Springservice);
  student:Student1={sid: "",
    name: "",
    username : "",
    password: "",
    salary : 0,
    dob :"",
    phonenumber: "",
    marks : 0}

    smessage=signal("");
    emessage:string="";

    add=()=>{
      this.service.f2(this.student).subscribe({
        next:(res)=>{
          this.smessage.set(res);
          console.log(res);
        },
        error:(res)=>{
          this.emessage=res.error;
          console.log(res);
          
        }
      })
    }
}

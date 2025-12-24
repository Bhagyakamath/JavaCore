import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Student1 } from '../../service/springservice';
import { Navbar } from '../navbar/navbar';
import { Footer } from '../footer/footer';
@Component({
  selector: 'app-rformexample',
  imports: [ CommonModule, ReactiveFormsModule, Navbar, Footer ],
  templateUrl: './rformexample.html',
  styleUrl: './rformexample.css',
})
export class Rformexample {
  studentform:FormGroup;
  constructor(private fb:FormBuilder){
    this.studentform=this.fb.group({
    sid: ["",[Validators.required, Validators.minLength(3)]],
    name: ["",[Validators.required, Validators.minLength(3), Validators.pattern("[a-zA-Z .]*")]],
    username : ["",[Validators.required, Validators.email]],
    password: ["",[Validators.required, Validators.pattern("^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]$"), Validators.minLength(8)]],
    salary : [0,[Validators.required, Validators.pattern("[0-9]*")]],
    dob : ["",[Validators.required, Validators.pattern("[0-9]{4}[-][0-9]{2}[-][0-9]{2}")]],
    phonenumber: ["",[Validators.required, Validators.pattern("[0-9]{10}")]],
    marks : [0,[Validators.required, Validators.max(100), Validators.min(0)]]})
  }
  studentobj:Student1={
    sid: "",
    name: "",
    username : "",
    password: "",
    salary : 0,
    dob :"",
    phonenumber: "",
    marks : 0}

    save=()=>{
      if(this.studentform.valid){
      this.studentobj.sid=this.studentform.get("sid")?.value;
      this.studentobj.name=this.studentform.get("name")?.value;
      this.studentobj.username=this.studentform.get("username")?.value;
      this.studentobj.password=this.studentform.get("password")?.value;
      this.studentobj.salary=this.studentform.get("salary")?.value;
      this.studentobj.dob=this.studentform.get("dob")?.value;
      this.studentobj.phonenumber=this.studentform.get("phonenumber")?.value;
      this.studentobj.marks=this.studentform.get("marks")?.value;


      }
    }
  
  
}

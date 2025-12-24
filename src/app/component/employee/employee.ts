import { CommonModule } from '@angular/common';
import { Component, effect, OnInit, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Dbservice } from '../../service/dbservice';


@Component({
  selector: 'app-employee',
  imports: [FormsModule, CommonModule],
  templateUrl: './employee.html',
  styleUrl: './employee.css',
})
export class Employee implements OnInit{
  public employees:any[]=[];
  employees1=signal<Emp[]>([]);
  constructor(private emps:Dbservice){
      this.f3();
  }
  ngOnInit(){
    
  }
  f3=()=>{
      this.emps.getEmployee().subscribe((res:Emp[])=>{
        this.employees1.set(res);
      });
     console.log(this.employees);
     
  }

  // employees=[
  //   {userId:1, id:1, title:"fd rgdthts ", completed:true, edit:false},
  //   {userId:2, id:2, title:"fd rgdthts ", completed:true, edit:false},
  //   {userId:3, id:3, title:"fd rgdthts ", completed:false, edit:false}
  // ]

  f1=(id:number)=>{
  //    console.log(this.employees1().find((id1)=>id1.id===id), id);
  //   let empp=this.employees1().find(id1=>id1.id===id);
  //  empp!.edit=true;
  //  console.log(".... ", empp);
   
   this.employees1.update(emp1=>emp1.map(e=>e.id===id?{...e, edit:true}:e));
    
  }
  f2=(x:any, index:number)=>{
    // this.employees1.update(emp1=>emp1.map(e=>e.id===index?{e:x}:e));
    const row=this.employees1().at(index);
    row!.title=x.title;
    row!.completed=x.completed;
    row!.edit=false;
    this.emps.editEmployee(row!);
    this.f3();
  }

}

interface Emp{
  userId:number,
  id:number,
  title:string,
  completed:boolean,
  edit:boolean
}
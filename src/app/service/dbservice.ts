import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root',
})
export class Dbservice {
  private url:string="http://localhost:3000/employees";
  constructor(private http:HttpClient){

  }
  getEmployee():Observable<any[]>{
    return this.http.get<any[]>(this.url);
  }

  editEmployee(employee:Emp){
    console.log(`${this.url}/${employee.id}`);
    this.http.put<Emp>(`${this.url}/${employee.id}`, employee).subscribe((response)=>{});
    console.log(employee);
  }
}

interface Emp{
  userId:number,
  id:number,
  title:string,
  completed:boolean,
  edit:boolean
}

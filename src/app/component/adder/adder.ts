import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgModel } from '@angular/forms';

@Component({
  selector: 'app-adder',
  imports: [FormsModule, CommonModule],
  templateUrl: './adder.html',
  styleUrl: './adder.css',
})
export class Adder {
  num1:number=0;
  num2:number=0;
  num3:number=0;

  add= ()=>{
    this.num3=this.num1+this.num2;
  }
}

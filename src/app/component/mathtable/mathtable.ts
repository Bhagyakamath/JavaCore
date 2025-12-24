import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgModel } from '@angular/forms';

@Component({
  selector: 'app-mathtable',
  imports: [FormsModule, CommonModule],
  templateUrl: './mathtable.html',
  styleUrl: './mathtable.css',
})
export class Mathtable {
  num:number=0;
  toDisplay:boolean=false;
  values:number[]=[1,2,3,4,5,6,7,8,9,10];
  values1:number[]=Array.from({length:10});

  cal=()=>{
    if(this.num>0){
      this.toDisplay=true;
    }
  }
  cal1=()=>{
    this.toDisplay=false;
  }
}

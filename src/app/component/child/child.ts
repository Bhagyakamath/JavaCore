import { CommonModule } from '@angular/common';
import { Component, computed, EventEmitter, input, Input, output, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  imports: [CommonModule],
  templateUrl: './child.html',
  styleUrl: './child.css',
})
export class Child {
  // @Input() num1:number=0
  // @Input() num2:number=0
  num1=input.required<number>();
  num2=input.required<number>();
  output=computed(()=>{return this.num1()+this.num2()})
  @Output() dataevent=new EventEmitter<number>;
  f1=()=>{
    this.dataevent.emit(this.output())
  }
}

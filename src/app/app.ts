import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Adder } from './component/adder/adder';
import { Mathtable } from './component/mathtable/mathtable';
import { Employee } from './component/employee/employee';
import { Login } from './component/login/login';
import { Parent } from './component/parent/parent';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Adder, Mathtable, Employee, Login, Parent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('firstproject');     
  protected name='Aditi'
}

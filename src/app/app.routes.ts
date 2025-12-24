import { Routes } from '@angular/router';
import { Login } from './component/login/login';
import { Addstudent } from './component/addstudent/addstudent';
import { Liststudent } from './component/liststudent/liststudent';
import { Home } from './component/home/home';
import { Rformexample } from './component/rformexample/rformexample';

export const routes: Routes = [
    {path:'', component:Login},
    {path:'home', component:Home},
    {path:'addstudent', component:Addstudent},
    {path:'liststudent', component:Liststudent},
    {path:'rform', component:Rformexample}
];

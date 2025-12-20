export function add(...a:number[]):number{
	return a.reduce((x,y)=>(x+y));
	
}

//add a class student in module which takes student object as a constructor. Create display methos to display
interface StudentInterface{
	id:number;
	name:string;
	age:number;
}

export class Student{
	//private id:number;
	//private name:string;
	//private age:number;
	public s1:StudentInterface;
	
	constructor(std:StudentInterface){
		//this.id=std.id;
		//this.name=std.name;
		//this.age=std.age;
		this.s1=std;
	}
    //display(){
		//console.log(`${this.id}...${this.name}....${this.age}`)
	//}
	//good practice to use lambda expressions
	display=()=>{
		console.log(`${this.s1.id}....${this.s1.name}....${this.s1.age}`);
	}
}
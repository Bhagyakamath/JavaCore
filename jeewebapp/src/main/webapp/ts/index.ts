var s1:string="Amrutha";
console.log(s1);
console.log(`Hello ${s1}`);
let arr=[1,2,3];
console.log(arr[0]);
let a:number=10;
var b:number=20;
const c:number=30;
let d:any;
console.log(d);
function f1(n:number):number{
	for(var i=0; i<n; i++){
		console.log(i);
	}
	return i;
}

console.log(f1(5));

interface studenti{
	id:number;
	fname:string;
}

var a1:studenti={
	id:10,
	fname:"Aditi"
}
console.log(`${a1.id}.... ${a1.fname}`);
 
interface studenti2{
	id:number;
	fname:string;
	city:string
}                                                                                                                                                                                                                                        

var a2:studenti2={
	...a1, 
	city:"Manipal"
}

console.log(a2.city);

//Rest operator
function f2(...a3:studenti2[]){
	a3.forEach(el=>{
		console.log(`${el.id}...${el.fname}...${el.city}`);
	});
}

f2(a2,a2,{id:3, fname:"Naina", city:"Bangalore"});

//write a function to receive individual integer values, apply stream and filters to display only even numbers
var f3=function (...numbers:number[]){
	numbers.filter(el=>(el%2===0)).forEach(el=>{
		console.log(el);
	})
}
f3(1,2,3,4,5,6,7,8,9,10);


//Multiplication Table
function table(){
	const inputElement = document.getElementById("num") as HTMLInputElement | null;
	const outputElement = document.getElementById("output") as HTMLElement | null;

	if (!inputElement || !outputElement) {
	    console.error("Required DOM elements not found");
	    return;
	  }
	  const n:number=Number(inputElement.value);
	let result="<ul>"
	for(let i=1; i<=10; i++){
		result+=`<li>${n} x ${i} =${n*i}`;
	}
	result+="</ul>"
	outputElement.innerHTML=result;
}










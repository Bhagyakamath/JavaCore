function h1(a:number,b:number, callback:Function ):number{
	return callback(a,b);
}

function add(x:number, y:number):number{
	return x+y;
}

console.log(h1(10,20,add));
//console.log(h2(10,20,add));
//async function h2(a:number,b:number, callback:Function ):number{
	//var x:number=0;
	//await setTimeout(()=>{x=callback(a,b)},2000);
//	return x;
//}
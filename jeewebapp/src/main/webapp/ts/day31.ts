function outer():()=>number{
	var count:number=0;
	return function inner():number{
		count++;
		return count;
	}
	//return count;
}

const x=outer();
console.log(x());
console.log(x());
console.log(x());
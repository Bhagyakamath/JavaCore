//const category=["animals", "fruits", "cars"];



function getImage(){
	var images=[
			["images/elephant.jpg", "images/rabbit.jpg","images/red panda.jpg" ],
			["images/elephant.jpg", "images/rabbit.jpg","images/red panda.jpg" ],
			["images/elephant.jpg", "images/rabbit.jpg","images/red panda.jpg" ]
		
	];
	var s1="";
	for(let i=0; i<images.length; i++){
		s1=s1+"<div class='container0'>"
		for(let j=0; j<images[i].length; j++){
			s1=s1+`<div class='container1'><img src='${images[i][j]}'></div>`
		}
		s1=s1+"</div>";
	}
	document.getElementById("t1").innerHTML=s1;
}
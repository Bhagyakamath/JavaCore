function f1() {
    var url = "http://jsonplaceholder.typicode.com/todos";
    var userList;
    fetch(url).then(function (response) {
        userList=response.json();
		return userList;
    })
	.then(function (response){
			var s1="<table>";
			for(let i=0; i<response.length; i++){
				s1=s1+"<tr><td>"+response[i].id+"</td><td>"+response[i].userId+"</td></tr>"
			}
			s1=s1+"</table>";
			document.getElementById("t1").innerHTML=s1;

		})
        .catch(function (err) {
        console.error("Failed to fetch todos:", err);
    });
}

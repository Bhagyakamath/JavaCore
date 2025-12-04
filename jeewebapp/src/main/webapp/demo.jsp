<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<input type="text" id="a1" name="a1" value="0"/>
	<input type="text" id="a2" name="a2" value="0"/>
	<br><p id="a3"></p>
	<input type="button" value="add" onClick="f1()"/>
	<input type="button" value="displaypage" onClick="f2()"/>
	<script>
	function f1(){
		var a=parseInt(document.getElementById("a1").value);
		var b=parseInt(document.getElementById("a2").value);
		var c=a+b;
		document.getElementById("a3").innerHTML=c;
	}
	function f2() {
		  var xhttp = new XMLHttpRequest();
		  xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		      document.getElementById("a3").innerHTML =
		      this.responseText;
		    }
		  };
		  xhttp.open("GET", "s1.jsp", true);
		  xhttp.send();
		}
	</script>
</body>
</html>
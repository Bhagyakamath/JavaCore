<%@page import="p2.AddDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add two numbers</title>
</head>
<body>
	<%
	AddDto ob=new AddDto();
	String msg="";
	if(request.getAttribute("addkey")!=null){
		ob=(AddDto) request.getAttribute("addkey");
	}
	if(request.getAttribute("msg")!=null){
		msg=(String) request.getAttribute("msg");
	}
	%>
	
	<%= msg %>
	
	<form action='Addcontroller' method='post'>
	<h1> Addition of Two Numbers</h1> <hr>
	<div>
	 <label>Enter number 1:</label> <input type='text' id='first' name='a1' value='<%= ob.getNum1() %>'></input>
	 <label>Enter number 2:</label> <input type='text' id='second' name='a2' value='<%= ob.getNum2() %>'></input>
	 </div>
	 <div>
	<label> Result:</label> <input type='text' id='third' name='a3' value='<%= ob.getNum3() %>'>
	 </div>
	 <input type='submit' value='click to add'>
	</form>
</body>
</html>
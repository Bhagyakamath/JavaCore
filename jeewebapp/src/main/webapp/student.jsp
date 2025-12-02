<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String msg="";
	if(request.getAttribute("msg")!=null){
		msg=(String) request.getAttribute("msg");
	}
	%>
	<a href="addstudent.jsp" >Click here to add new student</a><br>
	<a href="Studentcontroller" >List students</a>
</body>
</html>
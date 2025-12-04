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
	<%=msg %>
	<form action="LoginServlet" method="post">
		<div>Enter username: <input type='text' name='a1' value=''/></div>
		<div>Enter password: <input type='password' name='a2' value=''/></div>
		<input type='submit'  value='Login'/>
	</form>
</body>
</html>
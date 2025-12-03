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
	//session.invalidate();  to invalidate the session
	String s1=(String) session.getAttribute("a1");
	Cookie cookies[]=request.getCookies();
	for(Cookie x: cookies){
	%>
	<div>
	<%=x.getName() %>
	<%=x.getValue() %>
	</div>
	<% } %>
	<h1><%=s1 %></h1>
</body>
</html>
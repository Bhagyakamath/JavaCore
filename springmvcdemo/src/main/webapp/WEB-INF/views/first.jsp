<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to first JSP</h1>
	<h2><%=request.getAttribute("a1") %></h2>
	<h2><c:out value="${a1}" ></c:out></h2>
	
	<h1>List of players</h1>
	<c:forEach items="${a2}" var="x">
		<c:out value="${x}"></c:out>
	</c:forEach>
	
	<table border="4" style="padding: 5px">
		<c:forEach items="${a3}" var="x1">
		<tr>
			<td><c:out value="${x1.getSid()}"></c:out></td>
			<td><c:out value="${x1.getName()}"></c:out></td>
		</tr>
		
		</c:forEach>
	</table>
	
</body>
</html>
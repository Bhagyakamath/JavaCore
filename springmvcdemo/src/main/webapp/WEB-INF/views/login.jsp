<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="f3" method="post">
	Username: <input type="text" name="uname"/>
	<br> Password: <input type="password" name="pword"/>
	<c:out value="${msg}"></c:out>
	<br><input type="submit" value="login"/>
</form>
</body>
</html>
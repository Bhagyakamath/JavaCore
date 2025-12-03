
<%@page import="p2.StudentDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit page</title>
</head>
<body>
	<%
	StudentDto ob=new StudentDto();
	ob.setSroll(Integer.parseInt(request.getParameter("a1")));
	ob.setFirstname(request.getParameter("a2"));
	ob.setLname(request.getParameter("a3"));
	%>

	<h1>Student</h1>
	<table border="1">
		<form action="Studentcontroller" method="post">
		<tr>
		<td>Student Roll Number</td>
		<td><input type="text" name="sroll" value="<%= ob.getSroll() %>" readonly></td>
		</tr>
		
		<tr>
		<td>First Name</td>
		<td><input type="text" name="fname" value="<%= ob.getFirstname() %>" ></td>
		</tr>
		
		<tr>
		<td>Last Name</td>
		<td><input type="text" name="lname" value="<%= ob.getLname() %>"></td>
		</tr>
		
		<tr>
		<td>Date of Birth</td>
		<td><input type="date" name="dob" value="<%=request.getParameter("a4") %>"></td>
		</tr>
		
		<tr>
		<td>Gender</td>
		<td><input type="radio" name="gender" value="m">Male
		<input type="radio" name="gender" value="f">Female
		</td>
		</tr>
		
		<tr>
		<td><input type="hidden" name="choice" value="2"></td>
		</tr>
		
		<tr>
		<td><input type="submit"  value="Edit"></td>
		</tr>
		
		
		</form>
	</table>
</body>
</html>
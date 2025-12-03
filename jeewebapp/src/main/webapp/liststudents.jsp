
<%@page import="p2.StudentDto"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student list</title>
</head>
<body>
	<%
	List<StudentDto> l1=new ArrayList<>();
	String msg="";
	if(request.getAttribute("addkey")!=null){
		l1=(List<StudentDto>) request.getAttribute("addkey");
	}
	if(request.getAttribute("msg")!=null){
		msg= (String) request.getAttribute("msg");
	}
	%>
	<table border="1">
	<tr>
	<th>Student Roll Number</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Date of Birth</th>
	<th>Gender</th>
	<th>Edit</th>
	<th>Delete</th>
	</tr>
	<%
	for(StudentDto x: l1){
	%>
	<tr>
	<td> <%= x.getSroll() %> </td>
	<td> <%= x.getFirstname() %> </td>
	<td> <%= x.getLname() %> </td>
	<td> <%= x.getDob() %> </td>
	<td> <%= x.getGender() %> </td>
	<td><a href="edit.jsp?a1=<%= x.getSroll() %>&a2=<%= x.getFirstname() %>&a3=<%= x.getLname() %>&a4=<%= x.getDob() %>&a5=<%= x.getGender() %>">Edit</a></td>
	<td><a href="delete.jsp?ob=x">Delete</a></td>
	</tr>
	<% } %>
	</table>
</body>
</html>
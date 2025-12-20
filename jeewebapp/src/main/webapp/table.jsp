<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/table.css">
<script type="text/javascript" src="ts/index.js"></script>
</head>
<body>
	<div class="container">
		<h1>Mathematical Table</h1><br>
		<div>
			Enter a number<input type="text" id="a1"/>
		</div>
		<div class="button">
			<input type="button" onclick="table()" value="generate"/>
		</div>
		<div id="output"></div>
	</div>
</body>
</html>
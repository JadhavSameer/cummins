<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h2>Main</h2>
	<br/>
	Hello, 	<%= request.getAttribute("username") %>


	<form action="logout" method="post"><br/>
	<input type="submit" value="logout">
	</form>
</body>
</html>
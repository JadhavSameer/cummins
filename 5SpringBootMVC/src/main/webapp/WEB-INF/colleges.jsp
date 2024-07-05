<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Colleges</title>
</head>
<body>
	<h1>Colleges</h1>
	<%
	ArrayList<String> colleges = (ArrayList<String>) request.getAttribute("colleges");

	for (String c : colleges) {
		out.println(c + "<br/>");
	}
	%>

	<br />
	<a href="/logout">Logout</a>

</body>
</html>
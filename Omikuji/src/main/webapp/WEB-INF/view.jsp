<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Here's your Omikuji!</h1>
	<p>
	In <c:out value="${number }"/> years, 
	you will live in <c:out value="${city }"/> 
	with <c:out value="${name }"/> as your room mate
	selling <c:out value="${hobby }"/> for a living.
	The next time you will see a <c:out value="${living}"/>, you will have good luck.
	Also, <c:out value="${message}"/>
	</p>
	<a href="/">Go Back</a>
</body>
</html>
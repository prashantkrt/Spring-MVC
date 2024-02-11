<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<h1>my response page</h1>
	<h1>Displaying the data from array</h1>
	<b>Books name</b>
	<br>
	<c:forEach var="bookName" items="${books}">${bookName} </c:forEach>
</body>
</html>
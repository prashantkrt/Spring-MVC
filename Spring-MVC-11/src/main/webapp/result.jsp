<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body style="background-color: DodgerBlue;">

	<center>
		<h1 style="color: black">
			<b>Details</b>
		</h1>
		<h2 style="color: tomato">${impl.id}</h2>
		<h2 style="color: orange">${impl.name}</h2>
		<h2 style="color: MediumSeaGreen">${impl.age}</h2>
		<h2 style="color: Violet">${impl.gender}</h2>
		<h2 style="color: Gray">${impl.city}</h2>
		<h2 style="color: SlateBlue">${impl.salary}</h2>
	</center>

</body>
</html>
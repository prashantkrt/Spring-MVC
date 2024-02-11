<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form for Implementers</title>
</head>
<body style="background-color: DodgerBlue;">
	<h1 style="color: SlateBlue">
		<marquee>
			<b>Welcome to Implementers registration page</b>
		</marquee>
	</h1>
	<form:form method="post" modelAttribute="impl"
		style="background-color: MediumSeaGreen; width: 350px; padding: 20px">
		<table style="height: 400px; width: 200px">
			<tr>
				<td><b>ID :</b></td>
				<td><form:input type="text" path="id" /></td>
			</tr>
			<tr>
				<td><b>Name :</b></td>
				<td><form:input type="text" path="name" /></td>
			</tr>
			<tr>
				<td><b>Age :</b></td>
				<td><form:input type="text" path="age" /></td>
			</tr>
			<tr>
				<td><b>Gender :</b></td>
				<td><form:input type="text" path="gender" /></td>
			</tr>
			<tr>
				<td><b>City :</b></td>
				<td><form:input type="text" path="city" /></td>
			</tr>
			<tr>
				<td><b>Salary :</b></td>
				<td><form:input type="text" path="salary" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit"
						style="height: 20px; width: 100px" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
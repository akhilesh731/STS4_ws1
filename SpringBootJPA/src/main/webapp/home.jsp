<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
	<form action="addAlien">
		<table>
			<tr>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td><input type="text" name="tech" /></td>
			</tr>
			<tr>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>
	<form action="getAlien" style="border: 10px;">
		<table>
			<tr>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
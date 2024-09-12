<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<h3>Login page</h3>
	<pre>${errorMessage}</pre>
	<form action="login" method="post">
		<label>Name</label> 
		<input type="text" name="name"> 
		<label>Password</label>
		<input type="password" name="password">
		<button type="submit">Submit</button>
	</form>
</body>
</html>
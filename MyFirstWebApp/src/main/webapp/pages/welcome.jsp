<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>welcome</title>
</head>
<body>
	<div class="container">
		<h3>welcome page</h3>
		<p>Name: ${name}</p>
		<hr>
		<p>
			<a href="list-todos">Manage</a>
		</p>
	</div>
</body>
</html>
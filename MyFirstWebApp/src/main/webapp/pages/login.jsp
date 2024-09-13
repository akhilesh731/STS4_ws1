<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<h3 class="text-center mt-5">Login page</h3>
	<div class="container">
		<form action="login" method="post">
			<label for="name" class="form-label">Name</label> 
			<input type="text" name="name" id="name" class="form-control"> 
			<label for="pass1" class="form-label">Password</label> 
			<input type="password" name="password" id="pass1" class="form-control">
			<div class="text-danger">${errorMessage}</div>
			<button type="submit" class="btn mt-2 btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>
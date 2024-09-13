<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>todo</title>
</head>
<body>
	<div class="container">
		<h3>Add Todo</h3>
		<hr>
			<form action="add-todo" method="post">
			<label for="name" class="form-label">Description</label> 
			<input type="text" name="description" id="name" class="form-control"> 
			<button type="submit" class="btn mt-2 btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>
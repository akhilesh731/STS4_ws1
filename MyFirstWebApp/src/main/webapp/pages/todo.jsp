<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
			<form:form action="add-todo" method="post" modelAttribute="todo">
				<label for="name" class="form-label">Description</label> 
				<form:input type="text" path="description" id="name" class="form-control"></form:input>
				<form:errors path="description" class="text-danger"></form:errors><br>
				<label for="name" class="form-label">Id</label> 
				<form:input type="text" path="id" class="form-control"></form:input>
				<label for="name" class="form-label">Done</label> 
				<form:input type="text" path="done" class="form-control"></form:input> 
				<button type="submit" class="btn mt-2 btn-primary">Submit</button>
		    </form:form>
	</div>
</body>
</html>
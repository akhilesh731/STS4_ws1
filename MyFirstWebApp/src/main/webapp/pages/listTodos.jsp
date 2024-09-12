<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>listTodos</title>
</head>
<body>
	<h2>Hi ${name}</h2>
	<h3>Your Todos</h3>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Description</th>
				<th>Target Date</th>
				<th>Done</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="todo" items="${todos}">
			<tr>
				<td>${todo.id}</td>
				<td>${todo.description}</td>
				<td>${todo.targetDate}</td>
				<td>${todo.done}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<p>${todos}</p>
</body>
</html>
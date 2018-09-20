<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: pink" align="center">
	<h2>Online Grocery Shop</h2>
	<h3>Add an Item</h3>

	<form:form action="submitDetails.obj" modelAttribute="obj">
		<table align="center">
			<tr>
				<th>Student Name</th>
				<td><form:input path="name" /> <form:errors path="name" /></td>
			</tr>

			<tr>
				<th>Age</th>
				<td><form:input path="age" />
						
					<form:errors path="age" /></td>
			</tr>
		</table>

		<input type="submit" value="Add the item">



	</form:form>
</body>
</html>
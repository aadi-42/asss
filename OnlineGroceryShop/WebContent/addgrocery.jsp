<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<style type="text/css">

h1{
 
}

table {
	
	border-collapse:collapse;
}

body {
	text-align: center;
	background-color: pink;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Grocery Shop</title>
</head>
<body >
	<h1>Online Grocery Shop</h1>
	<h3>Add an Item</h3>
	<form:form action="submitGrocery.obj" modelAttribute="grocery">
		<table align="center" border="1">
			<tr>
				<td>Name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><form:input path="price"/></td>
			</tr>
			<tr>
				<td>Category:</td>
				<td><form:select path="category">
					<form:option value="Select"></form:option>
					<form:options items="${clist}"/>
					</form:select></td>
			</tr>
			<tr>
				<td>Quantity:</td>
				<td><form:input path="quantity"/></td>
			</tr>
			<tr>
				<td>Unit:</td>
				<td><form:input path="unit"/></td>
			</tr>
			<tr>
				<td >Description:</td>
				<td><form:input path="description"/></td>
			</tr>
			<tr>
				<td><a href="index.obj">Go Home</a>
				<input type="reset" value="Reset"></td>
				<td><input type="submit" value="Submit Grocery"/></td>
			</tr>
		</table>
		
	</form:form>

</body>
</html>
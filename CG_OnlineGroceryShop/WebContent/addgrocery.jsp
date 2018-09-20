<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OnlineGroceryShop</title>
</head>
<body style="background-color: cyan">
	<h2 align="center">Online Grocery Shop</h2>
	<h3 align="center">Add Item...</h3>
	<form:form action="submitgrocery.obj" modelAttribute="grocery">
		<table align="center">
			<tr>
				<td>Item Name</td>
				<td><form:input path="name" />
					<form:errors path="name" />
				</td>
			</tr>

			<tr>
				<td>Price (Rs.)</td>
				<td><form:input path="price" />
					<form:errors path="price" />
				</td>
			</tr>

			<tr>
				<td>Category</td>
				<td><form:select path="category">
						<form:option value="Select"></form:option>
						<form:options items="${clist}" />
					</form:select>
					<form:errors path="category" /></td>
			</tr>

			<tr>
				<td>Quantity</td>
				<td><form:input path="quantity" />
					<form:errors path="quantity" /></td>
			</tr>

			<tr>
				<td>Unit</td>
				<td><form:input path="unit" />
					<form:errors path="unit" /></td>
			</tr>

			<tr>
				<td>Description</td>
				<td><form:input path="description" />
					<form:errors path="description" /></td>
			</tr>
		</table>
		<input type="submit" value="Add to Cart">
	</form:form>
</body>
</html>
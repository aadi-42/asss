<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Grocery</title>
</head>
<body style="background-color: pink">
	<h2>Online Grocery Shop</h2>
	<h3>Add An Item</h3>
	
	<form:form action="submitGrocery.obj" modelAttribute="grocery">
		<table>
			<tr>
				<td>Item Name</td>
				<td><form:input path="name" />
			</tr>
			<tr>
				<td>Price(Rs)</td>
				<td><form:input path="price" />
			</tr>
			<tr>
				<td>Category</td>
				<td><form:select path="category">
						<form:option value="Select"></form:option>
						<form:options items="${clist}"/>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><form:input path="quantity" />
			</tr>
			<tr>
				<td>Unit</td>
				<td><form:input path="unit" />
			</tr>
			<tr>
				<td>Description</td>
				<td><form:input path="description" />
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Clear"></td>
			</tr>
			
		</table>
		
	</form:form>
</body>
</html>
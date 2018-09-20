<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.cg.bean.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OnlineGroceryShop</title>
</head>
<body align="center" style="background-color: cyan">
	<h1 align="center">Online Grocery Shop</h1>
	
			<h2 align="center">Available Items</h2>
			<table border="2" align="center" bgcolor="cyan">
				<tr>
					<th>Id</th>
					<th>Item Name</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Unit</th>
					<th>Category</th>
					<th>Description</th>
				</tr>
				<c:forEach items="${grocery}" var="details">
					<tr>
						<td>"${details.id}"</td>
						<td>"${details.name}"</td>
						<td>"${details.price}"</td>
						<td>"${details.quantity}"</td>
						<td>"${details.unit}"</td>
						<td>"${details.category}"</td>
						<td>"${details.description}"</td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<br>
		
	<a align="center" href="index.jsp">Go Home</a>
</body>
</html>
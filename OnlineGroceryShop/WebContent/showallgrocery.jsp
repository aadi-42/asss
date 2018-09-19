<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
table {
	text
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Grocery Shop</title>
</head>
<body>
<h1>Grocery List</h1>
<table border="2" align="center">
	<tr>
		<th>Name</th>
		<th>Price</th>
		<th>Category</th>
		<th>Quantity</th>
		<th>Unit</th>
		<th>Description</th>		
	</tr>
	<c:forEach items="${groceryList}" var="groc">
		<tr>
			<td>${groc.getName()}</td>
			<td>${groc.getPrice()}</td>
			<td>${groc.getCategory()}</td>
			<td>${groc.getQuantity()}</td>
			<td>${groc.getUnit()}</td>
			<td>${groc.getDescription()}</td>
			
		</tr>
	
	</c:forEach>
		
</table>

</body>
</html>
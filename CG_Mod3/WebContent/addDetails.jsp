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
	<table border="2">

		<tr>
			<th>Department Id</th>
			<th>Department Name</th>
			<th>Link</th>
		</tr>

		<c:forEach items="${details}" var="detail">

			<tr>
				<td>${detail.getDepartmentId()}</td>
				<td>${detail.getDepartmentName()}</td>
				<td><a
					href="student.obj?id=${detail.getDepartmentId()}&name=${detail.getDepartmentName()}">Add
						Student Details</a></td>
			</tr>


		</c:forEach>


	</table>
</body>
</html>
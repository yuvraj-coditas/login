<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
	<body>
		Welcome ${user.name}
		<br>
		<table>
			<tr>
				<th>Name</th>
				<th>Contact</th>
				<th>Address</th>
			</tr>
			<tbody>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.name}</td>
					<td>${user.contactNo}</td>
					<td>${user.address}</td>
				</tr>
			</c:forEach>		
			</tbody>
		</table>
	</body>
</html>
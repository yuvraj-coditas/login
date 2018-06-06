<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<script type="text/javascript">
	function submitForm()
	{
		document.getElementById("lang").value = document.getElementById("langs").value;
		document.getElementById("form").submit();
	}
</script>
</head>
<body>
	<form id="form" method="GET">
	
		<select id="langs" onchange="submitForm()">
			<option value="en_US">English</option>
			<option value="zh_CN">Chinese</option>
		</select> Welcome
		<sp:message code="test.label" />
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
						<td>${user.address.pinCode}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	<input id="lang" name="lang" type="hidden" > 

	</form>
</body>
</html>
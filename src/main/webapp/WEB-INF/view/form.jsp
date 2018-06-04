<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
	<body>
		<frm:form action="submit" method="POST">
			<div align="center">
				Username : <input type="text" name="username"><br><br>
				Password : <input type="password" name="pasword"><br><br>
				<button type="submit">Submit</button>	
			</div>
		</frm:form>
	</body>
</html>
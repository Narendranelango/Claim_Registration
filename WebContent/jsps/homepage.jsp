<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<p align="center">Welcome ${user.getUserName()}</p>
Select the type of user:
<table>
	<tr>
	<a href="insured.jsp"><td><button name="insured" value="Insured">Insured</button></td></a>
	<a href="agent.jsp"><td><button name="agent" value="Agent">Agent</button></td></a>
	<a href="admin.jsp"><td><button name="admin" value="Admin">Admin</button></td></a>
	</tr>
</table>

</body>
</html>
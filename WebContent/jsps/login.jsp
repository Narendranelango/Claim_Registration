<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1><p align="center">WELCOME TO STANDARDIZE INSURANCE!!!</p></h1>
<h2><p align="center">Login</p></h2>
<!-- <p align="center"> Claim Registration System </p><br> -->
	<form name="loginForm" method="POST" action="user.htm">
	<div align="center">
	<table>
		<tr>
		<td>UserName:</td> 
		<td><input type="text" name="userName" pattern="^[A-Za-z ]+$"  placeholder="Enter the Username" required="required"></td>
		</tr>
		<tr>
		<td>Password:</td>  
		<td><input type="password" name="password" placeholder="Enter the Password" required="required"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value=" Submit "/>&nbsp;&nbsp;&nbsp;<input type="reset" value=" Reset "/></td>
			<!--  <td><input type="reset" value="Reset"/></td>-->
		</tr>
	</table>
	</div>
	</form>
</body>
</html>
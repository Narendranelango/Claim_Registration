<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Profile</title>
</head>
<body>

<%=request.getAttribute("user_name_exist")%>

<h2><p align="center">Profile Creation</p></h2><br><br>

<form name="profileForm" action="create_profile.htm" method ="POST" >
<table align="center" border="1">	
	<tr>
		<td>UserName</td>
		<td><input type="text" name="userName" placeholder="Enter userName" size="30" required="required"></td>
	</tr>	
	<tr>						
		<td>Password</td>
		<td><input type="text" name="password" placeholder="Enter password" pattern="^[a-zA-Z]{4,}+[@!#*$.,]{1}+[0-9]{3}$" size="30" required="required"></td>
	<tr>
	<tr>	
		<td>RoleCode</td>						
		<td><select name="roleCode" required="required">
				<option value="">Choose Role Code</option>
				<option value="STD_INS">STD_INS</option>
				<option value="STD_AGT">STD_AGT</option>
				<option value="STD_ADM">STD_ADM</option>
	</select></td>
	</tr>
	</table>
	
	<table align="center">
	<tr><td><br></td></tr>
	<tr>
		<td></td>			
		<td><input type="submit" value=" SUBMIT "/>&nbsp;<input type="reset" value="RESET"/></td>
	</tr>
</table>
	
</form>				
</body>
</html>

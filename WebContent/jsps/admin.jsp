<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h2><p align="center">Welcome ${urole.userName} !!</p></h2>
<!-- Inside admin -->
<table align="right">
		<tr>
			<td>UserName:</td> 
			<td>${urole.userName}</td>
		</tr>
		<tr>
			<!--<td>ADMIN</td>-->
		</tr>
		
	</table>
<table>
	<tr>
	<td><a href="create_profile.htm"><button>CREATE NEW PROFILE</button></a></td>
	</tr>
	<tr>
	<td><a href="admin_policy.htm?name=${urole.userName}&role=${code}"><button>VIEW POLICIES</button></a></td>
	</tr>
	<tr>
	<td><a href="create_claim.htm"><button>CREATE CLAIM</button></a></td>
	</tr>
	<tr>
	<td><a href="admin_viewclaim.htm?name=${urole.userName}"><button>VIEW CLAIM</button></a></td>
	</tr>
	<tr>	
	<td><a href="report_generation.jsp"><button>REPORT GENERATION</button></a></td>
	</tr>
</table>
</body>
</html>
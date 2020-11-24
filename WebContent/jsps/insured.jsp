<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

<!-- <p align="center">Welcome ${urole.userName} !!</p>--> <!--?usrName=${param.userName }-->
<h2><p align="center">Welcome ${urole.userName} !!</p></h2>
<table align="right">
		<tr>
			<td>UserName:</td> 
			<td>${urole.userName}</td>
		</tr>
	</table>

Inside Insured
<table>
	<tr>
	<!--<td><a href="/jsps/view_policies.jsp?name=${urole.userName}">VIEW POLICIES</a></td>-->
	<!--  <td><a href="jsps/view_policies.jsp?name=${urole.getUserName()}">VIEW POLICIES</a></td>-->
	<!-- <td><a href="policy.htm">VIEW POLICIES</a>-->
	<td><a href="insured_policy.htm?insured_name=${urole.userName}&role=${code}"><button>VIEW POLICIES</button></a></td>
	</tr>
	<tr>
	<td><a href="create_claim.htm"><button>CREATE CLAIM</button></a></td>
	</tr>
	<tr>
	<td><a href="insured_viewclaim.htm?insured_name=${urole.userName}"><button>VIEW CLAIM</button></a></td>
	</tr>
</table>
</body>
</html>

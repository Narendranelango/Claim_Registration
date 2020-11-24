<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.cg.model.Claim"%>
<%@page import="java.util.List"%>
<%@page import="java.lang.String"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Claim</title>
</head>
<body>
<h2><p align="center">List of Claims</p></h2>
<br>
<%!		String msg;
			int counter=0;
	%>
	
	<%		if(request.getAttribute("view_claim_admin") instanceof String)
			{
	%>	
			<br>
			<%=(String)request.getAttribute("view_claim_admin") %>
	<%		}
			else
			{
	%>		
	<%		List<Claim> claims=(List<Claim>)request.getAttribute("view_claim_admin");	
			
	%>
	
	<table align="right">
		<tr>
			<td>UserName:</td> 
			<td><%=request.getAttribute("userName") %></td>
		</tr>
		
	</table>
	<%		}
	
	%>
		<br><br>
		<table align="center" border=1>
			<thead>
				<tr>
					<th>Claim List</th> 
					
					<th>Insured Name</th>
					
					<th>Policy Number</th>
					
					<th>Claim Number</th>
					
					<th>Claim Type</th>
					
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${view_claim_admin}" var="claim">
				<%counter=counter+1; %>
					<tr>
						<td><%=counter%></td>
						
						<td>${claim.insured_Name}</td>
						
						<td>${claim.policy_Number}</td>
						
						<td>${claim.claim_Number}</td>
						
						<td>${claim.claim_Type}</td>
						
					</tr>	
				</c:forEach>
				<%counter=0; %>
				</tbody>
		</table>

</body>
</html>
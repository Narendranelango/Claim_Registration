<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.cg.model.Policy"%>
<%@page import="java.util.List"%>
<%@page import="java.lang.String"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Policies</title>
</head>
<body>
<h2><p align="center">List of Policies</p></h2>
<br>
	<%!		String msg;
			int counter=0;
	%>
	
	<%		if(request.getAttribute("policy_details_insured") instanceof String)
			{
	%>	
			<br>
			<%=(String)request.getAttribute("policy_details_insured") %>
	<%		}
			else
			{
	%>		
	<%		List<Policy> policy_details=(List<Policy>)request.getAttribute("policy_details_insured");	
			
	%>
	
	<table align="right">
		<tr>
			<td>UserName:</td> 
			<td><%=request.getAttribute("insured_Name") %></td>
		</tr>
		
	</table>
	<%		}
	
	%>
		<br><br>
		<table align="center" border=1>
			<thead>
				<tr>
					<th>Policy List</th> 
					
					<th>Insured Name</th>
					
					<th>Account Number</th>
					
					<th>Policy Number</th>
					
					<th>Policy Premium</th>
					
					<th>Register Claim</th>
					
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${policy_details_insured}" var="policy_insured">
				<%counter=counter+1; %>
					<tr>
						<td><%=counter%></td>
						
						<td><%=request.getAttribute("insured_Name") %></td>
						
						<td>${policy_insured.account_Number}</td>
						
						<td>${policy_insured.policy_Number}</td>
						
						<td>${policy_insured.policy_Premium}</td>
						
						<td><a href="create_claim_auto.htm?policy=${policy_insured.policy_Number}"><button>CREATE CLAIM</button></a></td>
					<!--<td><button name="createclaim" onclick="create.htm?policyNumber=${i.policy_Number}">CREATE CLAIM</button></td>-->
					</tr>	
				</c:forEach>
				<%counter=0; %>
				</tbody>
		</table>
</body>
</html>
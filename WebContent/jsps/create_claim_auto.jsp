<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Claim Register</title>
</head>
<body>
	<%  if(application.getAttribute("pol_num") instanceof String) 
		{	
	%>
<br>
	<%= application.getAttribute("pol_num") %>
	<%	}
		else
		{
	%>		
	
<h2><p align="center">Claim Registration</p></h2><br><br>
	<!-- <table><button name="back" onclick="location.href('policy.htm')">BACK</button></table> -->

<form name="claimForm" action="create_claim_auto.htm?policy_Num=${policy_Number}" method ="POST" >
<!-- <form name="claimForm" action="claim.htm?policy_Num=${policy_Number}" method ="POST" > -->

<table align="center" border="1">	
	<tr>
		<td>Claim Reason</td>
		<td><input type="text" name="claim_Reason" placeholder="Enter claim reason" size="30" required="required"></td>
	</tr>	
	<tr>						
		<td>Accident Street</td>
		<td><input type="text" name="accident_Street" placeholder="Enter accident street" size="30" required="required"></td>
	<tr>
	<tr>
		<td>Accident City				
		<td><input type="text" name="accident_City" placeholder="Enter accident city" size="30" required="required"></td>
	</tr>
	<tr>	
		<td>Accident State</td>						
		<td><select name="accident_State" required="required">
				<option value="">Choose Accident State</option>
				<option value="Andhra Pradesh">Andhra Pradesh</option>
				<option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
				<option value="Arunachal Pradesh">Arunachal Pradesh</option>
				<option value="Assam">Assam</option>
				<option value="Bihar">Bihar</option>
				<option value="Chandigarh">Chandigarh</option>
				<option value="Chhattisgarh">Chhattisgarh</option>
				<option value="Dadar and Nagar Haveli">Dadar and Nagar Haveli</option>
				<option value="Daman and Diu">Daman and Diu</option>
				<option value="Delhi">Delhi</option>
				<option value="Lakshadweep">Lakshadweep</option>
				<option value="Puducherry">Puducherry</option>
				<option value="Goa">Goa</option>
				<option value="Gujarat">Gujarat</option>
				<option value="Haryana">Haryana</option>
				<option value="Himachal Pradesh">Himachal Pradesh</option>
				<option value="Jammu and Kashmir">Jammu and Kashmir</option>
				<option value="Jharkhand">Jharkhand</option>
				<option value="Karnataka">Karnataka</option>
				<option value="Kerala">Kerala</option>
				<option value="Madhya Pradesh">Madhya Pradesh</option>
				<option value="Maharashtra">Maharashtra</option>
				<option value="Manipur">Manipur</option>
				<option value="Meghalaya">Meghalaya</option>
				<option value="Mizoram">Mizoram</option>
				<option value="Nagaland">Nagaland</option>
				<option value="Odisha">Odisha</option>
				<option value="Punjab">Punjab</option>
				<option value="Rajasthan">Rajasthan</option>
				<option value="Sikkim">Sikkim</option>
				<option value="Tamil Nadu">Tamil Nadu</option>
				<option value="Telangana">Telangana</option>
				<option value="Tripura">Tripura</option>
				<option value="Uttar Pradesh">Uttar Pradesh</option>
				<option value="Uttarakhand">Uttarakhand</option>
				<option value="West Bengal">West Bengal</option>
			</select>
	</tr>	
	<tr>
		<td>Accident Zipcode</td>		
		<td><input type="text" name="accident_Zip" placeholder="Enter accident Zipcode" size="30" required="required"></td>
	</tr>	
	<tr>
		<td>Claim Type</td>		
		<td ><select name="claim_Type" required="required" >
			<option value="">  Choose Claim Type  </option>
			<option value="Collision">  Collision  </option>
			<option value="Fire">  Fire  </option>
			<option value="Flood">  Flood  </option>
			<option value="Earthquake">  Earthquake  </option>
			<option value="Hurricane">  Hurricane  </option>	
			<option value="Theft">  Theft  </option>							
		</select></td>
	</tr>
	<table>
	
	<table align="center">
	<tr><td><br></td></tr>
	<tr>
		<td></td>			
		<td><input type="submit" value=" NEXT "/>&nbsp;<input type="reset" value="CANCEL"/></td>
	</tr>
</table>
	
</form>	
	<%
		}		
	%>	
</body>
</html>
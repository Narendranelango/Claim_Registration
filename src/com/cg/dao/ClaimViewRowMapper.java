package com.cg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.cg.model.Claim;

public class ClaimViewRowMapper implements RowMapper<Claim>
{	
	public Claim mapRow(ResultSet rs, int rowNumber) throws SQLException 
	{
	       Claim claim=new Claim();
	       
	       claim.setClaim_Number(rs.getLong("claim_Number"));
	       claim.setClaim_Reason(rs.getString("claim_Reason"));
	       claim.setAccident_Street(rs.getString("accident_Street"));
	       claim.setAccident_City(rs.getString("accident_City"));
	       claim.setAccident_State(rs.getString("accident_State"));
	       claim.setAccident_Zip(rs.getInt("accident_Zip"));
	       claim.setClaim_Type(rs.getString("claim_Type"));
	       claim.setPolicy_Number(rs.getLong("policy_Number"));

	       return claim;
	    }
}
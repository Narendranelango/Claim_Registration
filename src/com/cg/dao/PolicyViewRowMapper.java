package com.cg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.cg.model.Policy;

public class PolicyViewRowMapper implements RowMapper<Policy>
{	
	public Policy mapRow(ResultSet rs, int rowNumber) throws SQLException 
	{
	       Policy pol = new Policy();
	       
	       pol.setInsured_Name(rs.getString("insured_Name"));
	       pol.setPolicy_Number(rs.getLong("policy_Number"));
	       pol.setPolicy_Premium(rs.getDouble("policy_Premium"));
	       pol.setAccount_Number(rs.getLong("account_Number"));
	 
	       return pol;
	    }
}

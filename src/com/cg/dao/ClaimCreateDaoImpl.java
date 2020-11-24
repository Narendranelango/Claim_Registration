package com.cg.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cg.model.Claim;

@Component(value = "cdao")
public class ClaimCreateDaoImpl implements ClaimCreateDao{
	
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public long insertClaim(Claim claim,long policy_Number) 
	{	
		long claim_Number=3;
		System.out.println("Inside Claim Dao");
		String query="insert into claim values(?,?,?,?,?,?,?,?)";
		template.update(query,claim_Number,claim.getClaim_Reason(),claim.getAccident_Street(),claim.getAccident_City(),claim.getAccident_State(),claim.getAccident_Zip(),claim.getClaim_Type(),policy_Number);	
		return claim_Number;
	}
	
	@Override
	public long insertClaim(Claim claim) 
	{	
		long claim_Number=5;
		System.out.println("Inside Claim Dao");
		String query="insert into claim values(?,?,?,?,?,?,?,?)";
		template.update(query,claim_Number,claim.getClaim_Reason(),claim.getAccident_Street(),claim.getAccident_City(),claim.getAccident_State(),claim.getAccident_Zip(),claim.getClaim_Type(),claim.getPolicy_Number());	
		return claim_Number;
	}
	
	@Override
	public List<Claim> checkPolicyNumberExist(long policy_Number)
	{
		System.out.println("Inside Claim Dao Check Policy Exist");
		String query="select * from claim";
		List<Claim> claims=template.query(query,BeanPropertyRowMapper.newInstance(Claim.class));
		return claims;
	}
}

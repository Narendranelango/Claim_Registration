package com.cg.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.cg.model.Claim;
import com.cg.model.Policy;

@Component(value = "vdao")
public class ClaimViewDaoImpl implements ClaimViewDao
{	
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Claim> retrieveClaimOfInsured(String insured_Name)
	{
		System.out.println("Inside ClaimView Dao");
		String query="select c.claim_Number,c.claim_Reason,c.accident_Street,c.accident_City,c.accident_State,c.accident_Zip,c.claim_Type,c.policy_Number,a.insured_Name from claim c inner join policy p on c.policy_Number=p.policy_Number inner join account a on a.account_Number=p.account_Number where a.insured_Name=?";
				
		List<Claim> claims=new ArrayList();
		claims=template.query(query, new Object[]{insured_Name},BeanPropertyRowMapper.newInstance(Claim.class));
		System.out.println(claims);
		
		return claims;
		
	}
	
	@Override
	public List<Claim> retrieveClaimOfAgent(String userName)
	{
		System.out.println("Inside ClaimView Dao");
		String query="select c.claim_Number,c.claim_Reason,c.accident_Street,c.accident_City,c.accident_State,c.accident_Zip,c.claim_Type,c.policy_Number,a.insured_Name from claim c inner join policy p on c.policy_Number=p.policy_Number inner join account a on a.account_Number=p.account_Number where a.userName=?";
		
		List<Claim> claims=new ArrayList();
		//policies=template.query(query, new Object[]{userName},new ClaimRowMapper());
		claims=template.query(query, new Object[]{userName},BeanPropertyRowMapper.newInstance(Claim.class));
		System.out.println(claims);
		
		return claims;
	}
	
	@Override
	public List<Claim> retrieveClaimOfAdmin()
	{
		System.out.println("Inside ClaimView Dao");
		String query="select c.claim_Number,c.claim_Reason,c.accident_Street,c.accident_City,c.accident_State,c.accident_Zip,c.claim_Type,c.policy_Number,a.insured_Name from claim c inner join policy p on c.policy_Number=p.policy_Number inner join account a on a.account_Number=p.account_Number";
		
		List<Claim> claims=new ArrayList();
		//policies=template.query(query, new Object[]{userName},new ClaimRowMapper());
		claims=template.query(query, new Object[]{},BeanPropertyRowMapper.newInstance(Claim.class));
		System.out.println(claims);
		
		return claims;
	}
	
	
}

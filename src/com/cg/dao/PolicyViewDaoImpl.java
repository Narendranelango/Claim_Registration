package com.cg.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.cg.model.Policy;


@Component(value = "pdao")
public class PolicyViewDaoImpl implements PolicyViewDao{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Policy> retrieveInsuredPolicyOfInsured(String insured_Name)
	{
		System.out.println("Inside Policy Dao");
		String query="select a.insured_Name,p.account_Number,p.policy_Number,p.policy_Premium from policy p inner join account a on p.account_Number=a.account_Number where a.insured_Name=?";
		
		List<Policy> policies=new ArrayList();
		policies=template.query(query, new Object[]{insured_Name},BeanPropertyRowMapper.newInstance(Policy.class));
		System.out.println("policies"+policies);
		return policies;
	
	}
	
	@Override
	public List<Policy> retrieveInsuredPolicyOfAgent(String userName) 
	{
		System.out.println("Inside Policy Dao");
		String query="select a.insured_Name,p.account_Number,p.policy_Number,p.policy_Premium from policy p inner join account a on p.account_Number=a.account_Number where a.userName=?";
		
		List<Policy> policies=new ArrayList();
		//policies=template.query(query, new Object[]{userName},new PolicyViewRowMapper());
		policies=template.query(query, new Object[]{userName},BeanPropertyRowMapper.newInstance(Policy.class));
		System.out.println("policies"+policies);
		return policies;
	}
	
	@Override
	public List<Policy> retrieveInsuredPolicyOfAdmin() 
	{
		System.out.println("Inside Policy Dao");
		String query="select a.insured_Name,p.account_Number,p.policy_Number,p.policy_Premium from policy p inner join account a on p.account_Number=a.account_Number";
		
		List<Policy> policies=new ArrayList();
		//policies=template.query(query, new Object[]{userName},new PolicyViewRowMapper());
		policies=template.query(query, new Object[]{},BeanPropertyRowMapper.newInstance(Policy.class));
		System.out.println("policies"+policies);
		return policies;
	}
	
	
}
package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.dao.PolicyViewDao;
import com.cg.model.Policy;

@Component(value = "pservice")
public class PolicyViewServiceImpl implements PolicyViewService {
	
	@Autowired
	private PolicyViewDao policydao;
	
	
	@Override
	public List<Policy> viewInsuredPolicyOfInsured(String insured_Name)
	{
		System.out.println("Inside Policy Service");
		List<Policy> list=new ArrayList();
		list=policydao.retrieveInsuredPolicyOfInsured(insured_Name);

		return list;
	}
	
	@Override
	public List<Policy> viewInsuredPolicyOfAgent(String userName) 
	{
		
		System.out.println("Inside Policy Service");
		List<Policy> list=new ArrayList();
		list=policydao.retrieveInsuredPolicyOfAgent(userName);
		
		return list;	
	}
	
	@Override
	public List<Policy> viewInsuredPolicyOfAdmin() 
	{
		
		System.out.println("Inside Policy Service");
		List<Policy> list=new ArrayList();
		list=policydao.retrieveInsuredPolicyOfAdmin();
		
		return list;	
	}

}

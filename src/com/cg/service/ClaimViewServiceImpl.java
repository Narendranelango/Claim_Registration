package com.cg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.dao.ClaimViewDao;
import com.cg.model.Claim;
import com.cg.model.UserRole;

@Component(value = "vservice")
public class ClaimViewServiceImpl implements ClaimViewService {
	
	@Autowired
	private ClaimViewDao claimviewdao;
	
	@Override
	public List<Claim> viewRegisteredClaimOfInsured(String insured_Name)
	{
		System.out.println("Inside ClaimView Service");
		List<Claim> viewlist=claimviewdao.retrieveClaimOfInsured(insured_Name);
		
		return viewlist;
	}
	
	@Override
	public List<Claim> viewRegisteredClaimOfAgent(String userName)
	{	
		System.out.println("Inside ClaimView Service");
		List<Claim> viewlist=claimviewdao.retrieveClaimOfAgent(userName);
		
		return viewlist;
	}
	
	@Override
	public List<Claim> viewRegisteredClaimOfAdmin()
	{	
		System.out.println("Inside ClaimView Service");
		List<Claim> viewlist=claimviewdao.retrieveClaimOfAdmin();
		
		return viewlist;
	}
	
	
}

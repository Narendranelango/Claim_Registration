package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.dao.ClaimCreateDao;
import com.cg.model.Claim;

@Component(value = "cservice")
public class ClaimCreateServiceImpl implements ClaimCreateService
{
	@Autowired
	private ClaimCreateDao claimdao;
	
	@Override
	public long registerClaim(Claim claim,long policy_Number) 
	{
		System.out.println("Inside Claim Service");
		long claim_Number=claimdao.insertClaim(claim,policy_Number);
		return claim_Number;
	}
	
	@Override
	public long registerClaim(Claim claim) 
	{
		System.out.println("Inside Claim Service");
		long claim_Number=claimdao.insertClaim(claim);
		return claim_Number;
	}
	
	@Override
	public boolean checkPolicyNumber(long policy_Number)
	{	
		boolean value=false;
		System.out.println("Inside Claim Service Check Policy");
		List<Claim> claims=claimdao.checkPolicyNumberExist(policy_Number);
		for(Claim claim:claims)
		{
			if(claim.getPolicy_Number()==policy_Number)
			{
				value=true;
			}
		}
		return value;
	}

}

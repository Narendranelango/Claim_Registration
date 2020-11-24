package com.cg.service;

import com.cg.model.Claim;

public interface ClaimCreateService 
{
	public long registerClaim(Claim claim,long Policy_Number) ;
	public long registerClaim(Claim claim);
	public boolean checkPolicyNumber(long policy_Number);


}

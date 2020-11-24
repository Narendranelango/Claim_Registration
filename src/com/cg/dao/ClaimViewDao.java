package com.cg.dao;

import java.util.List;
import com.cg.model.Claim;
import com.cg.model.Policy;

public interface ClaimViewDao 
{
	public List<Claim> retrieveClaimOfInsured(String insured_Name);
	public List<Claim> retrieveClaimOfAgent(String userName);
	public List<Claim> retrieveClaimOfAdmin();

}

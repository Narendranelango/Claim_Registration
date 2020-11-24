package com.cg.service;

import java.util.List;
import com.cg.model.Claim;


public interface ClaimViewService 
{
	public List<Claim> viewRegisteredClaimOfInsured(String insured_Name);
	public List<Claim> viewRegisteredClaimOfAgent(String userName);
	public List<Claim> viewRegisteredClaimOfAdmin();
}

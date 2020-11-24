package com.cg.dao;

import java.util.List;
import com.cg.model.Policy;

public interface PolicyViewDao {
	
	public List<Policy> retrieveInsuredPolicyOfInsured(String insured_Name);
	public List<Policy> retrieveInsuredPolicyOfAgent(String userName);
	public List<Policy> retrieveInsuredPolicyOfAdmin();


}

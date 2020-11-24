package com.cg.service;

import java.util.List;
import com.cg.model.Policy;

public interface PolicyViewService {

	public List<Policy> viewInsuredPolicyOfInsured(String insured_Name);
	public List<Policy> viewInsuredPolicyOfAgent(String userName);
	public List<Policy> viewInsuredPolicyOfAdmin();

}

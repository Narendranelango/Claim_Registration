package com.cg.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component(value="p1")
public class Policy {
	
	private long account_Number;
	private long policy_Number;
	private double policy_Premium;
	private String insured_Name;
	
	
	//@Autowired
	//private long accountNumber;

	public Policy()
	{
		
	}
		
	public Policy(long account_Number, long policy_Number, double policy_Premium) {
		super();
		this.account_Number = account_Number;
		this.policy_Number = policy_Number;
		this.policy_Premium = policy_Premium;
	}

	public Policy(long account_Number, long policy_Number, double policy_Premium, String insured_Name) {
		super();
		this.account_Number = account_Number;
		this.policy_Number = policy_Number;
		this.policy_Premium = policy_Premium;
		this.insured_Name = insured_Name;
	}

	public long getAccount_Number() {
		return account_Number;
	}

	public void setAccount_Number(long account_Number) {
		this.account_Number = account_Number;
	}

	public long getPolicy_Number() {
		return policy_Number;
	}

	public void setPolicy_Number(long policy_Number) {
		this.policy_Number = policy_Number;
	}

	public double getPolicy_Premium() {
		return policy_Premium;
	}

	public void setPolicy_Premium(double policy_Premium) {
		this.policy_Premium = policy_Premium;
	}

	public String getInsured_Name() {
		return insured_Name;
	}

	public void setInsured_Name(String insured_Name) {
		this.insured_Name = insured_Name;
	}

	@Override
	public String toString() {
		return "Policy [account_Number=" + account_Number + ", policy_Number=" + policy_Number + ", policy_Premium="
				+ policy_Premium + ", insured_Name=" + insured_Name + "]";
	}	
}

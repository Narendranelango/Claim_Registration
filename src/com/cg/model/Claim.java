package com.cg.model;

public class Claim 
{
	private long claim_Number;
	private String claim_Reason;
	private String accident_Street;
	private String accident_City;
	private String accident_State;
	private int accident_Zip;
	private String claim_Type;
	private long policy_Number;
	private String insured_Name;
	
	public Claim()
	{
		
	}
	
	public Claim(String claim_Reason, String accident_Street, String accident_City,
			String accident_State, int accident_Zip, String claim_Type) {
		super();
	
		this.claim_Reason = claim_Reason;
		this.accident_Street = accident_Street;
		this.accident_City = accident_City;
		this.accident_State = accident_State;
		this.accident_Zip = accident_Zip;
		this.claim_Type = claim_Type;
	}

	public Claim(long claim_Number, String claim_Reason, String accident_Street, String accident_City,
			String accident_State, int accident_Zip, String claim_Type, long policy_Number) {
		super();
		this.claim_Number = claim_Number;
		this.claim_Reason = claim_Reason;
		this.accident_Street = accident_Street;
		this.accident_City = accident_City;
		this.accident_State = accident_State;
		this.accident_Zip = accident_Zip;
		this.claim_Type = claim_Type;
		this.policy_Number = policy_Number;
	}

	public Claim(long claim_Number, String claim_Reason, String accident_Street, String accident_City,
			String accident_State, int accident_Zip, String claim_Type, long policy_Number, String insured_Name) {
		super();
		this.claim_Number = claim_Number;
		this.claim_Reason = claim_Reason;
		this.accident_Street = accident_Street;
		this.accident_City = accident_City;
		this.accident_State = accident_State;
		this.accident_Zip = accident_Zip;
		this.claim_Type = claim_Type;
		this.policy_Number = policy_Number;
		this.insured_Name = insured_Name;
	}

	public long getClaim_Number() {
		return claim_Number;
	}

	public void setClaim_Number(long claim_Number) {
		this.claim_Number = claim_Number;
	}

	public String getClaim_Reason() {
		return claim_Reason;
	}

	public void setClaim_Reason(String claim_Reason) {
		this.claim_Reason = claim_Reason;
	}

	public String getAccident_Street() {
		return accident_Street;
	}

	public void setAccident_Street(String accident_Street) {
		this.accident_Street = accident_Street;
	}

	public String getAccident_City() {
		return accident_City;
	}

	public void setAccident_City(String accident_City) {
		this.accident_City = accident_City;
	}

	public String getAccident_State() {
		return accident_State;
	}

	public void setAccident_State(String accident_State) {
		this.accident_State = accident_State;
	}

	public int getAccident_Zip() {
		return accident_Zip;
	}

	public void setAccident_Zip(int accident_Zip) {
		this.accident_Zip = accident_Zip;
	}

	public String getClaim_Type() {
		return claim_Type;
	}

	public void setClaim_Type(String claim_Type) {
		this.claim_Type = claim_Type;
	}

	public long getPolicy_Number() {
		return policy_Number;
	}

	public void setPolicy_Number(long policy_Number) {
		this.policy_Number = policy_Number;
	}

	public String getinsured_Name() {
		return insured_Name;
	}

	public void setinsured_Name(String insured_Name) {
		this.insured_Name = insured_Name;
	}

	@Override
	public String toString() {
		return "Claim [claim_Number=" + claim_Number + ", claim_Reason=" + claim_Reason + ", accident_Street="
				+ accident_Street + ", accident_City=" + accident_City + ", accident_State=" + accident_State
				+ ", accident_Zip=" + accident_Zip + ", claim_Type=" + claim_Type + ", policy_Number=" + policy_Number
				+ ", insured_Name=" + insured_Name + "]";
	}
	
	
	
	
	
	
}

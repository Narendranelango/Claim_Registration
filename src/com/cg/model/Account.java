package com.cg.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component(value="a1")
public class Account {
	
	private long accountNumber;
	
	//@Autowired
	private String userName;
	
	private String insured_Name;
	private String insured_Street;
	private String insured_City;
	private String insured_State;
	private int insured_Zip;
	private String bussiness_Type;
	
	public Account()
	{
		
	}
	
	public Account(long accountNumber, String userName) {
		super();
		this.accountNumber = accountNumber;
		this.userName = userName;
	}

	public Account(long accountNumber, String userName, String insured_Name, String insured_Street, String insured_City,
			String insured_State, int insured_Zip, String bussiness_Type) {
		super();
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.insured_Name = insured_Name;
		this.insured_Street = insured_Street;
		this.insured_City = insured_City;
		this.insured_State = insured_State;
		this.insured_Zip = insured_Zip;
		this.bussiness_Type = bussiness_Type;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getInsured_Name() {
		return insured_Name;
	}

	public void setInsured_Name(String insured_Name) {
		this.insured_Name = insured_Name;
	}

	public String getInsured_Street() {
		return insured_Street;
	}

	public void setInsured_Street(String insured_Street) {
		this.insured_Street = insured_Street;
	}

	public String getInsured_City() {
		return insured_City;
	}

	public void setInsured_City(String insured_City) {
		this.insured_City = insured_City;
	}

	public String getInsured_State() {
		return insured_State;
	}

	public void setInsured_State(String insured_State) {
		this.insured_State = insured_State;
	}

	public int getInsured_Zip() {
		return insured_Zip;
	}

	public void setInsured_Zip(int insured_Zip) {
		this.insured_Zip = insured_Zip;
	}

	public String getBussiness_Type() {
		return bussiness_Type;
	}

	public void setBussiness_Type(String bussiness_Type) {
		this.bussiness_Type = bussiness_Type;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", userName=" + userName + ", insured_Name=" + insured_Name
				+ ", insured_Street=" + insured_Street + ", insured_City=" + insured_City + ", insured_State="
				+ insured_State + ", insured_Zip=" + insured_Zip + ", bussiness_Type=" + bussiness_Type + "]";
	}
}

package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.dao.LoginDao;
import com.cg.model.UserRole;

@Component(value = "service")
public class LoginServiceImpl implements LoginService{
	String rcode;
	
	@Autowired
	private LoginDao logindao;
	
	@Override
	public boolean checkLoginCredentials(UserRole urole)
	{
		System.out.println("Inside Login Service");
		boolean value=false;
		String name=urole.getUserName();
		String pass=urole.getPassword();
		
		List<UserRole> list=new ArrayList();
		list=logindao.retrieveUserRole();

		for(UserRole user:list)
		{				
			if((user.getUserName().equals(name)==true) && user.getPassword().equals(pass)==true)
			{
				value=true;
				rcode=user.getRoleCode();
				break;
			}
		}
		return value;	
	}
	
	public String retrieveRoleCode()
	{
		return rcode;
	}
}


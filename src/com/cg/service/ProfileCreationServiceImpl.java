package com.cg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.dao.ProfileCreationDao;
import com.cg.model.UserRole;

@Component(value = "profileservice")
public class ProfileCreationServiceImpl implements ProfileCreationService {
	
	@Autowired
	private ProfileCreationDao profilecreationdao;
	
	@Override
	public boolean checkUserName(String userName)
	{
		System.out.println("Inside ProfileCreation Service");
		boolean value=false;
		List<UserRole> users=profilecreationdao.retrieveUserName(userName);
		for(UserRole user:users)
		{	
			if(user.getUserName().equals(userName))
			{
			value=true;
			}
		}
		return value;
	}

	/*@Override
	public boolean checkPassword(String password)
	{
		boolean pass=profilecreationdao.retrievePassword(password);
		return pass;

	}*/
	
	@Override
	public boolean insertProfile(UserRole userrole)
	{
		boolean insert=profilecreationdao.insertUserProfile(userrole);
		return insert;
	}
	
	
}

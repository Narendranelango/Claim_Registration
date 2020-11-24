package com.cg.dao;

import java.util.List;
import com.cg.model.UserRole;

public interface ProfileCreationDao 
{
	public List<UserRole> retrieveUserName(String userName);
	//public boolean retrievePassword(String password);
	public boolean insertUserProfile(UserRole userrole);
	
}

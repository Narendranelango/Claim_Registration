package com.cg.service;

import java.util.List;
import com.cg.model.UserRole;

public interface ProfileCreationService 
{
	public boolean checkUserName(String userName);
	//public boolean checkPassword(String password);
	public boolean insertProfile(UserRole userrole);



}

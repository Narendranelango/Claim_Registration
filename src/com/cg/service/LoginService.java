package com.cg.service;

import java.util.List;
import com.cg.model.UserRole;

public interface LoginService {
	
	public boolean checkLoginCredentials(UserRole uole);
	public String retrieveRoleCode();

}

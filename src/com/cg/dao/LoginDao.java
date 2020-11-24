package com.cg.dao;

import java.util.List;

import com.cg.model.Policy;
import com.cg.model.UserRole;

public interface LoginDao {
	public List<UserRole> retrieveUserRole();

}

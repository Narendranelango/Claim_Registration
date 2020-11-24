package com.cg.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.cg.model.UserRole;

@Component(value = "profiledao")
public class ProfileCreationDaoImpl implements ProfileCreationDao {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<UserRole> retrieveUserName(String userName) 
	{
		String query="select userName from userrole";
		List<UserRole> usernames=template.query(query,BeanPropertyRowMapper.newInstance(UserRole.class));	
		return usernames;
	}

	/*@Override
	public boolean retrievePassword(String password) 
	{
		String query="select password from userrole";
		List<UserRole> usernames=template.query(query,BeanPropertyRowMapper.newInstance(UserRole.class));	
		return pass;
	}*/

	@Override
	public boolean insertUserProfile(UserRole userrole) 
	{
		System.out.println("Inside ProfileCreation Dao");
		String query="insert into userrole values(?,?,?)";
		template.update(query,userrole.getUserName(),userrole.getPassword(),userrole.getRoleCode());
		return true;
	}

}

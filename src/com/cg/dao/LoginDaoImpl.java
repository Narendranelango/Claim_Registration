package com.cg.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cg.model.Policy;
import com.cg.model.UserRole;
import com.mysql.jdbc.PreparedStatement;

@Component(value = "dao")
public class LoginDaoImpl implements LoginDao{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<UserRole> retrieveUserRole()
	{	
		//template.update(sql,e.getId(),e.getFname(),e.getLname());	

		System.out.println("Inside Login Dao");
		String query="select * from UserRole";
		//List<UserRole> users=template.query(query, new UserRoleRowMapper());
		List<UserRole> users=template.query(query,BeanPropertyRowMapper.newInstance(UserRole.class));

		return users;
		
	  }
	}


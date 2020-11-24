package com.cg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.cg.model.UserRole;

public class UserRoleRowMapper implements RowMapper<UserRole>{

    public UserRole mapRow(ResultSet rs, int rowNumber) throws SQLException {
    	
       UserRole role = new UserRole();
       role.setUserName(rs.getString("userName"));
       role.setPassword(rs.getString("password"));
       role.setRoleCode(rs.getString("roleCode"));
 
       return role;
    }
} 

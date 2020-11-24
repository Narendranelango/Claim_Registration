package com.cg.jdbcutility;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class JdbcUtility {
	public static Connection getConnection() {

		Connection con = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/claim1";
		String username = "root";
		String password = "root";

		try 
		{
			Class.forName(driver);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		try 
		{
			//con = DriverManager.getConnection(url, username, password);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.cg.model.UserRole;
import com.cg.service.LoginService;

@Controller
public class LoginController {
	String str="";
	
	@Autowired
	private LoginService loginservice;
	
	@RequestMapping(value="/user.htm",method=RequestMethod.GET)
	public String showLoginForm(Map<String,UserRole> map) 
	{  
		map.put("urole", new UserRole());
		return "login";
	}
	
	@RequestMapping(value="/user.htm",method=RequestMethod.POST)
	//public String validateUserRole(@RequestParam("userName")String userName,@RequestParam("password")String password,Map map)
	//public String validateUserRole(@ModelAttribute("urole")UserRole urole,HttpServletRequest req,Map map)
	public String validateUserRole(@ModelAttribute("urole")UserRole urole,Map map)
	{
		String code;
		//UserRole urole =new UserRole(userName,password);
		//System.out.println("Username retrieved from HttpServletRequest"+req.getParameter("userName"));
		System.out.println("Inside Login Controller");
		System.out.println(urole);
		map.put("urole",urole);
		
		boolean val=loginservice.checkLoginCredentials(urole);
		
		if(val==true)
		{
			code=loginservice.retrieveRoleCode();
	
			if(code.equals("STD_INS")) {
				str="insured";
			}
			else if(code.equals("STD_AGT")) {
				str="agent";
			}
			if(code.equals("STD_ADM")) {
				str="admin";
			}
		}
		else
		{
			str="login";
		}
		return str;
	}
}

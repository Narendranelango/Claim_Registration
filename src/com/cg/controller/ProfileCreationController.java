package com.cg.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.cg.model.UserRole;
import com.cg.service.ProfileCreationService;

@Controller
public class ProfileCreationController {
	String str="";
	
	@Autowired
	private ProfileCreationService profilecreationservice;
	
	@RequestMapping(value="/create_profile.htm",method=RequestMethod.GET)
	public String createProfile(Map<String,UserRole> map)
	{
		String str="";
		System.out.println("Inside ProfileCreation Controller");
		map.put("userrole", new UserRole());
		
		return "create_profile";
	}	
	
	@RequestMapping(value="/create_profile.htm",method=RequestMethod.POST)
	public String createProfile(@ModelAttribute("profile")UserRole userrole,Map map,HttpServletRequest req)
	{	
		map.put("userrole",userrole);
		
		boolean user=profilecreationservice.checkUserName(userrole.getUserName());
		
		if(user==false)
		{
			//boolean pass=profilecreationservice.checkPassword(userrole.getPassword());
			boolean value=profilecreationservice.insertProfile(userrole);
			if(value==true)
			{	
				req.setAttribute("profile_success","Profile Created Successfully!!");
				str="create_profile";
			}
		}
		else
		{
			str="create_profile_already";
			req.setAttribute("user_name_exist","UserName already exists!! Try other UserName..");
		}
		return str;
	}
	
}

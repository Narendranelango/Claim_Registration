package com.cg.controller;

import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.cg.model.Claim;
import com.cg.model.UserRole;
import com.cg.service.ClaimCreateService;

@Controller
public class ClaimCreateController {
	
	@Autowired
	private ClaimCreateService claimservice;
	
	@Autowired
	ServletContext context; 
	
	/*Taking all details to register claim*/
	
	@RequestMapping(value="/create_claim.htm",method=RequestMethod.GET)
	public String showClaimForm(Map<String,Claim> map)
	{	
		System.out.println("Inside Claim Controller");
		map.put("claim", new Claim());

		return "create_claim";
	}
	
	@RequestMapping(value="/create_claim.htm",method=RequestMethod.POST)
	public String createClaimWithPolicy(@ModelAttribute("claim")Claim claim,Map map,HttpServletRequest req)
	{	
		String str="";
		
		map.put("claim",claim);
		boolean value=claimservice.checkPolicyNumber(claim.getPolicy_Number());
		
		if(value==false)
		{	
			long claim_Number=claimservice.registerClaim(claim);
			str="claim_details";
		}
		else
		{
			req.setAttribute("pol_num","Claim Already Generated!!");
			str="create_claim";
		}
				
		return str;
	}
	
	/*----------------------------------------------------------------------------*/
	/*Taking all details along with policy number directly to register claim*/
	
	@RequestMapping(value="/create_claim_auto.htm",method=RequestMethod.POST)
	//public String createClaim(@ModelAttribute("claim")Claim claim,Map map,HttpServletRequest request)
	public String showClaimForm(@ModelAttribute("claim")Claim claim,Map<String,Claim> map,HttpServletRequest req)
	{	
		
		map.put("claim",claim);	
		long policy_Number=(long)context.getAttribute("pol_num");
	
		long claim_Number=claimservice.registerClaim(claim,policy_Number);
				
		return "claim_details";
	}	

}

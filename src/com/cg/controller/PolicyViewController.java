package com.cg.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.cg.model.Policy;
import com.cg.service.PolicyViewService;

@Controller
public class PolicyViewController {
	
	@Autowired
	private PolicyViewService policyservice;
	
	@RequestMapping(value="/insured_policy.htm",method=RequestMethod.GET)
	public String viewPolicyOfInsured(@RequestParam("insured_name") String insured_Name,@RequestParam("role") String roleCode,HttpServletRequest req)
	{
		String str="";
		System.out.println("Inside Policy Controller ");
		req.setAttribute("insured_Name",insured_Name);
		req.setAttribute("role",roleCode);
		
		List<Policy> plist=policyservice.viewInsuredPolicyOfInsured(insured_Name);

		if(plist.isEmpty())
		{
			req.setAttribute("policy_details_insured","No Insured Policy !!");
			str="view_policies_insured";
		}
		else
		{
			req.setAttribute("policy_details_insured",plist);
			str= "view_policies_insured";
		}	
		return str;
	}
	
	@RequestMapping(value="/agent_policy.htm",method=RequestMethod.GET)
	public String viewPolicyOfAgent(@RequestParam("name") String userName,@RequestParam("role") String roleCode,HttpServletRequest req)
	{
		String str="";
		System.out.println("Inside Policy Controller ");
		req.setAttribute("userName",userName);
		req.setAttribute("role",roleCode);

		List<Policy> plist=policyservice.viewInsuredPolicyOfAgent(userName);
			
		if(plist.isEmpty())
		{
			req.setAttribute("policy_details_agent","No Insured Policy !!");
			str="view_policies_agent";
		}
		else
		{
			req.setAttribute("policy_details_agent",plist);
			str= "view_policies_agent";
		}	
		return str;
	}
	
	@RequestMapping(value="/admin_policy.htm",method=RequestMethod.GET)
	public String viewPolicyOfAdmin(@RequestParam("name") String userName,HttpServletRequest req)
	{
		String str="";
		System.out.println("Inside Policy Controller ");
		req.setAttribute("userName",userName);

		List<Policy> plist=policyservice.viewInsuredPolicyOfAdmin();
			
		if(plist.isEmpty())
		{
			req.setAttribute("policy_details_admin","No Insured Policy !!");
			str="view_policies_admin";
		}
		else
		{
			req.setAttribute("policy_details_admin",plist);
			str= "view_policies_admin";
		}	
		return str;
	}
	
	
	
	
}

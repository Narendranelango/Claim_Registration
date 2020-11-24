package com.cg.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.cg.model.Claim;
import com.cg.model.Policy;
import com.cg.service.ClaimViewService;

@Controller
public class ClaimViewController {
	
		@Autowired
		public ClaimViewService claimviewservice;
		
		@RequestMapping(value="/insured_viewclaim.htm",method=RequestMethod.GET)
		public String viewPolicyOfInsured(@RequestParam("insured_name") String insured_Name,HttpServletRequest req)
		{
			String str="";
			System.out.println("Inside  ClaimView Controller  ");
			req.setAttribute("insured_Name",insured_Name);
			
			List<Claim >viewclaim=claimviewservice.viewRegisteredClaimOfInsured(insured_Name);

			if(viewclaim.isEmpty())
			{
				req.setAttribute("view_claim_insured","No Registered Claims !!");
				str="view_claim_insured";
			}
			else
			{
				req.setAttribute("view_claim_insured",viewclaim);
				str= "view_claim_insured";
			}	
			return str;
		}
		
		@RequestMapping(value="/agent_viewclaim.htm",method=RequestMethod.GET)
		public String viewPolicy(@RequestParam("name") String userName,HttpServletRequest req)
		{
			String str="";
			System.out.println("Inside ClaimView Controller ");
			
			List<Claim >viewclaim=claimviewservice.viewRegisteredClaimOfAgent(userName);
			req.setAttribute("userName",userName);
			if(viewclaim.isEmpty())
			{
				req.setAttribute("view_claim_agent","No Registered Claims !!");
				str="view_claim_agent";
			}
			else
			{
				req.setAttribute("view_claim_agent",viewclaim);
				str= "view_claim_agent";
			}
			return str;
		}	
		
		@RequestMapping(value="/admin_viewclaim.htm",method=RequestMethod.GET)
		public String viewPolicyOfAdmin(@RequestParam("name") String userName,HttpServletRequest req)
		{
			String str="";
			System.out.println("Inside  ClaimView Controller  ");
			req.setAttribute("userName",userName);
			
			List<Claim >viewclaim=claimviewservice.viewRegisteredClaimOfAdmin();

			if(viewclaim.isEmpty())
			{
				req.setAttribute("view_claim_admin","No Registered Claims !!");
				str="view_claim_admin";
			}
			else
			{
				req.setAttribute("view_claim_admin",viewclaim);
				str= "view_claim_admin";
			}	
			return str;
		}
		
	}
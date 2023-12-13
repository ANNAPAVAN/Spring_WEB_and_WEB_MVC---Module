package com.pavan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("status")
public class LoginController{  
	
	
	@RequestMapping("/loginpage")
	public String loginPage(){ 
		return "loginform";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("uname") String uname, @RequestParam("upwd") String upwd,ModelMap map) {  
		
		if(uname.equals("pavan") && upwd.equals("pavan")) {
			map.addAttribute("status", "Login Successful");
		}else {
			map.addAttribute("status", "Login Failure");
		}
		
		return "status";
	}

}

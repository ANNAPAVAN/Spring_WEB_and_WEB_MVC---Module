package com.pavan.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@org.springframework.stereotype.Controller
public class LoginController{   //no need implements here when we use Annotations
	
	//Instead of two controller classes we can use single in case of Annotations
	
	@RequestMapping("/loginpage")
	public ModelAndView loginPage(){ // //the method name need not be handlerRequest when we are using Annotations	
		return new ModelAndView("loginform");
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {  //the method name need not be handlerRequest when we are using Annotations
		String uname= request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		
		ModelAndView mav=null;
		if(uname.equals("pavan") && upwd.equals("pavan")) {
			mav = new ModelAndView("success");
		}else {
			mav = new ModelAndView("failure");
		}
		
		return mav;
	}

}

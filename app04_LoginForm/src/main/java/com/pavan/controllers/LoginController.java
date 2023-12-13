package com.pavan.controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
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

package com.pavan.controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WishController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView("wish","message","Welcome to Spring WEB MVC World!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
											//"wish" --> logical name of view  //here (model_logicalname,key,value)
													//"message" --> is property name
													// its value is "Welcome to Spring WEB MVC World"
		return mav;
	}

}

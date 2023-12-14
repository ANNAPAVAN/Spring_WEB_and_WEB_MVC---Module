package com.pavan.controller;
import java.time.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		 LocalTime time = LocalTime.now();
		 int hour = time.getHour();
		 String wish_message="";
		 if(hour < 12) {
			 wish_message = "Good Morning !!!!!!!!!!";
		 }else if(hour <17 ) {
			 wish_message = "Good Afternoon !!!!!!!!!";
		 }else {
			 wish_message = "Good Evening !!!!!!!!!";
		 }
		return new ModelAndView("wish","message",wish_message);
	}

}

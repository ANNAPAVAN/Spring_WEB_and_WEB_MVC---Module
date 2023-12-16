package com.pavan.controller;

import com.pavan.command.user.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

public class LoginController extends AbstractCommandController {

	public LoginController() {
		setCommandClass(User.class);
		setCommandName("user");
	}
	
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException exception)
			throws Exception {
		ModelAndView mav = null;
		//Upto previous we got form data from request object now we are getting it from command object
		User user = (User)command;
		String uname= user.getUname();
		String upwd = user.getUpwd();
		if(uname.equals("pavan") && upwd.equals("pavan"))
		{
			mav = new ModelAndView("status","message","User Login Success");
		}else {
			mav = new ModelAndView("status","message","User Login Failure");
		}
		return mav;
	}

}

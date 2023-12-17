package com.pavan.controller;
import com.pavan.command.*;

import java.util.*;

import javax.naming.Binding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class UserController extends SimpleFormController {
	
	protected Map<String, Object> referenceData(HttpServletRequest request) throws Exception {
        Map<String, Object> referenceMap = new HashMap<>();
        List<String> uqual = new ArrayList<>();
        uqual.add("BSC");
        uqual.add("BTECT");
        uqual.add("MCA");
        uqual.add("MECT");
        uqual.add("PHD");
        referenceMap.put("uqual", uqual);
        
        List<String> uworklocations = new ArrayList<>();
        uworklocations.add("Hyd");
        uworklocations.add("Chennai");
        uworklocations.add("Banglore");
        uworklocations.add("Pune");
        referenceMap.put("uworklocations",uworklocations);
        
        List<String> uhobbies = new ArrayList<>();
        uhobbies.add("playing chess");
        uhobbies.add("listening songs");
        uhobbies.add("Reading books");
        uhobbies.add("Thinking");
        referenceMap.put("uhobbies", uhobbies);
        
        List<String> uprofessions = new ArrayList<>();
        uprofessions.add("Farmer");
        uprofessions.add("Employee");
        uprofessions.add("Student");
        uprofessions.add("Bussiness");
        referenceMap.put("uprofessions",uprofessions);
        
        return referenceMap;
    }
	
	protected ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindingResult Exception ) throws Exception{
		
		User user = (User)command;
		return new ModelAndView("registrationdetails","user",user);
	}
}

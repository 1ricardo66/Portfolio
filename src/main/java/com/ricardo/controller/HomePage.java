package com.ricardo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomePage {
	
	@RequestMapping(value="/routers", method=RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

}

package com.ricardo.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ricardo.dtos.EmailDto;
import com.ricardo.model.EmailModel;
import com.ricardo.service.EmailService;

@RestController
public class HomePage {
	@Autowired
	EmailService emailService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("index");
		return mv;
	}
	
	
	@RequestMapping(value="/teste", method=RequestMethod.GET)
	public ModelAndView teste () {
		ModelAndView mv = new ModelAndView("teste");
		mv.addObject("mv");
		return mv;
	}
	


}

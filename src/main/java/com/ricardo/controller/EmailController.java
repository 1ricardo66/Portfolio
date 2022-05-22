package com.ricardo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	EmailService emailService;
	
	
}

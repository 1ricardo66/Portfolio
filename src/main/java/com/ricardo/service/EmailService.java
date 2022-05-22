package com.ricardo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardo.repository.EmailRepository;

@Service
public class EmailService {
	
	@Autowired
	EmailRepository emailRepository;

}

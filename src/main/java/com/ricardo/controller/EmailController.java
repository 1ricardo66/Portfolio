package com.ricardo.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ricardo.dtos.EmailDto;
import com.ricardo.model.EmailModel;
import com.ricardo.service.EmailService;




@RestController
public class EmailController {

	@Autowired
	EmailService emailService;
	
	  //  JUST TO TEST APID ;P
	  /* @PostMapping("/sending-email")
	    public ResponseEntity<EmailModel> sendingEmail(@RequestBody  @Valid EmailDto emailDto) {
	        EmailModel emailModel = new EmailModel();
	        BeanUtils.copyProperties(emailDto, emailModel);
	        emailModel.setEmailFrom("1programming66@gmail.com");
	        emailModel.setEmailTo("ricardofps66@gmail.com");
	        emailService.sendEmail(emailModel);
	        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
	    }*/
	  
	  @PostMapping("/")
	    public String  saveEmail(@Valid EmailDto emailDto, RedirectAttributes attributes) {
	        EmailModel emailModel = new EmailModel();
	        BeanUtils.copyProperties(emailDto, emailModel);
	        emailModel.setEmailFrom("1programming66@gmail.com");
	        emailModel.setEmailTo("ricardofps66@gmail.com");
	        emailService.sendEmail(emailModel);
	        return emailModel.getStatusEmail().toString();
	    }
	
	/*@GetMapping("/emails")
    public ResponseEntity<Page<EmailModel>> getAllEmails(@PageableDefault(page = 0, size = 5, sort = "emailId", direction = Sort.Direction.DESC) Pageable pageable){
        return new ResponseEntity<>(emailService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/emails/{emailId}")
    public ResponseEntity<Object> getOneEmail(@PathVariable(value="emailId") UUID emailId){
        Optional<EmailModel> emailModelOptional = emailService.findById(emailId);
        if(!emailModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Email not found.");
        }else {
            return ResponseEntity.status(HttpStatus.OK).body(emailModelOptional.get());
        }
    }*/
	
}

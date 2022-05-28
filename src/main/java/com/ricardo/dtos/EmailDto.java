package com.ricardo.dtos;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;




public class EmailDto {

    //@NotBlank
    private String ownerRef;
    //@NotBlank
    @Email
    private String emailFrom;
    //@NotBlank
    @Email
    private String emailTo;
    //@NotBlank
    private String subject;
    //@NotBlank
    private String text;
    
    private String phone;
    
    private String sender;

	public String getOwnerRef() {
		return ownerRef;
	}

	public void setOwnerRef(String ownerRef) {
		this.ownerRef = ownerRef;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}
    
	
    
    
    
    

}
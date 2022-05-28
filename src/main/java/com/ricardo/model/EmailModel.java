package com.ricardo.model;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ricardo.enums.StatusEmail;



@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID emailId;
    private String ownerRef;
    private String emailFrom;
    private String phone;
    private String emailTo;
    private String subject;
    private String sender;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	public UUID getEmailId() {
		return emailId;
	}
	public void setEmailId(UUID emailId) {
		this.emailId = emailId;
	}
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDateTime getSendDateEmail() {
		return sendDateEmail;
	}
	public void setSendDateEmail(LocalDateTime sendDateEmail) {
		this.sendDateEmail = sendDateEmail;
	}
	public StatusEmail getStatusEmail() {
		return statusEmail;
	}
	public void setStatusEmail(StatusEmail statusEmail) {
		this.statusEmail = statusEmail;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(emailFrom, emailId, emailTo, ownerRef, phone, sendDateEmail, sender, statusEmail, subject,
				text);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailModel other = (EmailModel) obj;
		return Objects.equals(emailFrom, other.emailFrom) && Objects.equals(emailId, other.emailId)
				&& Objects.equals(emailTo, other.emailTo) && Objects.equals(ownerRef, other.ownerRef)
				&& Objects.equals(phone, other.phone) && Objects.equals(sendDateEmail, other.sendDateEmail)
				&& Objects.equals(sender, other.sender) && statusEmail == other.statusEmail
				&& Objects.equals(subject, other.subject) && Objects.equals(text, other.text);
	}
    
    
    
    
    
    
    
    
	
    
    
    
    
	
	
    
    
    
}
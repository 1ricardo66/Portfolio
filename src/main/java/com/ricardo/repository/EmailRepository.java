package com.ricardo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID>{
	
}
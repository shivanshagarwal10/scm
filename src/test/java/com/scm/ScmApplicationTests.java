package com.scm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.scm.services.EmailService;

import jakarta.validation.constraints.Email;

@SpringBootTest
class ScmApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private EmailService service;

	@Test 
	void sendEmailTest(){
		service.sendEmail("shivanshagrawal21@gmail.com", "Just managing the emails", "this is scm project working on email service");
	}

}

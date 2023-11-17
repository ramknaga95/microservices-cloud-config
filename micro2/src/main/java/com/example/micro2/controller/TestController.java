package com.example.micro2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${user.profile.active}")
	String activeProfile;
	
	@GetMapping("/profiles")
	public String profiles() {
		return activeProfile;
	}

}

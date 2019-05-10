package com.lifebank.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RestController;
import com.lifebank.pojo.login.request.LoginPojo;
@RestController

public class LoginController {
	
	@PostMapping("/login")
	public String login (@RequestBody LoginPojo login){
		
	}
	
}

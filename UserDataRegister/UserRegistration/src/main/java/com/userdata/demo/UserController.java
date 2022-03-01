package com.userdata.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@GetMapping("/users")
	public String viewHomePage( ) {
		return "kiran";
	}
	
	@PostMapping("/users/id")
	public String userdata() {
		return "succes";
	}
}

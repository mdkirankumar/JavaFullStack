package com.userdata.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userdata.demo.model.UserData;

@RestController
public class UserDataController {
	@PostMapping("/users")
	public String printUser(@RequestBody UserData user) {
	 return "success";	
	}

}

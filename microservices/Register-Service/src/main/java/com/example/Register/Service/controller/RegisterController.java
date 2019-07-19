package com.example.Register.Service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Register.Service.model.User;
import com.example.Register.Service.service.RegisterService;

public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return registerService.registerUser(user);
	}
	
	@PostMapping("/getUserByToken")
	public User userLogin(@RequestParam String userToken) {
		return registerService.getUserByToken(userToken);
	}

}

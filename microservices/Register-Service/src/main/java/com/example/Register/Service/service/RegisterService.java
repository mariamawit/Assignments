package com.example.Register.Service.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Register.Service.model.User;
import com.example.Register.Service.repository.RegisterRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

public class RegisterService {
	
	@Autowired
	private RegisterRepository registerrepo;

	public User loginUser(User user) {

		user.setAuthToken("SAMPLE_VALID_TOKEN");
		return this.registerrepo.getUserForLogin(user);
	}

	@HystrixCommand(fallbackMethod = "registerFallBack")
	public User registerUser(User user) {
		return this.registerrepo.registerUser(user);
	}

	@HystrixCommand(fallbackMethod = "getUserByTokenFallBack")
	public User getUserByToken(String userToken) {
		return registerrepo.getUserByToken(userToken);
	}

	public String registerFallBack() {
		return "Fallback for registration.";
	}

	public String getUserByTokenFallBack() {
		return "FallBack for getting user by token";
	}

}

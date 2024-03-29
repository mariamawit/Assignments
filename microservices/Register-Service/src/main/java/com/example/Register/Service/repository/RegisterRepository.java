package com.example.Register.Service.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.Register.Service.model.User;

public class RegisterRepository {
	
	static List<User> users = new ArrayList<>();
	static User loggedUser = new User(null, null);


	public static User getUserForLogin(User user) {
		if (users.contains(user)) {
			loggedUser = user;
			return user;
		} else {
			loggedUser = null;
			return null;
		}

	}
	
	public static User registerUser(User user) {
		users.add(user);
		
		return user;
	}

	public User getUserByToken(String userToken) {
		return users.stream().filter(pr -> pr.getAuthToken().equals(userToken)).findAny().get();
	}

}

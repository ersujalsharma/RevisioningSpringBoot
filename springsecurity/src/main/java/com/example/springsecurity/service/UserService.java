package com.example.springsecurity.service;

import org.springframework.stereotype.Service;

import com.example.springsecurity.entity.User;
import com.example.springsecurity.repo.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public void createUser(String username, String password) {
		User user = new User();
		if(userRepository.findByUsername(username) != null) {
			throw new IllegalArgumentException("User already exists");
		}
		user.setUsername(username);
		user.setPassword(password);
		userRepository.save(user);
	}
	// login
	public User authenticate(String username,String password) {
		User user = userRepository.findByUsername(username);
		if(user == null) {
			throw new IllegalArgumentException("User not found");
		}
		if(!user.getPassword().equals(password)) {
			throw new IllegalArgumentException("Invalid password");
		}
		return user;
	}
}

package com.example.demo.user;

import org.springframework.stereotype.Component;

@Component // To create bean, but by default it creates singleton
public class User {
	public User() {
		System.out.println("User Bean");
	}
}

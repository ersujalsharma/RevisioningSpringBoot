package com.example.demo.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.user.Account;
import com.example.demo.user.User;
@Component
public class Bank {
	@Autowired
	User user1;
	@Autowired
	User user2;
	@Autowired
	@Qualifier(value = "currentAccount")
	Account account; // 
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		System.out.println(account.getClass().getName());
	}
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bank.Bank;


@SpringBootApplication
public class BeanCreationApplication implements CommandLineRunner{
	@Autowired
	Bank bank;
	
	public static void main(String[] args) {
		SpringApplication.run(BeanCreationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bank.display();
	}
	

}

package com.example.demo.user;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // else we can use @Qualified on Field
public class SavingAccount implements Account{

}

package com.hostmdy.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
	
	public static final String HELLO_WORD ="Hello From constructor Greeting Service";
	
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_WORD;
	}
}

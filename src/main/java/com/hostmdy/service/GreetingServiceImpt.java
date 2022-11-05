package com.hostmdy.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpt implements GreetingService {
	
	public static final String HELLO_WORD ="Hello From original Greeting Service";
	
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_WORD;
	}

}

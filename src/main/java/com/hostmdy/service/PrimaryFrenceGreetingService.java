package com.hostmdy.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hostmdy.di.repository.GreetingRepository;


public class PrimaryFrenceGreetingService implements GreetingService{
	
	private final GreetingRepository greetingRepository;
	
	

	public PrimaryFrenceGreetingService(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}



	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return greetingRepository.getPrimaryFrenceGreeting();
	}
}

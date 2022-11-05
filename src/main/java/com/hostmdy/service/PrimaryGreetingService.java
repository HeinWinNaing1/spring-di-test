package com.hostmdy.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hostmdy.di.repository.GreetingRepository;


public class PrimaryGreetingService implements GreetingService{
	
	private final GreetingRepository greetingRepository;
	
	

	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}



	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return greetingRepository.getPrimaryEnglishGreeting();
	}
}

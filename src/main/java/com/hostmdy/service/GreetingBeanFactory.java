package com.hostmdy.service;

import com.hostmdy.di.repository.GreetingRepository;

public class GreetingBeanFactory {
	
	private final GreetingRepository greetingRepository;

	public GreetingBeanFactory(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}
	
	public GreetingService createGreetingBean(String language) {
		return switch (language) {
		case "en" -> new PrimaryGreetingService(greetingRepository);
		case "fr" -> new PrimaryFrenceGreetingService(greetingRepository);
		case "es" -> new PrimarySpanishGreetingService(greetingRepository);
		default -> new PrimaryGreetingService(greetingRepository);
		
		};
	}

}

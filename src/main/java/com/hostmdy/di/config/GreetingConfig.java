package com.hostmdy.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.hostmdy.di.repository.GreetingRepository;
import com.hostmdy.service.GreetingBeanFactory;
import com.hostmdy.service.GreetingService;

@Configuration
public class GreetingConfig {
	private final GreetingRepository greetingRepository;

	public GreetingConfig(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}
	
	@Bean
	GreetingBeanFactory greetingBeanFactory() {
		return new GreetingBeanFactory(greetingRepository);
	}
	
	@Bean
	@Primary
	@Profile({"default","en"})
	GreetingService primaryGreeting() {
		return greetingBeanFactory().createGreetingBean("en");
	}
	
	@Bean
	@Primary
	@Profile("fr")
	GreetingService primaryFrenchGreeting() {
		return greetingBeanFactory().createGreetingBean("fr");
	}
	
	@Bean
	@Primary
	@Profile("es")
	GreetingService primarySpanishGreeting() {
		return greetingBeanFactory().createGreetingBean("es");
	}
}

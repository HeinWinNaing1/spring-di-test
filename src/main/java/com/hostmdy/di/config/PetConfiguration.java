package com.hostmdy.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.hostmdy.service.CatServiceImpl;
import com.hostmdy.service.RabbitServiceImpl;

@Configuration
public class PetConfiguration {
	
	@Bean
	public CatServiceImpl catServiceImpl() {
		return new CatServiceImpl();
	}
	
	@Bean
	@Primary
	public RabbitServiceImpl rabbitServiceImpl() {
		return new RabbitServiceImpl();
	}

}

package com.hostmdy.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hostmdy.service.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayHello();
	}
	
	@Autowired
	public ConstructorInjectedController(/*@Qualifier("constructorGreetingService")*/ GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	
	
}

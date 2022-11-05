package com.hostmdy.di.cotroller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.di.controller.ConstructorInjectedController;
import com.hostmdy.service.GreetingServiceImpt;

class ConstructorInjectedControllerTest {
	
	private ConstructorInjectedController constructorInjectedController;
	
	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpt greetingServiceImpt = new GreetingServiceImpt();
		constructorInjectedController = new ConstructorInjectedController(greetingServiceImpt);
	}

	@Test
	void test() {
		assertEquals(GreetingServiceImpt.HELLO_WORD,constructorInjectedController.sayHello());
	}

}

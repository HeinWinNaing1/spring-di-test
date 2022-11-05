package com.hostmdy.di.cotroller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.di.controller.PropertyInjectedController;
import com.hostmdy.service.GreetingServiceImpt;

class PropertyInjectedControllerTest {
	
	private PropertyInjectedController propertyInjectedController = new PropertyInjectedController();
	
	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpt greetingServiceImpt = new GreetingServiceImpt();
		propertyInjectedController.greetingService = greetingServiceImpt;
	}

	@Test
	void test() {
		assertEquals(GreetingServiceImpt.HELLO_WORD,propertyInjectedController.sayHello());
	}

}

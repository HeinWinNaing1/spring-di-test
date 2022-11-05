package com.hostmdy.di.cotroller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hostmdy.di.controller.SetterInjectedController;
import com.hostmdy.service.GreetingServiceImpt;

class SetterInjectedControllerTest {
	
	private SetterInjectedController setterInjectedController = new SetterInjectedController();

	@BeforeEach
	void setUp() throws Exception {
		GreetingServiceImpt greetingService = new GreetingServiceImpt();
		setterInjectedController.setGreetingService(greetingService);
	}

	@Test
	void test() {
		assertEquals(GreetingServiceImpt.HELLO_WORD,setterInjectedController.sayHello());
	}

}

package com.hostmdy.di.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getPrimaryEnglishGreeting() {
		// TODO Auto-generated method stub
		return "Hello Primary Greeting";
	}

	@Override
	public String getPrimaryFrenceGreeting() {
		// TODO Auto-generated method stub
		return "Bonjour salutation primaire";
	}

	@Override
	public String getPrimarySpanishGreeting() {
		// TODO Auto-generated method stub
		return "Hola saludo de primaria";
	}
	

}

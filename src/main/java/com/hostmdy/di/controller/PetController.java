package com.hostmdy.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hostmdy.service.PetService;

@Controller
public class PetController {
	
	private final PetService petService;
	
	@Autowired
	public PetController(PetService petService) {
		super();
		this.petService = petService;
	}
	
	public String getPetType() {
		return petService.getPetType();
	}
	
	
	
	
	
	

}

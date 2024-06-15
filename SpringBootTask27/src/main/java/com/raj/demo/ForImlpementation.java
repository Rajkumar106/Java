package com.raj.demo;

import org.springframework.stereotype.Component;

@Component
public class ForImlpementation implements ForService{

	@Override
	public String profile() {
		return "Working as a Software Developer";
	}

}

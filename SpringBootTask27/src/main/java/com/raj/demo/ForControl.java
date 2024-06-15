package com.raj.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForControl {
	
	@Autowired
	ForImlpementation imple;
	
	@GetMapping("/profile")
	public String returning() {
		String res=imple.profile();
		return res;
	}
}

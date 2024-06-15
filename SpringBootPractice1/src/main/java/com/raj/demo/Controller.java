package com.raj.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

	@GetMapping("/raj")
	public String hello() {
		return "hello world";
	}
}

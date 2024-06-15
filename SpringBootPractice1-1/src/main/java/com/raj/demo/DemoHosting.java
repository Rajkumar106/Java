package com.raj.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoHosting {

	@GetMapping("/")
	public String callMe() {
		return "Hello world ,byee";
	} 
	

}

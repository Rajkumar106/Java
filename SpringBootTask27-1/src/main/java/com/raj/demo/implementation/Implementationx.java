package com.raj.demo.implementation;

import org.springframework.stereotype.Component;

import com.raj.demo.service.ServiceDemo;


@Component
public class Implementationx implements ServiceDemo {

	@Override
	public String name() {
		return "Hi Iam Rajkumar S";
	}

}

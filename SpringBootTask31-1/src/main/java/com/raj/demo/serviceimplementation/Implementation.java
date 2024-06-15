package com.raj.demo.serviceimplementation;

import org.springframework.stereotype.Component;

import com.raj.demo.modelclass.ModelClass;
import com.raj.demo.service.ServiceIn;


@Component
public class Implementation implements ServiceIn {

	@Override
	public ModelClass getDetails(ModelClass v) {
		return v;
	}

}

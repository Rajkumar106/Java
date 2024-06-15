package com.raj.demo.service;

import org.springframework.stereotype.Service;

import com.raj.demo.modelclass.ModelClass;

@Service
public interface ServiceIn {
	
	ModelClass getDetails(ModelClass v);

}

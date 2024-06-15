package com.raj.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.demo.Entity.Customer;
import com.raj.demo.repository.CustRepo;

@Service
public class CustService {
	
	@Autowired
	CustRepo custRepo;
	
	public List<Customer> getDatas(){
		List<Customer> all = custRepo.findAll();
		System.out.println(all);
		return custRepo.findAll();
	}
	
	public String deleteData(int id) {
		
		custRepo.deleteById(id);
		return "Deleted Successfully";
		
	}

}

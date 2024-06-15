package com.raj.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.demo.Entity.Customer;

@Repository
public interface CustRepo extends JpaRepository<Customer, Integer>{

}

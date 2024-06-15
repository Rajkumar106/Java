package com.raj.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.demo.model.Sample;

@Repository
public interface SampleRepo extends JpaRepository<Sample, Integer> {
	
	

}

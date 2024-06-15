package com.raj.demo.repository;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.demo.bus1entity.Bus1PassengerEntity;

@Repository
public interface Bus1Repository extends JpaRepository<Bus1PassengerEntity, Integer>{

	int countBookingsByDate(Date date);

	//Optional<Bus1PassengerEntity> findById(String name);

}

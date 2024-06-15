package com.raj.demo.repository2;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.demo.bus1entity.Bus1PassengerEntity;
import com.raj.demo.bus2entity.Bus2PassengersEntity;

@Repository
public interface Bus2Repository extends JpaRepository<Bus2PassengersEntity, Integer>{

	int countBookingsByDate(Date date);

	//Optional<Bus1PassengerEntity> findById(String name);

}

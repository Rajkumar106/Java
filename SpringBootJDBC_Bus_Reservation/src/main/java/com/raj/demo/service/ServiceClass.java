package com.raj.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.demo.bus1entity.Bus1PassengerEntity;
import com.raj.demo.bus2entity.Bus2PassengersEntity;
import com.raj.demo.repository.Bus1Repository;
import com.raj.demo.repository2.Bus2Repository;

@Service
public class ServiceClass {
	
	@Autowired
	Bus1Repository repository1;
	
	@Autowired
	Bus2Repository repository2;
	
	
	
	public String createBookingBus1(Bus1PassengerEntity bus1PassengerEntity) {
        int bookedSeats = repository1.countBookingsByDate(bus1PassengerEntity.getDate());
        if (bookedSeats < 3) { // Assuming bus has a capacity of 3 seats
            repository1.save(bus1PassengerEntity)
            ;
            System.out.println(bus1PassengerEntity.getDate());
            return "Booking is confirmed." + " Your Booking id is :"+bus1PassengerEntity.getId();
        } else {
            return "Sorry, the bus is full. Try another bus.";
        }
    }	
	
	
	public String createBookingBus2(Bus2PassengersEntity bus2PassengersEntity) {
        int bookedSeats = repository2.countBookingsByDate(bus2PassengersEntity.getDate());
        if (bookedSeats < 3) { // Assuming bus has a capacity of 3 seats
            repository2.save(bus2PassengersEntity);
            return "Booking is confirmed." + " Your Booking id is :"+bus2PassengersEntity.getId();
        } else {
            return "Sorry, the bus is full. Try another bus.";
        }
    }
	
	public String deleteBus1Booking(int id) {
		if(repository1.existsById(id)) {
			repository1.deleteById(id);
			return "Your Booking has been Cancelled successfully";
		}else {
			return "Booking id not found";
		}
	}
	
	public String deleteBus2Booking(int id) {
		if(repository2.existsById(id)) {
			repository2.deleteById(id);
			return "Your Booking has been Cancelled successfully";
		}else {
			return "Booking id not found";
		}
	}
	
	public String getBus1BookingDetails(int id) {
		if(repository1.existsById(id)) {
			return "Your Booking Details : "+repository1.findById(id);
		}else {
			return "Booking not found";
		}
	}
	
	public String getBus2BookingDetails(int id) {
		if(repository2.existsById(id)) {
			return "Your Booking Details : "+repository2.findById(id);
		}else {
			return "Booking not found";
		}
	}
	
	public String updateBus1(Bus1PassengerEntity bus1PassengerEntity) {
		
		if(repository1.existsById(bus1PassengerEntity.getId())) 
		{
			Bus1PassengerEntity entityUpdate1 = repository1.findById(bus1PassengerEntity.getId()).orElse(null);
			if(entityUpdate1!=null) 
			{
				entityUpdate1.setName(bus1PassengerEntity.getName());
				entityUpdate1.setDate(bus1PassengerEntity.getDate());
				entityUpdate1.setOrigin(bus1PassengerEntity.getOrigin());
				entityUpdate1.setDestination(bus1PassengerEntity.getDestination());
				repository1.save(entityUpdate1);
				return "Your Data has been successfully updated... " +" Here your updated details " + repository1.findById(bus1PassengerEntity.getId());
			}	
		}
		return "Booking not found";
		}
	
public String updateBus2(Bus2PassengersEntity bus2PassengersEntity) {
		
		if(repository2.existsById(bus2PassengersEntity.getId())) 
		{
			Bus2PassengersEntity entityUpdate2 = repository2.findById(bus2PassengersEntity.getId()).orElse(null);
			if(entityUpdate2!=null) 
			{
				entityUpdate2.setName(bus2PassengersEntity.getName());
				entityUpdate2.setDate(bus2PassengersEntity.getDate());
				entityUpdate2.setOrigin(bus2PassengersEntity.getOrigin());
				entityUpdate2.setDestination(bus2PassengersEntity.getDestination());
				repository2.save(entityUpdate2);
				return "Your Data has been successfully updated..."+" Here your updated details " + repository2.findById(bus2PassengersEntity.getId());
			}	
		}
		return "Booking not found";
		}

	
	
	}
	


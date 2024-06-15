package com.raj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raj.demo.bus1entity.Bus1PassengerEntity;
import com.raj.demo.bus2entity.Bus2PassengersEntity;
import com.raj.demo.service.ServiceClass;

@RestController
public class Controller {
	
	@Autowired
	ServiceClass serviceClass;
	

	@PostMapping("/bus1Booking")
	public String bookingBus1(@RequestBody Bus1PassengerEntity bus1PassengerEntity) {
		return serviceClass.createBookingBus1(bus1PassengerEntity);
		
	}
	
	@PostMapping("/bus2Booking")
	public String bookingBus2(@RequestBody Bus2PassengersEntity bus2PassengersEntity) {
		return serviceClass.createBookingBus2(bus2PassengersEntity);
		
	}
	
	
	@DeleteMapping("/bus1CancelBooking/{id}")
	public String cancelBus1(@PathVariable int id) {
		return serviceClass.deleteBus1Booking(id);
	}
	
	@DeleteMapping("/bus2CancelBooking/{id}")
	public String cancelBus2(@PathVariable int id) {
		return serviceClass.deleteBus2Booking(id);
	}
	
	@GetMapping("/getBus1Booking/{id}")
	public String bookingInfoBus1(@PathVariable int id) {
		return serviceClass.getBus1BookingDetails(id);
		
	}
	
	@GetMapping("/getBus2Booking/{id}")
	public String bookingInfoBus2(@PathVariable int id) {
		return serviceClass.getBus1BookingDetails(id);
		
	}
	
	@PutMapping("/updateBus1")
	public String updattingB1(@RequestBody Bus1PassengerEntity bus1PassengerEntity) {
		return serviceClass.updateBus1(bus1PassengerEntity);
	}
	
	@PutMapping("/updateBus2")
	public String updattingB2(@RequestBody Bus2PassengersEntity bus2PassengersEntity) {
		return serviceClass.updateBus2(bus2PassengersEntity);
	}
	

}

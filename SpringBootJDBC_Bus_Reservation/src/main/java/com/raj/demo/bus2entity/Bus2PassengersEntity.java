package com.raj.demo.bus2entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BUS2")
public class Bus2PassengersEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "PASSENGER_ID")
	private int id;
	
	@Column(name = "PASSENGER_NAME")
	private String name;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	@Column(name = "TRAVEL_DATE")
	private Date date;
	
	@Column(name = "ORIGIN")
	private String origin;
	
	@Column(name = "DESTINATION")
	private String destination;
	
}


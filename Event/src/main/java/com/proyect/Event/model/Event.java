package com.proyect.Event.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvent;
	private String name;
	private BigDecimal price;
	private String shortDescription;
	private String longDescription;
	private int year;
	private String time;
	private String genre;
	private String accessArrange;
	private String[] enclosure = new String[4];
	
	//enclosure[0] = name
	//enclosure[1] = city
	//enclosure[2] = direction
	//enclosure[3] = capacity
	
}

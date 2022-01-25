package com.proyect.Event.response;

import java.io.Serializable;

import lombok.Data;

//Aqui es donde trabajamos con los DTO
@Data
public class EventResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private String code;
	private String name;
	private String price;
	private String short_description;
	private String long_description;
	private String date;
	private String time;
	private String genre;
	private String policy;
	private String[] venue = new String[4];

	
	
	
}

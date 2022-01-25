package com.proyect.Event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyect.Event.Services.EventServices;
import com.proyect.Event.adapter.EventAdapter;
import com.proyect.Event.response.EventResponse;

public class EventController {

	@Autowired
	private EventServices eventServices;
	
	@Autowired
	private EventAdapter eventAdapter;
	

	@GetMapping("/events")
	public List<EventResponse> findAll(){
		
		return eventServices.findAll();
	}
}

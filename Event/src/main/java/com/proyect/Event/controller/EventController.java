package com.proyect.Event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
	
	@DeleteMapping("/deleteEvent/{code}")
	public void deleteUser(@PathVariable String code) {
		eventServices.deleteEvent(code);
	}
}

package com.proyect.Event.controller;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.proyect.Event.Services.EventServices;
import com.proyect.Event.adapter.EventAdapter;
import com.proyect.Event.model.Event;
import com.proyect.Event.response.EventResponse;

@RestController

@RequestMapping("/event")
public class EventController {
	
	private static final Logger log = LoggerFactory.getLogger(EventController.class);
	
	@Autowired
	private EventServices eventServices;
	
	@Autowired
	private EventAdapter eventAdapter;
	

	@GetMapping("/events")
	public List<EventResponse> findAll(){
		
		return eventServices.findAll();
	}
	
	@PutMapping
	public Event save(Event event) {
		return eventServices.save(event);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addEvent(@RequestBody Event event) {
		Event result = this.save(event);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{code}").buildAndExpand(result.getCode())
				.toUri();
		
		return ResponseEntity.created(location).build();
  }

	@DeleteMapping("/deleteEvent/{code}")
	public void deleteUser(@PathVariable String code) {
		eventServices.deleteEvent(code);

	}

	//Actualizar juego
		@PutMapping("/{code}")
		public void updateGame(@RequestBody Event event, @PathVariable String code) {
			
				eventServices.deleteEvent(code);
				eventServices.save(event);
					
		}
}

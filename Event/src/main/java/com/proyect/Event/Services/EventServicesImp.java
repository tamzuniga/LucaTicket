package com.proyect.Event.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.Event.model.Event;
import com.proyect.Event.repository.EventRepository;

@Service
public class EventServicesImp implements EventServices{
	
	@Autowired
	EventRepository er;
	
	@Override
	public Event save(Event event) {
		
		return er.save(event);
	}
}

package com.proyect.Event.Services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.Event.adapter.EventAdapter;
import com.proyect.Event.repository.EventRepository;

@Service
public class EventServicesImp implements EventServices{
	
	@Autowired
	EventRepository er;
	
	@Override
	public EventAdapter save(EventAdapter eventAdapter) {
		
		return er.save(eventAdapter);
		
	}
	
	//UPDATE
	@Override
	public EventAdapter inserts(EventAdapter eventAdapter) {
		return er.insert(save(eventAdapter));
	}
}

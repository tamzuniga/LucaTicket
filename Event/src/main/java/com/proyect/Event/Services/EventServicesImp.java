package com.proyect.Event.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.Event.adapter.EventAdapter;
import com.proyect.Event.model.Event;
import com.proyect.Event.repository.EventRepository;
import com.proyect.Event.response.EventResponse;


public class EventServicesImp implements EventServices{
	
	@Autowired
	EventRepository er;
	
	@Autowired
	EventAdapter eventAdapter;
	
	@Override
	public EventAdapter save(EventAdapter eventAdapter) {
		
		return er.save(eventAdapter);
		
	}
	
	//UPDATE
	@Override
	public EventAdapter inserts(EventAdapter eventAdapter) {
		return er.insert(save(eventAdapter));
	}

	@Override
	public List<EventResponse> findAll() {
		final List<Event> all = er.findAll();
		return eventAdapter.of(all);
	}

}

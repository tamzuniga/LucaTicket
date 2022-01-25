package com.proyect.Event.Services;

import java.util.List;

import com.proyect.Event.adapter.EventAdapter;
import com.proyect.Event.model.Event;
import com.proyect.Event.response.EventResponse;

public interface EventServices {

  public Event save(Event event);
	public EventAdapter inserts(EventAdapter eventAdapter);
	public List<EventResponse> findAll();
  
}
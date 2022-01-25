package com.proyect.Event.Services;


import java.util.List;

import com.proyect.Event.model.Event;
import com.proyect.Event.response.EventResponse;

public interface EventServices {

	public Event save(Event event);
	
	//Listar Eventos
	
	public List<EventResponse> findAll();
}

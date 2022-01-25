package com.proyect.Event.Services;


import java.util.Optional;

import com.proyect.Event.adapter.EventAdapter;

public interface EventServices {

	public EventAdapter save(EventAdapter eventAdapter);
	public EventAdapter inserts(EventAdapter eventAdapter);
}

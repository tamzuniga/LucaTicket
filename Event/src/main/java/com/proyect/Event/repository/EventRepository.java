package com.proyect.Event.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proyect.Event.model.Event;


public interface EventRepository extends MongoRepository<Event, String>{

	
}

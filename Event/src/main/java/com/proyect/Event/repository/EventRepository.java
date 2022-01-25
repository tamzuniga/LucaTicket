package com.proyect.Event.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proyect.Event.adapter.EventAdapter;


public interface EventRepository extends MongoRepository<EventAdapter, String>{

	
}

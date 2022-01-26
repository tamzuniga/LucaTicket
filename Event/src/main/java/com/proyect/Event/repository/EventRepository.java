package com.proyect.Event.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.proyect.Event.model.Event;

@Repository
public interface EventRepository extends MongoRepository<Event, String>{

	Long deleteEventByCode(String code);
}

package com.proyect.User.controller;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.proyect.User.model.User;
import com.proyect.User.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);


	@Autowired
	private UserService us;
	
	@PutMapping
	public User save(User user) {
		return us.newUser(user);
	}

	@PostMapping("/add")
	public ResponseEntity<?> newUser(@RequestBody User user) {
		log.info("------ adding new User (POST) ");
		User u = this.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(u.getId()).toUri();
		log.info("------ new user ADDED) ");
		return ResponseEntity.created(location).build();
	}
}

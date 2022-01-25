package com.proyect.User.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.proyect.User.model.User;
import com.proyect.User.response.UserResponse;

@Component
public class UserAdapter {

	public UserResponse of(User user) {
		
		UserResponse userResponse = new UserResponse();
		userResponse.setId(user.getId());
		userResponse.setDate(user.getDate());
		userResponse.setName(user.getName());
		userResponse.setLastName(user.getLastName());
		userResponse.setMail(user.getMail());
		userResponse.setPassword(user.getPassword());
		
		return userResponse;
		
	}
	
	public List<UserResponse> of(List<User> users) {
		return users.stream()
				.map(p -> of(p))
				.collect(Collectors.toList());
		
	}
}

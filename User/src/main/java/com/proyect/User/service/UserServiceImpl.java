package com.proyect.User.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.User.model.User;
import com.proyect.User.repository.UserRepository;
import com.proyect.User.response.UserResponse;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserResponse ur;
	@Autowired
	private UserRepository ury;

	@Override
	public User newUser(User user) {
		// TODO Auto-generated method stub
		return ury.save(user);
	}

}
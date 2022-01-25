package com.proyect.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyect.User.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

}

package com.proyect.User.response;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class UserResponse implements Serializable {

	private static final long serialVersionUIS = 1L;
	
	private int id;
	private String name;
	private String lastName;
	private String mail;
	private String password;
	private String date;
}

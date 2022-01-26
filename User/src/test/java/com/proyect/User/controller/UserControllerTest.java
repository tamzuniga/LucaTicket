package com.proyect.User.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;

class UserControllerTest {

	
	@Test
	void shouldReturn201WhenPostNewUser() {
		JSONObject request = new JSONObject();
		request.put("name", "sebastian");
		request.put("lastname", "guapo");
		request.put("mail", "sebastian");
		request.put("password", "guapo");
		request.put("date", "guapo");
		
		RestAssured.baseURI = "http://localhost:8888";
		
		RestAssured.given().header("Content-Type", "aplication/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON).body(request.toJSONString()).when().post("/user/add/").then().statusCode(201)
		.log().all();
		
	}
	

	@Test
	void shouldReturn500WhenPostNewUser() {
		JSONObject request = new JSONObject();
		request.put("name", "sebastian");
		request.put("lastname", "guapo");
		request.put("mail", "sebastian");
		request.put("password", "guapo");
		request.put("dare", "pepe");
		
		RestAssured.baseURI = "http://localhost:8888";
		
		RestAssured.given().header("Content-Type", "aplication/json").contentType(ContentType.JSON)
		.accept(ContentType.JSON).body(request.toJSONString()).when().post("/user/add/").then().statusCode(500)
		.log().all();
		
	}

}

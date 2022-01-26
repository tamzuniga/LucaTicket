package com.proyect.Event.controller.exceptions;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler{
//Tenemos un logger embebido
	
	@ExceptionHandler(EventNotFound.class)
	public void springHandleNotFound(HttpServletResponse response) throws IOException {
		logger.info("------ EventNotFoundException() ");
		
		response.sendError(HttpStatus.NOT_FOUND.value());
	}
	
}

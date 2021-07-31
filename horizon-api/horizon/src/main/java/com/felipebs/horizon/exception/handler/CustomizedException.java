package com.felipebs.horizon.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.felipebs.horizon.exception.InvalidAuthenticationException;

public class CustomizedException {
	@ExceptionHandler(InvalidAuthenticationException.class)
	public final ResponseEntity<ExceptionResponse> invalidJwtAuthenticationException(Exception ex, WebRequest request) {
		ExceptionResponse exceptionResponse = 
				new ExceptionResponse(
						new Date(),
						ex.getMessage(),
						request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
}

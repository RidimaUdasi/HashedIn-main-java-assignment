package com.riudasi.miniJavaAssignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.riudasi.miniJavaAssignment.exceptions.MovieRatingNotFoundException;
import com.riudasi.miniJavaAssignment.exceptions.UnauthorizedException;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value = MovieRatingNotFoundException.class)
	public ResponseEntity<Object> exception(MovieRatingNotFoundException exception) {
	      return new ResponseEntity<>("Movie Rating not found", HttpStatus.NOT_FOUND);
	   }
	
	@ExceptionHandler(value = UnauthorizedException.class)
	public ResponseEntity<Object> unauthrizedException(UnauthorizedException exception) {
	      return new ResponseEntity<>("Invalied access token", HttpStatus.UNAUTHORIZED);
	   }
}

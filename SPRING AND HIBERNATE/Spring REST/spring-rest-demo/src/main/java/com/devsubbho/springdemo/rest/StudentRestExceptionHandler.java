package com.devsubbho.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsubbho.springdemo.entity.StudentErrorResponse;

@ControllerAdvice
public class StudentRestExceptionHandler {

	// Add an exception handler:
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception){
			
			
			// Create a StudentErrorResponse
			StudentErrorResponse error = new StudentErrorResponse();
			error.setStatus(HttpStatus.NOT_FOUND.value());
			error.setMessage(exception.getMessage());
			error.setTimeStamp(System.currentTimeMillis());
			
			// Return ResponseEntity
			
			return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		}
}

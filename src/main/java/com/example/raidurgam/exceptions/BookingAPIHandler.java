package com.example.raidurgam.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.raidurgam.ErrorMessages;


@RestControllerAdvice
public class BookingAPIHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorMessages> methodArgumentNotValidException(MethodArgumentNotValidException exception)
	{
	    System.out.println("Exception at method argument not valid");
	   
	    List<String> errors = exception.getBindingResult()
	    .getAllErrors()
	    .stream()
	    .map(ObjectError::getDefaultMessage)
	    .collect(Collectors.toList());
	    
	    return new ResponseEntity<ErrorMessages>(new ErrorMessages(errors) , HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> runtimeExceptionHandler()
	{
		return ResponseEntity.ok("Something went wrong please try after some time .. !");
	}
}

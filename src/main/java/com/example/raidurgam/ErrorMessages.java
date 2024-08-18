package com.example.raidurgam;

import java.util.List;

public class ErrorMessages {

	List<String> errors;

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	public ErrorMessages() {
		
	}
	
	public ErrorMessages(List<String> errors) {
		this.errors = errors;
	}
	
}

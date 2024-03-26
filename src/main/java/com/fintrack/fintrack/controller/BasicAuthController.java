package com.fintrack.fintrack.controller;

public class BasicAuthController {
	
	private String message;
	
	public BasicAuthController(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "BasicAuthController [message=" + message + "]";
	}
	
	
	
	

}

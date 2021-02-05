package com.example.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	//Excessão q o compilador não te obriga a tratar
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found! Id: "+ id);
	}
	

}

package com.qa.name_generator.util.exceptions;

public class BannedBabyNameException extends RuntimeException {

	public BannedBabyNameException() {}
	
	public BannedBabyNameException(String name) {
		super("The name " + name + " is not allowed");
	}
}

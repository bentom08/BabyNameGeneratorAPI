package com.qa.name_generator.util.exceptions;

import com.qa.name_generator.util.constants.Constants;

public class BabyNameTooLongException extends RuntimeException {

	public BabyNameTooLongException() {
		super("Maximum Baby Name Length is " + Constants.MAX_NAME_LENGTH);
	}
}

package com.qa.name_generator.util.constants;

import java.util.Arrays;
import java.util.List;

public class Constants {
	
	private Constants() {}

	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	public static final int MAX_NAME_LENGTH = 12;
	public static final List<String> BANNED_NAMES = Arrays.asList("Batman", "Nutella", "Rambo");
}

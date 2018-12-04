package com.qa.name_generator.util.generator;

import java.util.Random;

import com.qa.name_generator.util.constants.Constants;

public class NameGenerator {
	
	private NameGenerator() {}

	public static String generateName(String nameStart, byte length) {
		nameStart = nameStart.toLowerCase();
		nameStart = nameStart.substring(0, 1).toUpperCase() + nameStart.substring(1).toLowerCase();
		
		Random r = new Random();
		
		int numberOfCharactersToGenerate = length - nameStart.length();
		
		for (int i = 0; i < numberOfCharactersToGenerate; i++) {
			int randomNumber = r.nextInt(Constants.ALPHABET.length());
			char randomLetter = Constants.ALPHABET.charAt(randomNumber);
			
			nameStart += randomLetter;
		}
		
		return nameStart;
	}
}

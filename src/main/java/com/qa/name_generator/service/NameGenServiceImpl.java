package com.qa.name_generator.service;

import org.springframework.stereotype.Service;

import com.qa.name_generator.persistence.domain.BabyName;
import com.qa.name_generator.util.constants.Constants;
import com.qa.name_generator.util.exceptions.BabyNameTooLongException;
import com.qa.name_generator.util.exceptions.BannedBabyNameException;
import com.qa.name_generator.util.generator.NameGenerator;

@Service
public class NameGenServiceImpl implements NameGenService {

	public BabyName createName(BabyName nameStart, byte length) {
		if (length > Constants.MAX_NAME_LENGTH) {
			throw new BabyNameTooLongException();
		}
		
		String generatedName = NameGenerator.generateName(nameStart.getName(), length);
		
		if (Constants.BANNED_NAMES.contains(generatedName)) {
			throw new BannedBabyNameException(generatedName);
		}
		 
		nameStart.setName(generatedName);
		 
		return nameStart;
	}
}

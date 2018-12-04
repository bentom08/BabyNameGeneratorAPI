package com.qa.name_generator.service;

import com.qa.name_generator.persistence.domain.BabyName;

public interface NameGenService {

	BabyName createName(BabyName nameStart, byte length);

}

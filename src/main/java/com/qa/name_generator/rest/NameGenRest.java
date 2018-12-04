package com.qa.name_generator.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.name_generator.persistence.domain.BabyName;
import com.qa.name_generator.service.NameGenService;

@RestController
public class NameGenRest {
	
	@Autowired
	private NameGenService service;

	@PostMapping("${path.genName}")
	public BabyName createName(@RequestBody BabyName nameStart, @PathVariable byte length) {
		return service.createName(nameStart, length);
	}
}

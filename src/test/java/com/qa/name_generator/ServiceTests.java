package com.qa.name_generator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.name_generator.persistence.domain.BabyName;
import com.qa.name_generator.service.NameGenService;
import com.qa.name_generator.util.exceptions.BabyNameTooLongException;
import com.qa.name_generator.util.exceptions.BannedBabyNameException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTests {
	
	@Autowired
	NameGenService service;
	
	@Test(expected = BabyNameTooLongException.class)
	public void nameTooLongTest() {
		service.createName(new BabyName(1L, "begin"), (byte)13);
	}
	
	@Test(expected = BannedBabyNameException.class)
	public void bannedNameTest() {		
		service.createName(new BabyName(1L, "batman"), (byte)6);
	}
	
	@Test
	public void lengthTest() {
		assertEquals(10, service.createName(new BabyName(1L, "Alvin"), (byte)10).getName().length());
	}
	
	@Test
	public void nameBeginTest() {
		assertEquals("Alvin", service.createName(new BabyName(1L, "alVin"), (byte)10).getName().substring(0, 5));
	}
	
}

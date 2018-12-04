package com.qa.name_generator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.name_generator.persistence.domain.BabyName;
import com.qa.name_generator.rest.NameGenRest;
import com.qa.name_generator.service.NameGenService;

@RunWith(MockitoJUnitRunner.class)
public class EndPointTests {

	private static final BabyName MOCK_NAME = new BabyName(1L, "Alvin");
	private static final BabyName MOCK_GEN_NAME = new BabyName(1L, "Alvinhm");
	private static final byte MOCK_LENGTH = 7;

	@InjectMocks
	NameGenRest rest;
	
	@Mock
	NameGenService service;
	
	@Test
	public void createNameTest() {
		Mockito.when(service.createName(MOCK_NAME, MOCK_LENGTH)).thenReturn(MOCK_GEN_NAME);
		assertEquals(MOCK_GEN_NAME, service.createName(MOCK_NAME, MOCK_LENGTH));
		Mockito.verify(service).createName(MOCK_NAME, MOCK_LENGTH);
	}
}

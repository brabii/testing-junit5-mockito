package com.testing.services.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import com.testing.repositories.VisitRepository;

@ExtendWith(MockitoExtension.class) // ceci permet d'istancier les mocks sans l'utilisation de @BeforEach
public class VetSDJpaServiceTest {

	@Mock
	VisitRepository visitRepository;

	@InjectMocks
	VisitSDJpaService service;

	// test si l'injection des mocks est bien passé
	@Test
	void testMockCreation() {
		assertNotNull(visitRepository);
		assertNotNull(service);
	}

	@Test
	void testDeleteById() {
		service.deleteById(1L);
		service.deleteById(1L);
		verify(visitRepository, times(2)).deleteById(1L);
	}
}

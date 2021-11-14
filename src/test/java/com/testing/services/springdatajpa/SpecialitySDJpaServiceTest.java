package com.testing.services.springdatajpa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.testing.model.Speciality;
import com.testing.repositories.SpecialtyRepository;

@ExtendWith(MockitoExtension.class) /* pour ne pas refaire le beforeeach */
public class SpecialitySDJpaServiceTest {
	@Mock // injecter le mock de repository, il n'est pas l'objet réelle
	SpecialtyRepository specialtyRepository;

	@InjectMocks
	SpecialitySDJpaService service;

	@Test
	void testDeleteById() {
		service.deleteById(1L);
	}

	@Test
	void testDelete() {
		service.delete(new Speciality());
	}

}

package com.testing.services.springdatajpa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.testing.model.Speciality;
import com.testing.repositories.SpecialtyRepository;

@ExtendWith(MockitoExtension.class)
public class SpecialityServiceJpaTest {

	/**
	 * dans le service j'ai un bean donc j'aurais besoin de le faire comme un bean
	 */
	@Mock
	SpecialtyRepository specialtyRepository;

	/**
	 * dans le service j'au un bean repo qui est injecter donc j'aurais besoin de
	 * faire @InjecMocks
	 */
	@InjectMocks
	SpecialitySDJpaService service;

	@Test
	void should_delete_by_id_specialty() throws Exception {
		service.deleteById(1L);
	}

	@Test
	void should_delete_specialty() throws Exception {
		service.delete(new Speciality());
	}
}

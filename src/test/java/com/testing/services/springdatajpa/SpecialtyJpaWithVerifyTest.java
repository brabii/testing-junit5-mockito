package com.testing.services.springdatajpa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.testing.model.Speciality;
import com.testing.repositories.SpecialtyRepository;

@ExtendWith(MockitoExtension.class)
public class SpecialtyJpaWithVerifyTest {
//	given(expected) verify(verifier) then(alors)
	@Mock
	SpecialtyRepository repository;
	@InjectMocks
	SpecialitySDJpaService service;

	@Test
	void should_delete_by_id_specialty() throws Exception {
		service.deleteById(1L);
		// verifier que le repo est appeler
		Mockito.verify(repository).deleteById(1L);
	}

	/**
	 * verifier qu'on appel la methode de repositry 2 fois
	 */
	@Test
	void should_delete_by_id_specialty_2_times() throws Exception {
		service.deleteById(1L);
		service.deleteById(1L);
		// verifier que le repo est appeler
		Mockito.verify(repository, Mockito.times(2)).deleteById(1L);
	}

	/**
	 * verifier qu'on appel la methode de repositry au moins 2 fois
	 */
	@Test
	void should_delete_by_id_specialty_at_Least() throws Exception {
		service.deleteById(1L);
		service.deleteById(1L);
		service.deleteById(1L);
		// verifier que le repo est appeler
		Mockito.verify(repository, Mockito.atLeast(2)).deleteById(1L);
	}

	/**
	 * verifier qu'on appel la methode de repositry au max 2 fois
	 */
	@Test
	void should_delete_by_id_specialty_at_Most() throws Exception {
		service.deleteById(1L);
		service.deleteById(1L);
		// verifier que le repo est appeler
		Mockito.verify(repository, Mockito.atMost(2)).deleteById(1L);
	}

	/**
	 * verifier qu'on appel jamais la methode de repositry
	 */
	@Test
	void should_delete_by_id_specialty_never() throws Exception {
		service.deleteById(1L);
		service.deleteById(1L);
		// verifier que le repo est appeler
		Mockito.verify(repository, Mockito.atLeast(2)).deleteById(1L);
		Mockito.verify(repository, Mockito.never()).deleteById(5L);
	}

	@Test
	void should_delete_specialty() throws Exception {
		Speciality specialty = new Speciality();
		service.delete(specialty);
		Mockito.verify(repository).delete(specialty);
	}
}

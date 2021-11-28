package com.testing.services.springdatajpa;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.testing.model.Speciality;
import com.testing.repositories.SpecialtyRepository;

@ExtendWith(MockitoExtension.class)
public class SpecialitySDJpaService2Test {
	@Mock
	SpecialtyRepository repository;
	@InjectMocks
	SpecialitySDJpaService service;

	@Test
	void should_return_specialty_when_find_by_id_called() throws Exception {
		Speciality speciality = new Speciality();
		// quand on appel la methode findbyid de repo alors on retourne l'objet
		// on verifie l'objet n'est pas null ainsi qu'il est egale à espected objet
		// on verify si la methode de repo est appeler
		Mockito.when(repository.findById(1L)).thenReturn(Optional.of(speciality));
		Speciality foudedSpeciality = service.findById(1L);
		Assertions.assertThat(foudedSpeciality).isNotNull();
		Assertions.assertThat(foudedSpeciality).isEqualTo(speciality);
		Mockito.verify(repository).findById(1L);
	}
}

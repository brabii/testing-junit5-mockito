package com.testing.services.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

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

	/**
	 * la méthode findById retourne un objet donc on va créer un scenario
	 */
	@Test
	void testFindById() {
		Speciality speciality = new Speciality();
		/**
		 * quand la méthode findById est appelé alors je retourne cette objet when mock
		 * tjrs
		 */
		when(specialtyRepository.findById(1L)).thenReturn(Optional.of(speciality));
//		autre façon c'est de dire speciality = specialtyRepository.findById(1L)
		Speciality foundedSpeciality = service.findById(1L);
		assertNotNull(foundedSpeciality);
		verify(specialtyRepository).findById(1L);// verify que la méthode findById de repo est appelé
	}

	@Test
	void testDeleteById() {
		service.deleteById(1L);
		/**
		 * verifier que la méthode deleteById est invoké la methode verify doit contenir
		 * le mock
		 */
		verify(specialtyRepository).deleteById(1L);
	}

	@Test
	void testDeleteByIdTwoTimes() {
		service.deleteById(1L);
		service.deleteById(1L);
		verify(specialtyRepository, times(2)).deleteById(1L);
	}

	@Test
	void testDeleteByIdThreeTimes() {
		service.deleteById(1L);
		service.deleteById(1L);
		service.deleteById(1L);
		verify(specialtyRepository, times(3)).deleteById(1L);
	}

	@Test
	void testDeleteByIdAtLeast() {
		service.deleteById(1L);
		service.deleteById(1L);
		service.deleteById(1L);
		verify(specialtyRepository, atLeast(3)).deleteById(1L);
	}

	@Test
	void testDeleteByIdAtMost() {
		service.deleteById(1L);
		service.deleteById(1L);
		verify(specialtyRepository, atMost(3)).deleteById(1L);
	}

	@Test
	void testDeleteByIdAtNever() {
		verify(specialtyRepository, never()).deleteById(1L);
	}

	@Test
	void testDelete() {
		service.delete(new Speciality());
	}

}

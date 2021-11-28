package com.testing.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.testing.repositories.VetRepository;
import com.testing.services.springdatajpa.VetSDJpaService;

@ExtendWith(MockitoExtension.class)
public class VetSDJpaServiceTest {
	@Mock
	VetRepository repository;
	@InjectMocks
	VetSDJpaService service;

	@Test
	void should_delete_by_id_once() throws Exception {
		service.deleteById(1L);
		Mockito.verify(repository).deleteById(1L);
	}

	@Test
	void should_delete_by_id_2_times() throws Exception {
		service.deleteById(1L);
		service.deleteById(1L);
		Mockito.verify(repository, Mockito.times(2)).deleteById(1L);
	}

	@Test
	void should_delete_by_id_at_least_2_times() throws Exception {
		service.deleteById(1L);
		service.deleteById(1L);
		Mockito.verify(repository, Mockito.atLeast(1)).deleteById(1L);
	}

	@Test
	void should_delete_by_id_at_most_5_times() throws Exception {
		service.deleteById(1L);
		service.deleteById(1L);
		Mockito.verify(repository, Mockito.atMost(5)).deleteById(1L);
	}

	@Test
	void shouldnt_delete_by_id_when_id_is_5() throws Exception {
		service.deleteById(1L);
		service.deleteById(1L);
		Mockito.verify(repository, Mockito.atLeast(1)).deleteById(1L);
		Mockito.verify(repository, Mockito.never()).deleteById(5L);
	}
}

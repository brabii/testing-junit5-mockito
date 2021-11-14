package com.testing.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import com.testing.model.Speciality;
import com.testing.repositories.SpecialtyRepository;
import com.testing.services.SpecialtyService;

public class SpecialitySDJpaService implements SpecialtyService {

	private final SpecialtyRepository specialtyRepository;

	public SpecialitySDJpaService(SpecialtyRepository specialtyRepository) {
		this.specialtyRepository = specialtyRepository;
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<>();
		specialtyRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long aLong) {
		return specialtyRepository.findById(aLong).orElse(null);
	}

	@Override
	public Speciality save(Speciality object) {
		return specialtyRepository.save(object);
	}

	@Override
	public void delete(Speciality object) {
		specialtyRepository.delete(object);
	}

	@Override
	public void deleteById(Long aLong) {
		specialtyRepository.deleteById(aLong);
	}

}

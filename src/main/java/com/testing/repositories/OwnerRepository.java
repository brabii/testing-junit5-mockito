package com.testing.repositories;

import java.util.List;

import com.testing.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
	Owner findByLastName(String lastName);
	List<Owner> findAllByLastNameLike(String lastName);
}

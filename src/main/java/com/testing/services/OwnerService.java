package com.testing.services;

import java.util.List;

import com.testing.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
	List<Owner> findAllByLastNameLike(String lastName);
}

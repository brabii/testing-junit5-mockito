package com.testing.model;

import java.util.HashSet;
import java.util.Set;

public class Vet  extends Person {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Set<Speciality> specialities = new HashSet<>();

    public Vet(Long id, String firstName, String lastName, Set<Speciality> specialities) {
        super(id, firstName, lastName);
        this.specialities = specialities;
    }

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

}

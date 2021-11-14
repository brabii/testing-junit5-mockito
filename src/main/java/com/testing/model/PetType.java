package com.testing.model;

public class PetType extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	@Override
	public String toString() {
		return name;
	}

	public PetType() {
	}

	public PetType(String name) {
		this.name = name;
	}

	public PetType(Long id, String name) {
		super(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

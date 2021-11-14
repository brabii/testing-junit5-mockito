package com.testing.fauxspring;

import java.text.ParseException;
import java.util.Locale;

import com.testing.model.PetType;

public interface Formatter<T> {
	String print(PetType petType, Locale locale);

	PetType parse(String text, Locale locale) throws ParseException;
}

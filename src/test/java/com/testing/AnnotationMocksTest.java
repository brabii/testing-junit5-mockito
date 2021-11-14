package com.testing;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class AnnotationMocksTest {

	/**
	 * declaration de mock
	 */
	@Mock
	Map<String, Object> mapMock;

	/**
	 * initialiser les mocks de cette classe
	 */
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * verifier la creation de mocks
	 */
	@Test
	void testMockCreation() {
		mapMock.put("key_value", "foo");
	}
}

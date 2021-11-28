package com.testing;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * deuxieme methode pour initialiser les mocks
 *
 */
public class IntitializeMocksWithAnnotationTest {
	/**
	 * declarer le mock de classe qu'on veut moquer c'est comme declarer un objet
	 * comme un bean
	 */
	@Mock
	Map<String, Object> mapMock;

	/**
	 * initialiser les mocks de la classe en cours sans les initiliaser on aura pas
	 * un mock implementation et par la suite un NullPointerException
	 */
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void should_create_mock_implementation_of_map_with_annotation() throws Exception {
		mapMock.put("key", "value");
	}
}

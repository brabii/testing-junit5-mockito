package com.testing;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class JUnitExtensionTest {
	/**
	 * une deuxieme methode pour la creation des mocks, sans le @BeforeEach
	 */
	@Mock
	Map<String, Object> mapMock;

	@Test
	void testMockCreation() {
		mapMock.put("key_value", "foo");
	}
}

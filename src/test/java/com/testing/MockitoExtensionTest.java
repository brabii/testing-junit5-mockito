package com.testing;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * troisieme pour initiliaser les mocks [MEILLEUR METHODE]
 *
 */
@ExtendWith(MockitoExtension.class)
public class MockitoExtensionTest {

	@Mock
	Map<String, String> mockMap;

	@Test
	void should_create_fake_implementation_for_map_with_mockito_exstension() {
		mockMap.put("key", "value");
	}
}

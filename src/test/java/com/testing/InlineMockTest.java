package com.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class InlineMockTest {

	@Test
	void should_create_mock_implementation_of_Map() throws Exception {
		/**
		 * donne moi une instance de map, on donne une mock/fake implémentation de Map
		 */
		Map mockMap = Mockito.mock(Map.class);
		assertTrue(mockMap != null);
	}
}

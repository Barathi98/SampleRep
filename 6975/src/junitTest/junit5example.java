package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class junit5example {

	@Test
	void test() {
		@DisplayName("Display name Class Level")
		@DisplayNameGeneration (ReplaceCamelCase.class)
		class DisplayNameDemo {
		    @Test
		    void anotherTestCamelCase() {
		    }

		    @DisplayName("Test parameters with nice names")
		    @ParameterizedTest(name = "Use the value {0} for test")
		    @ValueSource(ints = { -1, -4 })
		    void isValidYear(int number) {
		        assertTrue(number < 0);
		    }
		 @Test
		    @DisplayName("Test name with Spaces")
		    void testNameCanContainSpaces() {
		    }
		}
		//fail("Not yet implemented");
	}

}

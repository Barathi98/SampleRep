package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
@SuppressWarnings( "unused" )
class FibTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println(" after class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before test case");
		
	}
@Test
void example()
{
	System.out.println("this is test method");
}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after test case");
	}

	@Test
	void test() {
		System.out.println("Not yet implemented");
	}

}

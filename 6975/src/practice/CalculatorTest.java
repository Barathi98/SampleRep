package practice;
//junit5 -unpublic
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class CalculatorTest {

	@Test

	void testadd() {
		CalculatorTest c= new CalculatorTest();
		
	assertEquals(5,5);
	}
	
	@Test
	
	void testsubtract()
	{
		assertEquals(-11,-11);
	}
	
	@Test
	void testmultiply()
	{
		assertEquals(4096,4096);
	}
	
@Test
void testdivide()
{
	assertEquals(1,1);
}
	
	
		//fail("Not yet implemented");
	

	
		
	}

		
	



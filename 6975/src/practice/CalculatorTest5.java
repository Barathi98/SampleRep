package practice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//need to mention public for every method
@SuppressWarnings("unused")
public class CalculatorTest5 {


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
}

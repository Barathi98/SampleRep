package junitTest;

import static org.junit.Assert.*;
import junitTest.Pet;
import org.junit.Test;

public class PetTest {

	@Test
	public void testPet() 
	{
	}
	@Test
	public void Testcat()
	{
		Pet testpet= new Pet();
		assertTrue("meow".equals(testpet.cat()));
	}
	
	

}

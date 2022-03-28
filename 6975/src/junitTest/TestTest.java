package junitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTest {
@BeforeClass

	public static void beforeClass()
	{
	
		System.out.println("Before class");

}
@AfterClass

	public static void afterClass()
	{
		System.out.println(" after class");
	}
@Before
public void beforetest()
{
	System.out.println(" before case");
}

	@Test
	public void test() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
		assert c>=30:"wrong answer";
		//fail("Not yet implemented");
	}
	@After
	public void aftertest()
	{
		System.out.println("After test case");
	}
	

}

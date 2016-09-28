package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	
	}

	
	@BeforeClass
	private void testisEven() {
		assertTrue(MyInteger.isEven(6));
		assertFalse(MyInteger.isEven(7));
	
	}
	
	public void testissOdd()    {
		assertTrue(MyInteger.isOdd(7));
		assertFalse(MyInteger.isOdd(8));
		
	}
	public void testisPrime()     {
		assertTrue(MyInteger.isPrime(3));
		assertFalse(MyInteger.isPrime(4)); 
	
	}
	
	
	
}

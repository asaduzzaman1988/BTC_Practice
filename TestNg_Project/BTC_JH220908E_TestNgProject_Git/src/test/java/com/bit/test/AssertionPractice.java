package com.bit.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPractice {
	/*
	 * //class, Abstract, Interface, Enum 
	 * 
	 * Soft VS Hard assertion:
	 * Hard Asserts are used when you want to halt the execution of the test script (or test method) when the assert
	 * condition does not match with the expected result. Soft Asserts are used when
	 * the test script (or test method) need not be halted when the assertion
	 * condition does not meet the expected result.
	 * 
	 */
	@Test
	public void testassert() {
		
		//what is the difference between assert and verify 

		//soft assert
		SoftAssert s = new SoftAssert();
		s.assertFalse(1>4);
		s.assertTrue(23<2);
		s.assertEquals(22, 33);
		
		
		//hard Assert
		Assert.assertTrue(1 > 4);
		Assert.assertFalse(1 < 2);
		Assert.assertEquals("hi", "Hi");



	}

	@Test
	public void log4JPractice() {
		
		 
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

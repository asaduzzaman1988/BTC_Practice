package com.bit.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPractice {
	/*
	 * //class, Abstract, Interface, Enum
	 * 
	 * Soft VS Hard assertion: Hard Asserts are used when you want to halt the
	 * execution of the test script (or test method) when the assert condition does
	 * not match with the expected result. Soft Asserts are used when the test
	 * script (or test method) need not be halted when the assertion condition does
	 * not meet the expected result.
	 * 
	 */
	@Test
	public void testassert() {

		// what is the difference between assert and verify

		// soft assert
		SoftAssert s = new SoftAssert();
		s.assertFalse(1 > 4);
		s.assertTrue(23 < 2);
		s.assertEquals(22, 33);

		// hard Assert
		Assert.assertTrue(1 > 4);
		Assert.assertFalse(1 < 2);
		Assert.assertEquals("hi", "Hi");

	}

	@Test
	public void testassert2() {

		// what is the difference between assert and verify

		// soft assert
		SoftAssert s = new SoftAssert();
		s.assertFalse(1 > 4);
		s.assertTrue(23 < 2);
		s.assertEquals(22, 33);

		// hard Assert
		Assert.assertTrue(1 > 4);
		Assert.assertFalse(1 < 2);
		Assert.assertEquals("hi", "Hi");

	}
	
	@Test
	public void testassert1() {

		// what is the difference between assert and verify

		// soft assert
		SoftAssert s = new SoftAssert();
		s.assertFalse(1 > 4);
		s.assertTrue(23 < 2);
		s.assertEquals(22, 33);

		// hard Assert
		Assert.assertTrue(1 > 4);
		Assert.assertFalse(1 < 2);
		Assert.assertEquals("hi", "Hi");

	}
	
	
	
	@Test
	public void log4JPractice() {

		
		//DOMConfigurator.configure("log4j.xml");
		PropertyConfigurator.configure("log4j.properties");
		
		Logger log = Logger.getLogger(AssertionPractice.class);
		
		//log4J will always follow the method sequence. Method we mention the configuration file
		//it will take that method and UP based on the sequence 
		//ex: <param name="Threshold" value="Warn" />
		log.fatal("this is fatal");
		log.error("this is error");
		log.warn("this is warn");
		log.info("this is info");
		log.debug("this is debug");
		log.trace("this is trace");
		
		
		//     [%t] %-5p %c %x - %m%n
	}

}

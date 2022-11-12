package com.bit.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class BaseTest {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforemethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("aftermethod");
	}

	@DataProvider
	public Object[][] dp() {
		
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeclass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterclass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforetest");
	}

	@AfterTest
	public void afterTest1() {
		System.out.println("aftertest1");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite");
	}

	@AfterSuite
	public void afterSuite() {
	}

}

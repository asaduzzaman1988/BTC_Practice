package com.bit.test;

import org.testng.annotations.Test;

public class SmokeTest extends BaseTest{
	
	@Test(groups = "smokeTest")
	public void targetSignUp() {
		System.out.println("Test 1......................smokeTest");
	}

	@Test(groups = "regressionTest")
	public void targetSignIn() {
		System.out.println("Test 2......................regressionTest");
	}
	
	@Test(groups = {"smokeTest", "regressionTest"})
	public void targetSignUp1() {
		System.out.println("Test 3......................smokeTest & regressionTest");
	}

	@Test(groups = {"smokeTest", "regressionTest"})
	public void targetSignIn2() {
		System.out.println("Test 4......................smokeTest & regressionTest");
	}
	
	@Test(groups = {"regressionTest"})
	public void targetSignUp3() {
		System.out.println("Test 5......................regressionTest");
	}

	@Test(groups = "smokeTest")
	public void targetSignIn4() {
		System.out.println("Test 6......................smokeTest");
	}
	
	
}

package com.bit.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	
	WebDriver dr;
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32 (107)\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().setSize(new Dimension(1500,900));
		dr.get("http://www.target.com");
	}
	
	@Test
	public void test2() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\User\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		dr = new EdgeDriver();
		dr.manage().window().setSize(new Dimension(1500,900));
		dr.get("http://www.zara.com");
	}
	
	//@Test
	public void test3() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32 (107)\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().setSize(new Dimension(1500,900));
		dr.get("http://www.target.com");
	}
	
	//@Test
	public void test4() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32 (107)\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().setSize(new Dimension(1500,900));
		dr.get("http://www.target.com");
	}
	

}

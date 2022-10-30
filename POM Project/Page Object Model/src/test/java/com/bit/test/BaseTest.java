package com.bit.test;

import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
	
	
	public ChromeDriver dr;
	@Before
	public void openBrowser() throws IOException {
		
		System.out.println("Chrome browser......................");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32_105\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().setSize(new Dimension(1700,1000));
		dr.get("http://www.target.com");
	}
	
	@After
	public void closeBrowser() throws InterruptedException {
		
		Thread.sleep(5000);
		dr.quit();
	}

}

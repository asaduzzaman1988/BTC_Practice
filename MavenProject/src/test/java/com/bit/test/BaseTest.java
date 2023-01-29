package com.bit.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.data.SharedData;

public class BaseTest {
	
	
	public WebDriver dr;
	@Before
	public void openBrowser() throws IOException {
		
		//FileInputStream f = new FileInputStream("config.properties");
		FileInputStream f = new FileInputStream("practice.properties");
		Properties p = new Properties();
		p.load(f);
		
		// mvn test -Dbrowser=firefox
		String b = System.getProperty("browser");
		//String b = p.getProperty("browser");
		
		if(b.equals("safari")) {
			System.out.println("Safari browser......................");
		}
		else if(b.equals("chrome")) {
			System.out.println("Chrome browser......................");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\Downloads\\chromedriver_win32_105\\chromedriver.exe");
			dr = new ChromeDriver();
		}
		else if(b.equals("firefox")) {
			System.out.println("Firefox browser......................");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			dr = new FirefoxDriver();
		}
		else if(b.equals("ie")) {
			System.out.println("IE browser");
		}
		else {
			System.out.println("Default browser executed ............................");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\Downloads\\chromedriver_win32_105\\chromedriver.exe");
			dr = new ChromeDriver();
		}
		

		dr.manage().window().setSize(new Dimension(1700,1000));
		dr.get("http://www.target.com");
		//dr.get(SharedData.targetUrl);
		//dr.get(p.getProperty("targetUrl"));
	}
	
	@After
	public void closeBrowser() throws InterruptedException {
		
		Thread.sleep(5000);
		dr.quit();
	}

}

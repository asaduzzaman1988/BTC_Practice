package com.bit.page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeeklyAdd {
	
	ChromeDriver dr;
	public WeeklyAdd(ChromeDriver dr) {
		this.dr = dr;
	}

	public void verifyWeeklyAddTitle(String expectedTitle) {
		
		String actualTitle = dr.getTitle();
		boolean result = actualTitle.equals(expectedTitle);
		
		if(result) {
			System.out.println("WeeklyAdd Title matched .....");
		}else {
			System.out.println("WeeklyAdd title did not match : " + actualTitle);
		}
	}
	
	public HomePage clickOnTheLogo() {
		dr.findElement(By.xpath("//a[@id='bullseye']")).click();
		return new HomePage(dr);
	}
	
}

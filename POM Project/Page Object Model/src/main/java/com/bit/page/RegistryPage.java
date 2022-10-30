package com.bit.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;

public class RegistryPage extends LoadableComponent<RegistryPage>{
	
	ChromeDriver dr;
	public RegistryPage(ChromeDriver dr) {
		this.dr = dr;
	}
	
	//Registry page elements ...................
	
	@FindBy(css="#headerPrimary>a:nth-child(1)")
	WebElement logo;
	
	
	//End of registry page elements ..................
	
	public void verifyRegistryTitle(String expectedTitle) {
		
	}
	
	public HomePage clickOnTheLogo() {
		dr.findElement(By.cssSelector("#headerPrimary>a:nth-child(1)")).click();
		return new HomePage(dr);
	}

	@Override
	protected void load() {
		System.out.println("Load executed............");
		dr.get("https://www.target.com/gift-registry");
	}

	@Override
	protected void isLoaded() throws Error {
		System.out.println("IsLoadedExecuted.........");
		Assert.assertTrue(dr.findElement((By.cssSelector("#headerPrimary>a:nth-child(1)"))).isDisplayed());
		
	}
	
	
	
	
	
	

}

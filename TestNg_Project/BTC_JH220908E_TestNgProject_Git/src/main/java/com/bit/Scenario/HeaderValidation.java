package com.bit.Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bit.page.ShareData;

public class HeaderValidation {
	
	WebDriver dr;
	Shared shared; 
	
	public HeaderValidation(WebDriver dr){
		this.dr = dr;
		shared = new Shared(dr);
	}
	
	/*verify user is in HomePage 
	 * verify myStore module is displayed 
	 * click on myStore link 
	 * verify that select a store module is displayed as a sidebar 
	 * 
	 */
	public void verifyMyStoreModule() {
		
		shared.verifyTitle(ShareData.homePageTitle);
		shared.verifyElementDisplay(By.cssSelector("#web-store-id-msg-btn"));
		shared.myClick(By.cssSelector("#web-store-id-msg-btn"));
		shared.verifyElementDisplay(By.xpath("(//h2[text()='Select a store'])[1]"));
	}
	
	public void verifyHeaderLink() {
		
		
	}
	

}

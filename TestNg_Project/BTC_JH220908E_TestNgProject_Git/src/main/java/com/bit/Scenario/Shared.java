package com.bit.Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shared {

	WebDriver dr;
	
	public Shared(WebDriver dr){
		this.dr = dr;
	}

	public void myWait(long seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}

	public void goToAnyWebsite1(String url) {
		dr.get(url);
	}

	public void verifyTitle(String expectedTitle) {

		String actualTitle = dr.getTitle().toLowerCase();

		if (actualTitle.contains(expectedTitle.toLowerCase())) {
			System.out.println("Title verified");
		} else {
			System.out.println("Title did not match : " + actualTitle);
		}
	}

	public void verifyUrl(String expectedUrl) {
		String actualUrl = dr.getCurrentUrl();
		boolean result = actualUrl.toLowerCase().contains(expectedUrl.toLowerCase());

		if (result) {
			System.out.println("URL verified");
		} else {
			System.out.println("URL did not match");
		}

	}

	public boolean verifyElementDisplay(By locator) {
		boolean result = dr.findElement(locator).isDisplayed();
		if (result) {
			System.out.println("Element displayed : " + result);
		} else {
			System.out.println("Element is NOT displayed : " + result);
		}

		return result;
	}

	public String getAnyText(By locator) {
		String text = dr.findElement(locator).getText();

		return text;
	}

	public String getAttributeValue(By by, String attributeName) {
		String v = dr.findElement(by).getAttribute(attributeName);
		System.out.println(v);

		return v;
	}

	public WebElement anyActionOnAnyElement(By by) {

		WebElement ele = dr.findElement(by);
		// return dr.findElement(by);
		return ele;
	}

	public WebElement anyAction(WebElement ele) {

		return ele;
	}

	public void myClick(By locator) {

		WebElement ele = dr.findElement(locator);

		WebDriverWait wait = new WebDriverWait(dr, 15);

		// wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
		//dr.findElement(locator).click();
	}

	public void typeOnAnyElement(By by, String value) {
		// dr.findElement(By.cssSelector("")).sendKeys("");
		dr.findElement(by).sendKeys(value);
	}

	public void selectFromDroDown(By locator, int indexNumber) {
		WebElement e = dr.findElement(locator);
		Select s = new Select(e);
		s.selectByIndex(indexNumber);
	}

	public void selectFromDroDown(By locator, String value) {
		new Select(dr.findElement(locator)).selectByValue(value);
	}

	public void selectFromDroDown(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	public Select selectFromDropDown(By locator) {
		WebElement e = dr.findElement(locator);
		Select s = new Select(e);

		return s;
	}

}

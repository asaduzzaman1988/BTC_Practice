package com.bit.test;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class SeleniumMethods extends BaseTest{
	
	WebDriver dr;
	WebElement ele;
	List<WebElement> eles;
	Dimension dimension;
	Navigation navigation;
	Point point;
	Options option;
	TargetLocator locate;
	Alert alert;
	
	
	@Test
	public void test() {
		dr.get("https://www.target.com/");
		screenShot();
		
		dleteASpecificCookie("NID");
	}
	
	public void driverMethods() {
		
		dr.close(); //closes the current browser tab 
		dr.quit(); //close the entire browser 
		ele = dr.findElement(By.id("")); //to catch a single element 
		eles = dr.findElements(By.xpath("")); //to catch more than one element 
		dr.getCurrentUrl(); //get the current page url 
		dr.getTitle(); //get the current page title 
		dr.getPageSource(); //get the source page and validate any condition 
		dr.getWindowHandle();
		dr.getWindowHandles();
		dr.manage();
		dr.get(""); //navigate to any website 
		dr.switchTo();
		
	}
	
	public void webElementMethods() {
		
		ele.clear();
		ele.click();
		ele = dr.findElement(By.id("")); //to catch a single element 
		eles = dr.findElements(By.xpath("")); //to catch more than one element 
		ele.getCssValue("class");
		ele.getAttribute("id");
		ele.getScreenshotAs(OutputType.FILE);
		ele.getTagName();
		ele.getText();
		ele.isDisplayed();
		ele.isEnabled();
		ele.isSelected();
		ele.submit();
		ele.sendKeys("");
		
		
	}
	
	public void optionMethods() {
		
		option.getCookies();
		option.deleteAllCookies();
		//Specifies the amount of time the driver should wait when searching for an element 
		//if it is not immediately present. 
		option.timeouts().implicitlyWait(30, TimeUnit.SECONDS);//for a specific element
		option.timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);//for the page 
		option.timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		option.window().maximize();
		option.window().fullscreen();
		
	}
	
	
	public void navigationMethods() {
		
		dr.navigate().to("");
		dr.navigate().back();//browser navigate back 
		navigation = dr.navigate();
		navigation.back();
		navigation.forward();
		navigation.refresh();

	}
	
	public void point_dimension_target_Methods() {
		point = ele.getLocation();
		point.getX();
		point.getY();
		
		//What is the width and height of the rendered element?
		dimension = ele.getSize();
		dimension.getHeight();
		dimension.getWidth();
		
		
		alert = locate.alert();//move to the alert
		alert.accept();//click on ok button 
		alert.dismiss();//click on the cancel button 
		alert.sendKeys("emni");//type on alert 
		alert.getText();
		locate.defaultContent();
		
	}
	
	public void actionMethods() {
		Actions action = new Actions(dr);
		action.click(ele);
		action.clickAndHold();
		action.contextClick(ele).perform();//right click 
		action.doubleClick(ele);
		action.dragAndDrop(ele, ele);
		action.dragAndDropBy(ele, 123, 222).perform();
		action.keyDown(Keys.ARROW_DOWN);
		action.moveToElement(ele).build().perform();
		action.pause(1000);
		action.release(ele);
		action.sendKeys("anything");
		action.build().perform();
		action.keyDown(Keys.CONTROL);
		
	}
	
	//Select class is used for drop down that has been created by <select> tag
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

	public void javaScriptExecutor() {
		
		//to handle window/desktop  based application
		//need third party API like Sikulli, AutoIT and Robot API
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.scrollTo(0, 1000)");
		js.executeScript("document.getElementById('email').value=\"sdfgh\"");
		js.executeScript("arguments[0].click()",dr.findElement(By.id("")));
	}

	
	public void screenShot() {
		
		int i = (int)Math.floor(Math.random()*1000);
		System.out.println(i);
		
		File f=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(f,new File("C:\\Users\\User\\Desktop\\BTC_Jh220619M\\Image\\myPic"+i+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
//TBD
	public void test2() {
		handleIframe(dr.findElements(By.tagName("iframe")),"class","classValue");
	}
	
	public void handleIframe(List<WebElement> frames,String attName,String attValue){
		
		for(WebElement frame:frames) {
			String v=frame.getAttribute(attName);
			if(v.equals(attValue)) {
				dr.switchTo().frame(attValue);
				//action
			}
	}
		
	}
	public void dleteASpecificCookie(String cookieName) {
		
		//List<WebElement> a = dr.findElements(By.id(""));
		
		Set<Cookie> cookies=dr.manage().getCookies();
		
		for(Cookie cookie:cookies) {
			
			String c = cookie.getName();
			System.out.println(c);
			
			if(cookie.getName().equals(cookieName)) {
				dr.manage().deleteCookieNamed(cookieName);
			}

		}
	}
	
}

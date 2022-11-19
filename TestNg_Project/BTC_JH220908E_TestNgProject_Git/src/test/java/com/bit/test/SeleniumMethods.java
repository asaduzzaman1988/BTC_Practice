package com.bit.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumMethods {
	
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
		
	}
	
	public void selectMethods() {
		
	}

	public void screenshot() {
		
	}
	
	public void handleIframe() {
		
	}
	
	public void handleCookies() {
		
	}
	
	
	
	
}

package com.bit.test;

import org.junit.Test;

import com.bit.data.SharedData;
import com.bit.page.HomePage;
import com.bit.page.RegistryPage;

public class SmokeTest extends BaseTest{
	
	HomePage homePage;
	RegistryPage registryPage;
	
	@Test
	public void verifyTargetHeaderLink() {

		homePage = new HomePage(dr);
		homePage.verifyHomePageTitle(SharedData.homePageTitle);
		registryPage = homePage.clickRegistryLink().get();
		//registryPage.verifyRegistryTitle(SharedData.registryPageTitle);
		//homePage = registryPage.clickOnTheLogo();
		
	}                                                                                                                                                                                                                                                                                                                                                                             

	@Test
	public void verifyTargetSearch() {

		homePage = new HomePage(dr);
		
		
		
	}

}

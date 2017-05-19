package com.iks.uptakedemo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.iks.uptakedemo.common.BaseTestClass;
import com.iks.uptakedemo.pages.ApproachPage;
import com.iks.uptakedemo.pages.HomePage;

/**
 * @author Isha
 * Test Case Name: Verify_Page_Navigation
 */
public class PageNavigationTest extends BaseTestClass{

	private WebDriver webDriver;

	@BeforeClass
	public void setUp(){
		webDriver = getDriver();
	}

	@Test
	public void verifyPageNavigationApproachPage(){
		
		//Start with home page
		HomePage homePage = new HomePage(webDriver);
		
		//Verify home page top Content to confirm before navigating
		homePage.verifyHomePageHeroTitleText1();
		
		//Click on approach link from header
		homePage.clickApproachLink();
		
		//Wait for page
		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Load approach page elements
		ApproachPage approachPage = new ApproachPage(webDriver);
		
		//Verify approach page top content for confirmation
		approachPage.verifyApproachMenuActive();
		approachPage.verifyApproachHeroTitle1();
	}
}

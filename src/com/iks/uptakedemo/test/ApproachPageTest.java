package com.iks.uptakedemo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import com.iks.uptakedemo.common.BaseTestClass;
import com.iks.uptakedemo.pages.ApproachPage;
import com.iks.uptakedemo.pages.HomePage;

/**
 * @author Isha
 * Test Case Name: Verify_Approach_Page
 */
public class ApproachPageTest extends BaseTestClass{

	private WebDriver webDriver;
	JavascriptExecutor je;
	
	@BeforeClass
	public void setUp(){
		webDriver = getDriver();
		je = (JavascriptExecutor) webDriver;
	}
	
	@Test
	public void verifyApproachPageElements(){
		HomePage homePage = new HomePage(webDriver);
		
		homePage.clickApproachLink();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ApproachPage approachPage = new ApproachPage(webDriver);

		Assert.assertTrue(approachPage.verifyApproachHeroTitle1());
		Assert.assertTrue(approachPage.verifyApproachHeroSubtitle1());
		
		//Implementing the manual scroll behavior
		approachPage.scrollToHeroTitle2();
		
		Assert.assertTrue(approachPage.verifyApproachHeroTitle2());
		Assert.assertTrue(approachPage.verifyApproachIntelligenceLnk());
		Assert.assertTrue(approachPage.verifyApproachSpeedLnk());
		Assert.assertTrue(approachPage.verifyApproachScaleLnk());

		approachPage.scrollToHeroTitle3();
		Assert.assertTrue(approachPage.verifyApproachHeroTitle3());
		Assert.assertTrue(approachPage.verifyApproachHeroSubtitle3());
		Assert.assertTrue(approachPage.verifyApproachOpenPositionsBtn());

		approachPage.scrollToSeeOurProductsLnk();
		Assert.assertTrue(approachPage.verifyApproachSeeOurProductsLnk());

	}
}

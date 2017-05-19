package com.iks.uptakedemo.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import com.iks.uptakedemo.common.BaseTestClass;
import com.iks.uptakedemo.pages.HomePage;

/**
 * @author Isha
 *  
 */
public class HomePageTest extends BaseTestClass{
 
  private WebDriver webDriver;

	@BeforeClass
	public void setUp(){
		webDriver = getDriver();
	}

	@Test
	public void verifyHomePageElements(){
		HomePage homePage = new HomePage(webDriver);
		
		Assert.assertTrue(homePage.verifyHomePageHeroTitleText1());
		Assert.assertTrue(homePage.verifyHomePageHeroSubtitleText1());
		Assert.assertTrue(homePage.verifyHomePageHeroSubtitleBtn1());

		Assert.assertTrue(homePage.verifyHomePageHeroTitleText2());
		Assert.assertTrue(homePage.verifyHomePageHeroSubtitleText2());
		Assert.assertTrue(homePage.verifyHomePageHeroSubtitleBtn2());

		Assert.assertTrue(homePage.verifyHomePageHeroTitleText3());
		Assert.assertTrue(homePage.verifyHomePageHeroSubtitleText3());
		Assert.assertTrue(homePage.verifyHomePageHeroSubtitleBtn3());

		Assert.assertTrue(homePage.verifyHomePageHeroTitleText4());
		Assert.assertTrue(homePage.verifyHomePageHeroSubtitleText4());
		Assert.assertTrue(homePage.verifyHomePageHeroSubtitleBtn4());
		
	}

}

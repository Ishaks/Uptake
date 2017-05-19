package com.iks.uptakedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Isha
 * 
 */
public class ApproachPage extends BasePageClass{
	
	protected WebDriver webDriver;
	JavascriptExecutor je;

	//Initializing WebElements
	@FindBy(xpath="//div[contains(text(),'We focus on outcomes')]")
	private WebElement heroTitle1;
	
	@FindBy(xpath="//div[@class='hero__title'][contains(text(),'The Uptake difference:')]")
	private WebElement heroTitle2;
	
	@FindBy(xpath="//div[contains(text(),'Not your average')]")
	private WebElement heroTitle3;
	
	@FindBy(xpath="//p[contains(text(),'Working with Uptake')]")
	private WebElement heroSubtitle1;
	
	@FindBy(xpath="//div[contains(text(),'Together as a team')]")
	private WebElement heroSubtitle3;
	
	@FindBy(xpath="//a[@class='skill'][@href='/approach/intelligence']")
	private WebElement intelligenceLnk;
	
	@FindBy(xpath="//a[contains(@class,'nextPage__content')]")
	private WebElement seeOurProductsLnk;
	
	@FindBy(xpath="//a[@class='skill'][@href='/approach/speed']")
	private WebElement speedLnk;
	
	@FindBy(xpath="//a[@class='skill'][@href='/approach/scale']")
	private WebElement scaleLnk;
	
	@FindBy(xpath="//button[contains(@class,'life__button')]")
	private WebElement openPositionsBtn;
	
	
	//Constructor
	public ApproachPage(WebDriver webDriver) {
		super(webDriver);
		this.webDriver = webDriver;	
		PageFactory.initElements(this.webDriver, this);
		je = (JavascriptExecutor) webDriver;
	}
	
	public Boolean verifyApproachMenuActive(){
		WebElement activeMenuItem = webDriver.findElement(By.xpath("//a[@href='/approach'][contains(@class,'menu__item--active')]"));
		
		if("APPROACH".equalsIgnoreCase(activeMenuItem.getText())){
			return true;
		}else{
			return false;
		}
		
	}
	
	public void scrollToHeroTitle2(){
		je.executeScript("arguments[0].scrollIntoView();", heroTitle2);		
	}
	
	public void scrollToHeroTitle3(){
		je.executeScript("arguments[0].scrollIntoView();", heroTitle3);	
	}
	
	public void scrollToSeeOurProductsLnk(){
		je.executeScript("arguments[0].scrollIntoView();", seeOurProductsLnk);		
	}
	
	public Boolean verifyApproachHeroTitle1(){
		return verifyElements(heroTitle1);
	}
	
	public Boolean verifyApproachHeroTitle2(){
		return verifyElements(heroTitle2);
	}
	
	public Boolean verifyApproachHeroTitle3(){
		return verifyElements(heroTitle3);
	}
	
	public Boolean verifyApproachHeroSubtitle1(){	
		return verifyElements(heroSubtitle1);
	}
	
	public Boolean verifyApproachHeroSubtitle3(){	
		return verifyElements(heroSubtitle3);
	}
	
	public Boolean verifyApproachIntelligenceLnk(){	
		return verifyElements(intelligenceLnk);
	}
	
	public Boolean verifyApproachSpeedLnk(){	
		return verifyElements(speedLnk);
	}
	
	public Boolean verifyApproachScaleLnk(){	
		return verifyElements(scaleLnk);
	}
	
	public Boolean verifyApproachOpenPositionsBtn(){	
		return verifyElements(openPositionsBtn);
	}
	
	public Boolean verifyApproachSeeOurProductsLnk(){	
		return verifyElements(seeOurProductsLnk);
	}
	
}



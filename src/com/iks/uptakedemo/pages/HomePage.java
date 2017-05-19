package com.iks.uptakedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Isha
 * TestCase: Verify_Home_Page
 */
public class HomePage extends BasePageClass {

	protected WebDriver webDriver;
	
	//Initializing WebElements
	@FindBy (xpath="//div[contains(text(),\"Let's put your data to work\")]")
	private WebElement heroTitleText1;
	
	@FindBy (xpath="//p[contains(text(),'Turn your data into')]")
	private WebElement heroSubtitleText1;
	
	@FindBy (xpath="//button[@data-link='/industries/energy'][contains(@class,'homeSlide')]")
	private WebElement heroSubtitleBtn1;
	
	@FindBy (xpath="//div[contains(text(),'Unlock operational efficiency')]")
	private WebElement heroTitleText2;
	
	@FindBy (xpath="//p[contains(text(),'predictive platform enables companies')]")
	private WebElement heroSubtitleText2;

	@FindBy (xpath="//button[@data-link='/approach'][contains(@class,'homeSlide')]")
	private WebElement heroSubtitleBtn2;
	
	@FindBy (xpath="//div[contains(text(),'Capture new growth opportunities')]")
	private WebElement heroTitleText3;
	
	@FindBy (xpath="//p[contains(text(),'predictive platform enables partners')]")
	private WebElement heroSubtitleText3;
	
	@FindBy (xpath="//button[@data-link='/industries'][contains(@class,'homeSlide')]")
	private WebElement heroSubtitleBtn3;
	
	@FindBy (xpath="//div[contains(text(),\"Let's build something together\")]")
	private WebElement heroTitleText4;
	
	@FindBy (xpath="//p[contains(text(),'Reach out to learn')]")
	private WebElement heroSubtitleText4;	

	@FindBy (xpath="//button[contains(@data-link,'/products')][contains(@class,'homeSlide')]")	
	private WebElement heroSubtitleBtn4;
	
	//Constructor
	public HomePage(WebDriver webDriver){
		super(webDriver);
		this.webDriver = webDriver;
		PageFactory.initElements(this.webDriver, this);
	}		

	public Boolean verifyHomePageHeroTitleText1(){
		return verifyElements(heroTitleText1);
	}
	
	public Boolean verifyHomePageHeroTitleText2(){
		return verifyElements(heroTitleText2);
	}
	
	public Boolean verifyHomePageHeroTitleText3(){
		return verifyElements(heroTitleText3);
	}
	
	public Boolean verifyHomePageHeroTitleText4(){
		return verifyElements(heroTitleText4);
	}
	
	public Boolean verifyHomePageHeroSubtitleText1(){
		return verifyElements(heroSubtitleText1);
	}
	
	public Boolean verifyHomePageHeroSubtitleText2(){
		return verifyElements(heroSubtitleText2);
	}
	
	public Boolean verifyHomePageHeroSubtitleText3(){
		return verifyElements(heroSubtitleText3);
	}
	
	public Boolean verifyHomePageHeroSubtitleText4(){
		return verifyElements(heroSubtitleText4);
	}
	
	public Boolean verifyHomePageHeroSubtitleBtn1(){
		return verifyElements(heroSubtitleBtn1);
	}
	
	public Boolean verifyHomePageHeroSubtitleBtn2(){
		return verifyElements(heroSubtitleBtn2);
	}
	
	public Boolean verifyHomePageHeroSubtitleBtn3(){
		return verifyElements(heroSubtitleBtn3);
	}
	
	public Boolean verifyHomePageHeroSubtitleBtn4(){
		return verifyElements(heroSubtitleBtn4);
	}

}

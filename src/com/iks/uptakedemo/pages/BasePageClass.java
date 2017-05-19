package com.iks.uptakedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Isha
 *  
 */
public class BasePageClass {
	
	protected WebDriver webDriver;
	
	//Defining Header Elements
	
	@FindBy(xpath ="//img[@class='mainLogo'][@width='194']")
	private WebElement homePageLnk;
	
	@FindBy(xpath="//a[@href='/products'][@class='menu__item']")
	private WebElement productsLnk;
	
	@FindBy(xpath="//a[@href='/approach'][not(contains(@class,'menu__item-mobile'))]")
	private WebElement approachLnk;
	
	@FindBy(xpath="//a[@href='/industries'][@class='menu__item']")
	private WebElement industriesLnk;
	
	@FindBy(xpath="//a[@href='/newsroom'][@class='menu__item']")
	private WebElement newsroomLnk;
	
	@FindBy(xpath="//a[@href='/beyond-uptake'][@class='menu__item']")
	private WebElement beyonduptakeLnk;
	
	@FindBy(xpath="//a[contains(@data-link,'blog.uptake')][@class='menu__item']")
	private WebElement blog;
	
	@FindBy(xpath="//button[@class='ui primary button cta']")
	private WebElement getAnExecutiveBriefingBtn;
	
	//Defining Footer Elements
	
	@FindBy(xpath="//h5[@class='footer-text']")
	private WebElement textContent;
	
	@FindBy(xpath="//p[@class='copyright-text']")
	private WebElement copyRightText;
	
	@FindBy(xpath="//a[@class='default-link contact-link']")
	private WebElement getInTouchLnk;
	
	@FindBy(xpath="//img[contains(@alt, 'twitter')]")
	private WebElement twitterLnk;
	
	@FindBy(xpath="//img[contains(@alt, 'instagram')]")
	private WebElement instagramLnk;
	
	@FindBy(xpath="//img[contains(@alt, 'linkedIn')]")
	private WebElement linkedInLnk;
	
	@FindBy(xpath="//a[contains(@class, 'privacy-policy')]")
	private WebElement privacyPolicyLnk;
	
	@FindBy(xpath="//a[contains(@href, 'careers')]")
	private WebElement careersLnk;
	
	//Constructor
	public BasePageClass(WebDriver webDriver){
		this.webDriver = webDriver;
		PageFactory.initElements(this.webDriver, this);	    
	}
	
	public Boolean verifyHeaderHomePageLnk(){	
		return verifyElements(homePageLnk);
	}
	
	public Boolean verifyHeaderApproachLnk(){	
		return verifyElements(approachLnk);
	}
	
	public Boolean verifyHeaderProductsLnk(){	
		return verifyElements(productsLnk);
	}
	
	public Boolean verifyHeaderIndustriesLnk(){	
		return verifyElements(industriesLnk);
	}
	
	public Boolean verifyHeaderNewsroomLnk(){	
		return verifyElements(newsroomLnk);
	}
	
	public Boolean verifyHeaderBeyonduptakeLnk(){	
		return verifyElements(beyonduptakeLnk);
	}
	
	public Boolean verifyHeaderBlog(){	
		return verifyElements(blog);
	}
	
	public Boolean verifyHeaderGetAnExecutiveBriefingBtn(){	
		return verifyElements(getAnExecutiveBriefingBtn);
	}
	
	public Boolean verifyFooterTextContent(){	
		return verifyElements(textContent);
	}
	
	public Boolean verifyFooterCopyRightText(){	
		return verifyElements(copyRightText);
	}
	
	public Boolean verifyFooterGetInTouchLnk(){	
		return verifyElements(getInTouchLnk);
	}
	
	public Boolean verifyFooterTwitterLnk(){	
		return verifyElements(twitterLnk);
	}
	
	public Boolean verifyFooterInstagramLnk(){	
		return verifyElements(instagramLnk);
	}
	
	public Boolean verifyFooterLinkedInLnk(){	
		return verifyElements(linkedInLnk);
	}
	
	public Boolean verifyFooterPrivacyPolicyLnk(){	
		return verifyElements(privacyPolicyLnk);
	}
	
	public Boolean verifyFooterCareersLnk(){	
		return verifyElements(careersLnk);
	}
	
	//Header Links clicks
	public void clickApproachLink(){
		approachLnk.click();
	}
	
	public void clickHomePageLink(){
		homePageLnk.click();
	}
	
	public void clickProductsLink(){
		productsLnk.click();
	}
	
	public void clickIndustriesLink(){
		industriesLnk.click();
	}
	
	public void clickNewsRoomLink(){
		newsroomLnk.click();
	}
	
	public void clickBeyondUptakeLink(){
		beyonduptakeLnk.click();
	}
	
	public void clickBlogLink(){
		blog.click();
	}
	
	public void clickExecutiveSummaryLink(){
		getAnExecutiveBriefingBtn.click();
	}
	
	//Footer Links Clicks
	public void clickGetInTouchLink(){
		getInTouchLnk.click();
	}
	
	public void clickTwitterLink(){
		twitterLnk.click();
	}
	
	public void clickInstagramLink(){
		instagramLnk.click();
	}
	
	public void clickLinkedInLink(){
		linkedInLnk.click();
	}
	
	public void clickPrivacyPolicyLink(){
		privacyPolicyLnk.click();
	}
	
	public void clickCareersLink(){
		careersLnk.click();
	}
	
	//Common method to verify an Element visibility 
	public Boolean verifyElements(WebElement webElement){
		waitForElement(webElement, 15);
		return webElement.isDisplayed();
	}
	
	//Common method to wait for an Element
	public void waitForElement(WebElement element, int timeout){
		WebDriverWait wait = new WebDriverWait(webDriver,timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}

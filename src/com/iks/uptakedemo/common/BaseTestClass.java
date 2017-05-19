package com.iks.uptakedemo.common;

//Importing dependencies
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

/**
 * @author Isha
 *  
 */
public class BaseTestClass {
	
	private static WebDriver webDriver;
	
	public WebDriver getDriver(){
		return webDriver;
	}
	
	private static WebDriver initializeDriver(String URL, String DRIVER_PATH){
		System.out.println("Initializing Firefox browser");
		System.setProperty("webdriver.gecko.driver", DRIVER_PATH);
		webDriver = new FirefoxDriver();
		webDriver.get(URL);
		System.out.println(URL);
		return webDriver;
	}
	
	@Parameters({"URL","DRIVER_PATH"})
	@BeforeClass
	public void initializeBaseClass(String URL, String DRIVER_PATH) {
		initializeDriver(URL,DRIVER_PATH);
	}
	
	@AfterClass
	public void tearDown() {
		webDriver.quit();
	}	
}

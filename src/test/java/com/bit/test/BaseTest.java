package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Helper;

public class BaseTest {
	
	WebDriver driver;
	static Properties prop;      //configure file to open browser
	
	@BeforeClass
	public static void configureFile() throws IOException {
		
		prop=Helper.readPropertyFile("C:\\Users\\fyros\\eclipse\\Zakir\\ReviewMaven\\config.properties");//call read property method
		
	}
	
	//open browser
	@Before
	public void goToUrl() {
		//open browser in cross browsing way
		String b=prop.getProperty("browser");
		if(b.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}else if (b.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
	}
	
	
	
	//close browser
	@After
	public void closeBrowser() {
		//close browser
		driver.close();
	}
	//close configuration
	@AfterClass
	public static void closeFile() {
		//close property file
		
	}

}

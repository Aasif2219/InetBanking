package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public String baseURL="https://demo.guru99.com/V4/";
	public String username="mngr384150";
	public String password="YzysYpe";
	public static WebDriver driver;
	
//	public static Logger logger=Logger.getLogger("Log4j.properties");
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}

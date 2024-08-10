package Test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page_object.Login_pagef;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Login_pagef {
	WebDriver driver;
	Login_pagef Lpage;

	@BeforeClass
	public void lanunchBrowser()
	{
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();


	driver.get("https://www.saucedemo.com/v1/");
    Lpage=new Login_pagef(driver);
}
	@Test(priority=1)
	public void Testlogin() throws InterruptedException
	{
		Lpage.login("standard_user","secret_sauce");
	}
}

	
	
	
	
	
	
	
	
	
	
	

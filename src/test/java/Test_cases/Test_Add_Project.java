package Test_cases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page_object.Add_product;
import Page_object.Login_pagef;
import Utility.Screen_Shot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Add_Project {
	WebDriver driver;
	Login_pagef Lpage;
	Add_product Aproduct;

	@BeforeClass
	public void lanunchBrowser()
	{
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://www.saucedemo.com/v1/");
    Lpage=new Login_pagef(driver);
}
	@Test(priority=1)
	public void Testlogin() throws InterruptedException
	{
		Lpage.login("standard_user","secret_sauce");
		Screen_Shot.captureScreenshot(driver,"Testlogin");
	}
	@Test(priority=2)
	public void Test_product()
	{
		Aproduct=new Add_product(driver);
		Aproduct.Product();
		Screen_Shot.captureScreenshot(driver,"Addproduct");
}
	}
	

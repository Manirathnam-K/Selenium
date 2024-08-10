package Page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pagef {
	@FindBy(id="user-name")
	WebElement Uname;
	@FindBy(name="password")
	WebElement PWD;
	@FindBy(className="btn_action")
	WebElement login_button;
	public Login_pagef(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void login(String username,String password) throws InterruptedException
	{
		Uname.sendKeys(username);
		PWD.sendKeys(password);
		login_button.click();
		Thread.sleep(3000);
		}
	}
	
	



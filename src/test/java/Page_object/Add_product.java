package Page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_product {
	@FindBy(partialLinkText="Backpack")
	WebElement Add1;
	@FindBy(css=".btn_primary.btn_inventory")
	WebElement Add2;
	@FindBy(className="inventory_details_back_button")
	WebElement Add3;
	public Add_product(WebDriver driver) 
	{
		PageFactory.initElements(driver, this); //syntax
	}
	public void Product() 
	{
		Add1.click();
		Add2.click();
		Add3.click();
	}

}


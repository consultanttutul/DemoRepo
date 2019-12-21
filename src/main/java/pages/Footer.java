package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {
	
	WebDriver driver;
	public Footer(WebDriver dr) {
	driver = dr;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="") WebElement privacy;


}
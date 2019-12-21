package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PoloShirtsPage {

	
	protected WebDriver driver;
	
	public PoloShirtsPage(WebDriver dr) {
		
		driver = dr;
	}
	
	@FindBy(xpath="//*[@id=\"mainContainer\"]/div[3]/div/div/div[1]/div[3]/div[2]/ul/li[1]/div/div[2]/div/div/div/div[1]/div[1]/a") WebElement ClickOnOneProduct;
	
	public void verifyAllProductClickable() {
		
		
	}
	public PoloProductDetailsPage clickOnOneProduct() {
		
		return new PoloProductDetailsPage(driver);
	}
	
}

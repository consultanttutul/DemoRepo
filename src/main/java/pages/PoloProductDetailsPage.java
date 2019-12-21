package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.Helper;

public class PoloProductDetailsPage {
	
	protected WebDriver driver;
	
	
	public PoloProductDetailsPage(WebDriver dr) {
		
		driver = dr;
		
	}
	@FindBy(xpath="//div[@id='select-652']") WebElement ClickOnColorBox;
	
	
	
	public void selectColor() {

	}
	public void selectSize() {

	}
	public void selectQuantity() {

	}
	public void clickShipItButton() {

	}
	public void clickContinueToShopping() {

	}
	
	public CheckOutPage clickViewCartAndCheckOut() {
		
		return new CheckOutPage(driver);

	}
}

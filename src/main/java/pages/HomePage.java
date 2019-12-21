package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class HomePage {
	
	
	protected WebDriver driver;
	
	public HomePage(WebDriver dr) {
		
	      driver = dr;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Categories']") WebElement CategoryMenu;
	@FindBy(xpath="//ul[@class='NavigationList-sc-1ltyzy8-0 iHsBIj']/li[5]/a") WebElement MenMenu;
	@FindBy(xpath="//ul[@class='NavigationList-sc-1ltyzy8-0 iHsBIj']/li[5]/a") WebElement MensClothingMenu;
	@FindBy(xpath="//li[@id='5xu28']/a") WebElement ShirtMenu;
	@FindBy(xpath="//li[@id='55cxg']/a") WebElement PoloShirtMenu;
	@FindBy(xpath="//li[@id='5xu2b']/a") WebElement JeansMenu;
	
	
	
	
	
    public void clickCategory() {
	
    	Helper.click(CategoryMenu);
	
    }

    public void clickMen() {
	
	Helper.click(MenMenu);
    }

    public void clickMensClothing() {
	Helper.click(MensClothingMenu);
	
    }

    public void clickShirt() {
	Helper.click(ShirtMenu);
	
    }

    public PoloShirtsPage clickPoloShirts() {
	
    	return new PoloShirtsPage(driver);
	
    }
    
    public JeansPage clickJeansPage() {
    	
    	return new JeansPage(driver);
    }
		

}

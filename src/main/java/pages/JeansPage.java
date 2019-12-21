package pages;

import org.openqa.selenium.WebDriver;

public class JeansPage {
	
	
	protected WebDriver driver;
	
	public JeansPage(WebDriver dr) {
		
		this.driver = dr;
		
	}
	
	public JeansProductDetailsPage clickOnOneJeansProduct() {
		
		
		
		return new JeansProductDetailsPage(driver);
	}
	
	

}

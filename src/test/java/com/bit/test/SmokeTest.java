package com.bit.test;

import pages.CheckOutPage;
import pages.HomePage;
import pages.JeansPage;
import pages.JeansProductDetailsPage;
import pages.PoloProductDetailsPage;
import pages.PoloShirtsPage;

public class SmokeTest extends BaseTest {
	
	HomePage homepage;
	PoloShirtsPage poloShirtsPage;
	PoloProductDetailsPage poloProductDetailPage;
	CheckOutPage checkOutPage;
	JeansPage jeansPage;
	JeansProductDetailsPage jeansProductDetailPage;
	
	
	
	public void buyPoloShirtWithSameBillingAndShippingAndPaypal() {
		
		
		
		homepage=new HomePage(driver);
		
		homepage.clickCategory();
		homepage.clickMen();
		homepage.clickMensClothing();
		homepage.clickShirt();
		poloShirtsPage =homepage.clickPoloShirts();
		poloShirtsPage.verifyAllProductClickable();
		poloProductDetailPage =poloShirtsPage.clickOnOneProduct();
		poloProductDetailPage.selectColor();
		poloProductDetailPage.selectQuantity();
		poloProductDetailPage.selectSize();
		poloProductDetailPage.clickShipItButton();
		poloProductDetailPage.clickContinueToShopping();
		checkOutPage=poloProductDetailPage.clickViewCartAndCheckOut();
		checkOutPage.clickReadyToCheckOut();
		
		
	}
	
	public void buyJeansWithDifferentBillingAndShippingAndPaypal() {
		
		homepage=new HomePage(driver);
		
		homepage.clickCategory();
		homepage.clickMen();
		homepage.clickMensClothing();
		jeansPage =homepage.clickJeansPage();
		jeansProductDetailPage=jeansPage.clickOnOneJeansProduct();
	}
	
    public void buyPoloShirtWithSameBillingAndShippingAndCreditCard() {
		
		
		
	}

}

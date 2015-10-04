package com.ocado;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OcadoFinalTest {
 
	private WebDriver driver;
 
	/*Scenario: Add items on offer 'Buy any XX for XX' to the basket 

	   Given a customer on Browse Shop page 
	   When 'Buy any XX for XX' promo is available And promotion conditions are met 
	   Then total amount in basket is calculated correct*/
	
   @Before
   public void setUp()  {
     driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

     
  @Test
  public void verifyLoggedOutCustomerIsAbleToAddItemsOnPromoToBasket() throws Exception {

	  BrowseShopPage browseShop = new BrowseShopPage(driver);
	 
	  SearchItemPage searchItem = browseShop.searchSpecifiedIteam("Buy any");
	  
	  
	
  }

  @After
  public void tearDown() {
    driver.quit();

  }

}

package com.ocado;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class OcadoFinalTest2 {
 
	private WebDriver driver;
 
   @Before
   public void setUp()  {
     driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

 /* Feature: Logged in customer should have item on promo correctly accrued. 
  * 
  * Scenario: Add items from Offers page to basket 
  * 
  * Given a logged in customer 
  * When Offers page is displayed 
  * Then add items met promo conditions to trolley*/
   
   
   
   
   @Test
  public void verifyLoggedincustomershouldhaveitemonpromocorrectlyaccrued() throws Exception {

	   		// given
			LoginToOcadoPage loginPage = PageFactory.initElements(driver, LoginToOcadoPage.class);
			loginPage.open();
			loginPage.click("loginButton");
			MainPage mainPage = loginPage.logIn("gadhet@o2.pl", "Ocado123");
			
			// when
			Thread.sleep(3000);
			mainPage.click(By.linkText("Offers"));
			Thread.sleep(3000);
		
			mainPage.verifyTitle("Ocado: Offers");
			// then
			
			//driver.findElement(By.xpath("//*[@id='productDetails-67190011-form']/span[2]/input")).click();
			mainPage.isElementPresent(By.xpath("//*[@id='trolleyWrap']/div/div[2]"));
			
			List<WebElement> elements = driver.findElements(By.xpath(("//*[@id='productDetails-*']")));
		       System.out.println("Test number of elements: " + elements.size());

	            for(WebElement ele : elements){
	                System.out.println(ele.getText());
	                //System.out.println(ele.getAttribute("form"));
	                //System.out.println(ele.getTagName());
	            } 
	
  }

  @After
  public void tearDown() {
    driver.quit();

  }

}

package com.ocado;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OcadoFinalTest3 {
 
	private WebDriver driver;
 
   @Before
   public void setUp()  {
     driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

 /*  Feature: Savings feature in top menu display correct value 
   
   Scenario: As logged out customer add Half price item to basket 
  
   Given a customer on Browse Shop page
   When customer add item in Half price promo to basket 
   Then saving field is updated And contains correct savings value*/
   
   
   
   
   @Test
  public void verifyAsloggedoutcustomeraddHalfpriceitemtobasket() throws Exception {
	   //Given
	   MainPage mainPage = new MainPage(driver);
	   mainPage.open();
	   mainPage.click(By.linkText("Browse Shop"));
	   
	   //When
	   mainPage.click(By.partialLinkText("Half Price, was"));
	   
	   //Then
	   //driver.findElement(By.name("quantity")).sendKeys("2");
	   driver.findElement(By.name("addproduct")).click();
	   //System.out.println(driver.findElement(By.xpath("//span[@id='basketSummaryTotal']")).getText());
	   String TotalPrice = driver.findElement(By.xpath("//span[@id='basketSummaryTotal']")).getText();
	   System.out.println(TotalPrice.substring(1));
	   double TotalPriceDouble = Double.parseDouble(TotalPrice.substring(1));
	   System.out.println(TotalPriceDouble);
	   
	   //System.out.println(driver.findElement(By.xpath("//span[@id='basketSummarySavings']")).getText());
	   
	   String wasPrice = driver.findElement(By.xpath("//span[@class='wasPrice']")).getText();
	   System.out.println(wasPrice.substring(1));
	   double wasPriceDouble = Double.parseDouble(wasPrice.substring(1));
	   System.out.println(wasPriceDouble);
	   
	   
	   //System.out.println(driver.findElement(By.xpath("//span[@class='wasPrice']")).getText());
	   String nowPrice =  driver.findElement(By.xpath("//span[@class='nowPrice']")).getText();
	   System.out.println(nowPrice.substring(1));
	   double nowPriceDouble = Double.parseDouble(nowPrice.substring(1));
	   System.out.println(nowPriceDouble);
	   //System.out.println(driver.findElement(By.xpath("//span[@class='nowPrice']")).getText());
	   TotalPriceDouble=wasPriceDouble/2;
	   
  }

  @After
  public void tearDown() {
    driver.quit();

  }

}

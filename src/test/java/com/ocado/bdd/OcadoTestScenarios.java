package com.ocado.bdd;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import static org.fest.assertions.Assertions.assertThat;

import org.eclipse.jetty.websocket.api.SuspendToken;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.ocado.LoginToOcadoPage;
import com.ocado.MainPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OcadoTestScenarios {
	private WebDriver driver;

	
	   @Before
	   public void setUp()  {
	     driver = new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  //Scenario 1
	  @Given("^a customer on Browse Shop page$")
	  public void openBrowseShopPage() throws Throwable{
		  MainPage mainPage = new MainPage(driver);
		   mainPage.open();
		   mainPage.click(By.linkText("Browse Shop"));
	  }
		 
	  @When("^'Buy any (\\d+) for (\\d+)' promo is available And promotion conditions are met$")
	  public void searchItem(int num1, int num2){
		  MainPage mainPage = new MainPage(driver);
		  mainPage.click(By.partialLinkText("Buy any "+num1+" add "+num2+" free"));
		  

	  }
	  
	  @Then("^total amount in basket is calculated correct$")
	  public void checkSavingValue() throws Throwable{
		  //To finish change to PageObject
		  MainPage mainPage = new MainPage(driver);
		  System.out.println(driver.findElement(By.xpath("//a[@class='button secondary']/span")).getText());
		  
		  driver.findElement(By.name("quantity")).clear();
		  mainPage.insertTextByName("quantity", "2");
		  mainPage.click(By.name("addproduct"));
		  
		  Thread.sleep(2000);
		  String basketTotalPrice = mainPage.getTextByXPath("//span[@id='basketSummaryTotal']");
		  System.out.println(basketTotalPrice);
		  double basketTotalPriceDouble = Double.parseDouble(basketTotalPrice.substring(1));
		 
		  String basketSummaryCount = mainPage.getTextByXPath("//span[@id='basketSummaryCount']");
		  System.out.println(basketSummaryCount);
		  int basketSummary = Integer.parseInt(basketSummaryCount);
		  mainPage.assertText(By.xpath("//span[@id='basketSummaryCount']"), "2");
		  
		  String typicalPrice = mainPage.getTextByXPath("//div[@class='typicalPrice']");
		  System.out.println(typicalPrice);
		  double typicalPriceDouble = Double.parseDouble(typicalPrice.substring(1));
		   
		  //basketTotalPrice=typicalPriceDouble/basketSummary;
		  //Assert.assertEquals(totalPriceDouble, totalPriceDouble);
		  //assertThat("actual").isEqualTo(basketSummaryCount);
	  }
	  
	  //Scenario 2
	  @Given("^a logged in customer$")
	  public void loginToOcadoAsCustomer() throws Throwable{
		  LoginToOcadoPage loginPage = PageFactory.initElements(driver, LoginToOcadoPage.class);
			loginPage.open();
			loginPage.click("loginButton");
			Thread.sleep(2000);
			MainPage mainPage = loginPage.logIn("ocadobddtest@mailinator.com", "Ocado123");
			Thread.sleep(2000);
			mainPage.click(By.linkText("View trolley"));
			mainPage.click(By.linkText("Empty your trolley"));
			Thread.sleep(2000);
			mainPage.click("empty-trolley-popup-btn");
	  }
		 
	  @When("^Offers page is displayed$")
	  public void searchItem1(){
		  MainPage mainPage = new MainPage(driver);

		  mainPage.click(By.linkText("Offers"));
	
		  mainPage.verifyTitle("Ocado: Offers");
	  }
	   
	  @Then("^add items met promo conditions to trolley$")
	  public void addItemToTrolley() throws Throwable{
		  //To finish
		  MainPage mainPage = new MainPage(driver);
		  mainPage.click(By.xpath("//input[@class='productAdd']"));
		  mainPage.click(By.linkText("View trolley"));
		  Thread.sleep(1000);	
		  mainPage.iterateOverElements("//div[@id='centralColumn']/ul/li");
		  Thread.sleep(1000);	  
		  mainPage.click(By.className("trolleyInfo"));
		  Thread.sleep(1000);
		  System.out.println(mainPage.getTextByXPath("//div[@id='hoverTip']/p/a[1]"));
	  }
	  
	  
	  //Scenario 3
	  @Given("^a customer on Browse Shop1 page$")
	  public void openBrowseShopPage3() throws Throwable{
		  MainPage mainPage = new MainPage(driver);
		   mainPage.open();
		   mainPage.click(By.linkText("Browse Shop"));
		 
	  }
		 
	  @When("^customer add item in Half price promo to basket$")
	  public void customerAddIteminHalfPriceToBasket() throws Throwable{
		  MainPage mainPage = new MainPage(driver);
		  mainPage.click(By.partialLinkText("Half Price, was"));
		  Thread.sleep(2000);
	  }
	   
	  @Then("^saving field is updated And contains correct savings value$")
	  public void savingFieldIsUpdatedAndContainsCorrect(){
		   //To finish change to PageObject
		   driver.findElement(By.name("addproduct")).click();

		   String TotalPrice = driver.findElement(By.xpath("//span[@id='basketSummaryTotal']")).getText();
		   double TotalPriceDouble = Double.parseDouble(TotalPrice.substring(1));
		  		   
		   String wasPrice = driver.findElement(By.xpath("//span[@class='wasPrice']")).getText();
		   double wasPriceDouble = Double.parseDouble(wasPrice.substring(1));
		   
		   String nowPrice =  driver.findElement(By.xpath("//span[@class='nowPrice']")).getText();
		   double nowPriceDouble = Double.parseDouble(nowPrice.substring(1));
		  
		   TotalPriceDouble=wasPriceDouble/2;
			
	  }
	 
	  @After
	  public void tearDown() {
	    driver.quit();

	  }
}

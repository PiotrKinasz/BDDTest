package com.ocado;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowseShopPage {
	WebDriver driver;
	
	public BrowseShopPage(WebDriver driver){
		this.driver = driver;
		
		String baseUrl = "https://www.ocado.com/";
		driver.manage().window().maximize();
		driver.get(baseUrl + "/webshop/startWebshop.do?dnr=y");
		driver.findElement(By.linkText("Browse Shop")).click();
		
	}
	
	public SearchItemPage searchSpecifiedIteam(String item){
		 if (driver.getPageSource().contains(item))
		  {
			  System.out.println("Jest tekst");
			  WebElement firstLink = driver.findElement(By.partialLinkText(item));
			  System.out.println(firstLink.getAttribute("href"));
			  firstLink.click();
		  }
		  else
		  {
			  System.out.println("Nie ma tekstu");
		  }
		
		return new SearchItemPage(driver);
	}
	
}

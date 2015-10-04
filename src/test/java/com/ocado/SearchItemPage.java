package com.ocado;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchItemPage {
	private WebDriver driver;
	
	public SearchItemPage(WebDriver driver){
		this.driver = driver;
	}
	
	protected void Click(By Link)
	{
		driver.findElement(Link).click();
		
	}
	
	protected void iterateOverElements(String xpath) {
	       List<WebElement> menu = driver.findElements(By.xpath(xpath));

	       for (int i = 1; i <= menu.toArray().length; i++) {
	    	   Click(By.xpath(xpath + "[" + i + "]"+"/a/span"));
	       }

	}
}

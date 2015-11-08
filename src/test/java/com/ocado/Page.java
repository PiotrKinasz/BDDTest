package com.ocado;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByName;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class Page {

	public static final String BASE_URL = "http://www.ocado.com/";

	protected final WebDriver driver;

	protected final WebDriverWait wait;

	private String title;

	public Page(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public void open() {
			driver.get(BASE_URL);
			verifyIsOnThePage();
			driver.manage().window().maximize();
	}
	
	public void verifyIsOnThePage() {
		if (title != null) {
	    verifyTitle(title);
    }
	}

	public void verifyTitle(String expected) {
		assertThat(driver.getTitle()).isEqualTo(expected);
	}

	protected void verifyTextPresent(String expected) {
		assertThat(driver.getPageSource()).contains(expected);
	}

	public void insertText(String elementId, String name) {
		WebElement element = findById(elementId);
		element.sendKeys(name);
	}
	
	public void insertTextByName(String elementName, String name) {
		WebElement element = findByName(elementName);
		element.sendKeys(name);
	}

	protected void insertTextAndSubmit(String elementId, String name) {
		WebElement element = findById(elementId);
		element.sendKeys(name);
		element.submit();
	}

	public void click(String elementId) {
		WebElement element = findById(elementId);
		element.click();
	}
	
	public void click(By by) {
		WebElement element = driver.findElement(by);
		element.click();
	}
	
	public String getTextByXPath(String elementXPath) {
		WebElement element = findByXPath(elementXPath);
		return element.getText();
	}

	protected void clickAndSubmit(String elementId) {
		WebElement element = findById(elementId);
		element.click();
		element.submit();
	}

	protected WebElement findById(String elementId) {
		return driver.findElement(By.id(elementId));
	}
	
	protected WebElement findByName(String elementName) {
		return driver.findElement(By.name(elementName));
	}
	
	protected WebElement findByXPath(String elementXPath) {
		return driver.findElement(By.xpath(elementXPath));
	}
	
	public void assertText(By identifier, String expected) {
		assertEquals(driver.findElement(identifier).getText(), expected);
	}
	
	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public void iterateOverElements(String xpath) {
			
		List<WebElement> menu = driver.findElements(By.xpath(xpath));

		for (int i = 1; i <= menu.toArray().length; i++) {
			click(By.xpath(xpath + "[" + i + "]"));
			
		}
	}
	
}

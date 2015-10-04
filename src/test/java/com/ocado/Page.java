package com.ocado;

import static org.fest.assertions.Assertions.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	protected void insertText(String elementId, String name) {
		WebElement element = findById(elementId);
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

	protected void clickAndSubmit(String elementId) {
		WebElement element = findById(elementId);
		element.click();
		element.submit();
	}

	protected WebElement findById(String elementId) {
		return driver.findElement(By.id(elementId));
	}
	
	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	
}

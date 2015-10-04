package com.ocado;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginToOcadoPage extends Page {
	
	@FindBy(id = "username")
	private WebElement login;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@CacheLookup
	@FindBy(id = "js-popupLoginButton")
	private WebElement commit;


	public LoginToOcadoPage(WebDriver driver){
		super(driver);
	}
	
	public MainPage logIn(String username, String pass) {

		login.sendKeys(username);
		password.sendKeys(pass);
		commit.click();

		return new MainPage(driver);
	}
			
}


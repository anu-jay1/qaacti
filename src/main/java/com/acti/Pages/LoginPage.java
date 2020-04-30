package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.Base.DriverScript;

/*
 * Script: LoginPage
 * Tester:Anu
 * Verified By:Anu
 * Date Created:04/30/2020
 * Date Modified:04/30/2020 
 * 
 */

public class LoginPage extends DriverScript
{
	
//************************Page Elements*******************************//	
	
	@FindBy(id="logoContainer") WebElement actiLogo;
	@FindBy(id="username") WebElement usernameTb;
	@FindBy(name="pwd") WebElement passwordTb;
	@FindBy(id="loginButton") WebElement loginButton;
//************************Page Initialization*******************************//	
	
	//PageFactory is a class in POM which is used to initialize the Page elements of the class
	public LoginPage()
	{
		PageFactory.initElements(driver, this); //LoginPage.class); instead of like this we can give this
	}
	//************************Page Actions/Methods*******************************//	
	
	public boolean verifyActiLogo()
	{
		return actiLogo.isDisplayed();
	}
	public void validateLogin(String username, String password)
	{
		usernameTb.sendKeys(username);
		passwordTb.sendKeys(password);
		loginButton.click();
	}
	public String verifyTitlePage()
	{
		return driver.getTitle();
	}
}

package com.acti.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.acti.Base.DriverScript;
import com.acti.Pages.LoginPage;

/*
 * Script: LoginPage
 * Tester:Anu
 * Verified By:Anu
 * Date Created:04/30/2020
 * Date Modified:04/30/2020 
 * 
 */

public class LoginPageTest extends DriverScript
{
	LoginPage lp;
	
	public LoginPageTest()
	{
		//super class constructor is used to call the parent class constructor
		super();
	}
		
	
	@BeforeMethod
	public void preTest()
	{
		initApp();
		lp = new LoginPage();
	}
	
	@AfterMethod
	public void postTest()
	{
		driver.close();
	}
	
	@Test(priority=1)
	public void testVerifyActiLogo()
	{
		boolean flag = lp.verifyActiLogo();
		Assert.assertTrue(flag);	
		
	}
	@Test(priority=2)
	public void testLoginPageTitle()
	{
		String title = lp.verifyTitlePage();
		Assert.assertEquals("actiTIME - Login", title);	
		
	}
	@Test(priority=3)
	public void testValidateLoginButton()
	{
		lp.validateLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
}

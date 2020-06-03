package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(name="userName")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement signin;
	
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void applicationLogin()
	{
		uname.sendKeys("mercury");
		pass.sendKeys("mercury");
		signin.click();
		
	}
	
	
	
}

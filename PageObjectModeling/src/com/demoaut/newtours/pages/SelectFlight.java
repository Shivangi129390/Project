package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {

	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(9) > tbody > tr:nth-child(3) > td.frame_action_xrows > input[type=radio]")
	private WebElement departflight;
	
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(10) > tbody > tr:nth-child(5) > td.frame_action_xrows > input[type=radio]")
	private WebElement returnflight;
	
	@FindBy(name="reserveFlights")
	private WebElement continue_btn;
	
	public SelectFlight(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectflights()
	{
		departflight.click();
		returnflight.click();
		continue_btn.click();
	}
	
	
}

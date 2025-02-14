package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightConfirmation {
  @FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)")
  private WebElement confirmationmsg;
  
  public FlightConfirmation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

public String flightconfirmation() {
	return confirmationmsg.getText();
}
}

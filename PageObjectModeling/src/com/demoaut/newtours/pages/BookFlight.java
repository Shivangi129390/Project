package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookFlight {
	@FindBy(name="passFirst0")
	private WebElement f_name1;
	
	@FindBy(name="passLast0")
	private WebElement l_name1;
	
	@FindBy(name="passFirst1")
	private WebElement f_name2;
	
	@FindBy(name="passLast1")
	private WebElement l_name2;
	
	@FindBy(name="creditnumber")
	private WebElement credit_number;

	@FindBy(name="buyFlights")
	private WebElement securepurchase_btn;
	
	public BookFlight(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void bookflight(String firstname1, String lastname1, String firstname2, String lastname2,String creditcard)
	{
		// TODO Auto-generated method stub
		f_name1.sendKeys(firstname1);
		l_name1.sendKeys(lastname1);
		
		f_name2.sendKeys(firstname2);
		l_name2.sendKeys(lastname2);
		
		credit_number.sendKeys(creditcard);
		
		securepurchase_btn.click();
		
	}


}

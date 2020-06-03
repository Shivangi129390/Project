package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > b > font > input[type=radio]:nth-child(1)")
	private WebElement trip_type; 
	
	@FindBy(name="passCount")
	private WebElement passengers;
	
	@FindBy(name="fromPort")
	private WebElement depart_from ;
	
	@FindBy(name="fromMonth")
	private WebElement d_month  ;
	
    @FindBy(name="fromDay")
	private WebElement d_day;
    
    @FindBy(name="toPort")
	private WebElement arrive_in ;
    
    @FindBy(name="toMonth")
	private WebElement a_month  ;
	
    @FindBy(name="toDay")
	private WebElement a_day;
    
    @FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > input[type=radio]")
    private WebElement service_class;
    
    @FindBy(name="airline")
    private WebElement prefAirline;
    
    @FindBy(name="findFlights")
    private WebElement submit;

    
    public FlightFinder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    public void enterflightdetails()
    {
    	trip_type.click();
    	
    	Select passanger_dd = new Select(passengers);
    	passanger_dd.selectByIndex(1);
    	
    	Select depart_dd = new Select(depart_from);
    	depart_dd.selectByIndex(3);
    	
    	Select departmonth_dd = new Select(d_month);
    	departmonth_dd .selectByIndex(0);
    	
    	Select departday_dd = new Select(d_day);
    	departday_dd.selectByVisibleText("10");;
    	
    	
    	Select arrive_dd = new Select(arrive_in);
    	arrive_dd.selectByIndex(2);
    	
    	Select arrivemonth_dd = new Select(a_month);
    	arrivemonth_dd .selectByIndex(2);
    	
    	Select arriveday_dd = new Select(a_day);
    	arriveday_dd.selectByVisibleText("25");;
    	
    	service_class.click();
    	
    	Select airline_dd = new Select(prefAirline);
    	airline_dd .selectByIndex(1);
    	
    	submit.click();
    }
	
}

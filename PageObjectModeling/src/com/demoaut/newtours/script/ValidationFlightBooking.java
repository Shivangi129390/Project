package com.demoaut.newtours.script;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.pages.*;

public class ValidationFlightBooking {
	
	WebDriver driver;
	 
	@BeforeTest
	public void openapplication()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	
	@Test
	public void verifyflight()
	{
		Login login = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookFlight bf = new BookFlight(driver);
		FlightConfirmation fc = new FlightConfirmation(driver);
		
		login.applicationLogin();
		ff.enterflightdetails();
		sf.selectflights();
		bf.bookflight("Shivangi","Patel","Jinav","Patel","110630107020");
		String actual_msg = fc.flightconfirmation();
		String expected_msg = "Your itinerary has been booked!";
		Assert.assertEquals(actual_msg, expected_msg);
		
		
	}
	
	
	@AfterTest
	public void closeapplication()
	{
		driver.close();
	}
	
	

}

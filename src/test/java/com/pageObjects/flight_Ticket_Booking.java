package com.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flight_Ticket_Booking {

	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor je;
	Select dpcountry;
	Actions action;
	
	public flight_Ticket_Booking(WebDriver rdriver)
	{
		ldriver=rdriver;
		wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		 je = (JavascriptExecutor) ldriver;
		 action = new Actions(ldriver);
	  	PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(partialLinkText="Flights")
	@CacheLookup
	WebElement flight_link;
	
	@FindBy(xpath="//*[@name='passCount']")
	@CacheLookup
	WebElement seat;
	
	@FindBy(xpath="//*[@name='fromPort']")
	@CacheLookup
	WebElement destination;
	
	@FindBy(xpath="//*[@name='fromMonth']")
	@CacheLookup
	WebElement from_month;
	
	@FindBy(xpath="//*[@name='fromDay']")
	@CacheLookup
	WebElement from_date;
	
	@FindBy(xpath="//*[@name='toPort']")
	@CacheLookup
	WebElement Arrived;
	
	@FindBy(xpath="//*[@name='toMonth']")
	@CacheLookup
	WebElement to_month;
	
	@FindBy(xpath="//*[@name='toDay']")
	@CacheLookup
	WebElement to_date;
	
	@FindBy(xpath="//*[@value='Business']")
	@CacheLookup
	WebElement flightclass;
	
	@FindBy(xpath="//*[@name='airline']")
	@CacheLookup
	WebElement airLine;
	
	@FindBy(xpath="//*[@name='findFlights']")
	@CacheLookup
	WebElement continuebtn;
	
	public void flightlink() {
		flight_link.click();
		ldriver.navigate().back();
		ldriver.navigate().forward();
	}
	
	public void passengerscount() {
		wait.until(ExpectedConditions.visibilityOf(seat));
		Select count = new Select(seat);
		count.selectByValue("3");
	}
	
	public void destination_Place() {
		wait.until(ExpectedConditions.visibilityOf(destination));
		Select count = new Select(destination);
		count.selectByValue("Paris");
	}
	
	public void FromMonth() {
		wait.until(ExpectedConditions.visibilityOf(from_month));
		Select count = new Select(from_month);
		count.selectByValue("9");
	}
	
	public void FromDate() {
		wait.until(ExpectedConditions.visibilityOf(from_date));
		Select count = new Select(from_date);
		count.selectByValue("31");	
	}
	
	public void Arrived_Place() {
		wait.until(ExpectedConditions.visibilityOf(Arrived));
		Select count = new Select(Arrived);
		count.selectByValue("London");
	}
	
	public void ToMonth() {
		wait.until(ExpectedConditions.visibilityOf(to_month));
		Select count = new Select(to_month);
		count.selectByValue("2");
	}
	
	public void ToDate() {
		wait.until(ExpectedConditions.visibilityOf(to_date));
		Select count = new Select(to_date);
		count.selectByValue("31");	
	}
	
	public void flight_class() {
		je.executeScript("window.scroll(0,document.body.scrollHeight)", "" );
		wait.until(ExpectedConditions.visibilityOf(flightclass));
		flightclass.click();
	}
	
	public void select_airline() {
		wait.until(ExpectedConditions.visibilityOf(airLine));
		Select count = new Select(airLine);
		count.selectByVisibleText("Blue Skies Airlines");
		
	}
	
	public void ctnbutton() {
		wait.until(ExpectedConditions.visibilityOf(continuebtn));
		continuebtn.click();
	}
	
}


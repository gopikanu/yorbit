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

public class payment {

	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor je;
	Select dpcountry;
	Actions action;
	
	public payment(WebDriver rdriver)
	{
		ldriver=rdriver;
		wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		 je = (JavascriptExecutor) ldriver;
		 action = new Actions(ldriver);
	  	PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(partialLinkText="Payment Gateway Project")
	@CacheLookup
	WebElement payment;
	
	@FindBy(xpath="//*[@name='quantity']")
	@CacheLookup
	WebElement quantity;
	
	@FindBy(xpath="//*[@class='button special']")
	@CacheLookup
	WebElement buynowBtn;
	
	@FindBy(xpath="//*[@name='card_nmuber']")
	@CacheLookup
	WebElement cardnumber;
	
	@FindBy(xpath="//*[@name='month']")
	@CacheLookup
	WebElement month;
	
	@FindBy(xpath="//*[@name='year']")
	@CacheLookup
	WebElement year;
	
	
	@FindBy(xpath="//*[@name='cvv_code']")
	@CacheLookup
	WebElement ccv;
	

	@FindBy(xpath="//*[@name='submit']")
	@CacheLookup
	WebElement submit;
	
	
	
	public void gotopayment_page() {
		wait.until(ExpectedConditions.visibilityOf(payment));
		payment.click();
		ldriver.navigate().back();
		ldriver.navigate().forward();
		je.executeScript("window.scroll(0,document.body.scrollHeight)", "" );
	}
	
	public void select_quantity() {
		wait.until(ExpectedConditions.visibilityOf(quantity));
		Select count = new Select(quantity);
		count.selectByVisibleText("5");
		
	}
	
	public void clkbuynow() {
		wait.until(ExpectedConditions.visibilityOf(buynowBtn));
		buynowBtn.click();
	}
	
	public void entercardnum() {
		je.executeScript("window.scroll(0,document.body.scrollHeight)", "" );
		wait.until(ExpectedConditions.visibilityOf(cardnumber));
		cardnumber.sendKeys("4415381465691157");
		
	}
	
	public void select_month() {
		wait.until(ExpectedConditions.visibilityOf(month));
		Select count = new Select(month);
		count.selectByVisibleText("02");
		
	}
	
	public void select_year() {
		wait.until(ExpectedConditions.visibilityOf(year));
		Select count = new Select(year);
		count.selectByVisibleText("2023");
		
	}
	
	public void select_ccv(String code) {
		wait.until(ExpectedConditions.visibilityOf(ccv));
		ccv.sendKeys(code);
		
	}
	
	public void submitbtn() {
		wait.until(ExpectedConditions.visibilityOf(submit));
		submit.click();
	}
	
	
	
	
	
	
}

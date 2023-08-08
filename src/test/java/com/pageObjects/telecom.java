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

public class telecom {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor je;
	Select dpcountry;
	Actions action;
	String customer_id;
	
	public telecom(WebDriver rdriver)
	{
		ldriver=rdriver;
		wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		 je = (JavascriptExecutor) ldriver;
		 action = new Actions(ldriver);
	  	PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(partialLinkText ="Telecom Project")
	@CacheLookup
	WebElement tele;
	
	@FindBy(partialLinkText ="Add Customer")
	@CacheLookup
	WebElement addc;
	
	@FindBy(xpath="//*[@id='main']/div/form/div/div[2]/label")
	@CacheLookup
	WebElement radio;
	
	@FindBy(xpath="//*[@name='fname']")
	@CacheLookup
	WebElement firstname;
	
	@FindBy(xpath="//*[@name='lname']")
	@CacheLookup
	WebElement lastname;
	
	@FindBy(xpath="//*[@name='emailid']")
	@CacheLookup
	WebElement mail;
	
	@FindBy(xpath="//*[@name='addr']")
	@CacheLookup
	WebElement add;
	
	@FindBy(xpath="//*[@name='telephoneno']")
	@CacheLookup
	WebElement phonenum;
	
	@FindBy(xpath="//*[@name='submit']")
	@CacheLookup
	WebElement submit;
	
	@FindBy(xpath="//*[@id='main']/div/div/table/tbody/tr[1]/td[2]/h3")
	@CacheLookup
	WebElement id;
	
	@FindBy(xpath="//*[@id='main']/div/div/ul/li/a")
	@CacheLookup
	WebElement home;
	
	@FindBy(partialLinkText ="Pay Billing")
	@CacheLookup
	WebElement paybill;
	
	@FindBy(xpath ="//*[@name='customer_id']")
	@CacheLookup
	WebElement customerid;
	
	@FindBy(xpath ="//*[@name='submit']")
	@CacheLookup
	WebElement sub;
	
	
	public void clktele_Link() {
		wait.until(ExpectedConditions.visibilityOf(tele));
		tele.click();
		ldriver.navigate().back();
		ldriver.navigate().forward();
	}
	
	public void add_customer() {
		wait.until(ExpectedConditions.visibilityOf(addc));
		addc.click();
	}
	
	public void f_Name(String f_name) {
		wait.until(ExpectedConditions.visibilityOf(firstname));
		firstname.sendKeys(f_name);
	
	}
	
	public void l_Name(String l_name) {
		wait.until(ExpectedConditions.visibilityOf(lastname));
		lastname.sendKeys(l_name);
	
	}
	
	public void email() {
		wait.until(ExpectedConditions.visibilityOf(mail));
		mail.sendKeys("tsgopika31012000@gmail.com");
	
	}
	
	public void address() {
		wait.until(ExpectedConditions.visibilityOf(add));
		add.sendKeys("D303 wow by urban tree");
	}
	
	public void phone() {
		wait.until(ExpectedConditions.visibilityOf(phonenum));
		phonenum.sendKeys("8903926387");
		wait.until(ExpectedConditions.visibilityOf(submit));
		submit.click();
	}
	
	public void id() {
		wait.until(ExpectedConditions.visibilityOf(id));
		customer_id = id.getText();
		System.out.println(customer_id);
		je.executeScript("window.scroll(0,document.body.scrollHeight)", "" );
		wait.until(ExpectedConditions.visibilityOf(home));
		home.click();
		
	}
	
	public void pay_bill() {
		wait.until(ExpectedConditions.visibilityOf(paybill));
		paybill.click();
		wait.until(ExpectedConditions.visibilityOf(customerid));
		customerid.sendKeys(customer_id);
		wait.until(ExpectedConditions.visibilityOf(sub));
		sub.click();
		je.executeScript("window.scroll(0,document.body.scrollHeight)", "" );
	}
	
	
	
	
}

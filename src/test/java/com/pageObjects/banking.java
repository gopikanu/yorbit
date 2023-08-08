package com.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class banking {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor je;
	String username;
	String password;
	
	
	
	public banking(WebDriver rdriver)
	{
		ldriver=rdriver;
		wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		 je = (JavascriptExecutor) ldriver;
	  	PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(partialLinkText ="Bank Project")
	@CacheLookup
	WebElement bankLink;
	
	@FindBy(partialLinkText ="here")
	@CacheLookup
	WebElement Link;
	
	@FindBy(xpath="//*[@name='emailid']")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//*[@name='btnLogin']")
	@CacheLookup
	WebElement submit;
	
	@FindBy(xpath="/html/body/table/tbody/tr[4]/td[2]")
	@CacheLookup
	WebElement usern;
	
	@FindBy(xpath="/html/body/table/tbody/tr[5]/td[2]")
	@CacheLookup
	WebElement passn;
	
	@FindBy(xpath="//*[@name='uid']")
	@CacheLookup
	WebElement uid;
	
	@FindBy(xpath="//*[@name='password']")
	@CacheLookup
	WebElement pwsd;
	
	@FindBy(xpath="//*[@name='btnLogin']")
	@CacheLookup
	WebElement loginbtn;
	
	@FindBy(partialLinkText ="New Customer")
	@CacheLookup
	WebElement addCustomer;
	
	@FindBy(xpath="//*[@name='name']")
	@CacheLookup
	WebElement uname;
	
	@FindBy(partialLinkText ="female ")
	@CacheLookup
	WebElement gender;
	
	@FindBy(xpath="//*[@name='addr']")
	@CacheLookup
	WebElement add;
	
	@FindBy(xpath="//*[@name='dob']")
	@CacheLookup
	WebElement dob;
	
	@FindBy(xpath="//*[@name='city']")
	@CacheLookup
	WebElement city;
	
	@FindBy(xpath="//*[@name='state']")
	@CacheLookup
	WebElement state;
	
	@FindBy(xpath="//*[@name='pinno']")
	@CacheLookup
	WebElement pin;
	
	@FindBy(xpath="//*[@name='telephoneno']")
	@CacheLookup
	WebElement tele;
	
	@FindBy(xpath="//*[@name='emailid']")
	@CacheLookup
	WebElement emailid;
	
	@FindBy(xpath="//*[@name='sub']")
	@CacheLookup
	WebElement sub;
	
	
	
	
	public void clkbank_link() {
		wait.until(ExpectedConditions.visibilityOf(bankLink));
		bankLink.click();
		ldriver.navigate().back();
		ldriver.navigate().forward();
		
	}
	
	
	public void login_link() {
		je.executeScript("window.scroll(0,document.body.scrollHeight)", "" );
		wait.until(ExpectedConditions.visibilityOf(Link));
		Link.click();
		
		
	}
	
	public void enteremailID() {
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("tsgopika31012000@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(submit));
		submit.click();
	}
	
	public void getuserdetails() {
		wait.until(ExpectedConditions.visibilityOf(usern));
		username= usern.getText();
		System.out.println(username);
		
		wait.until(ExpectedConditions.visibilityOf(passn));
		password= passn.getText();
		System.out.println(password);
		ldriver.navigate().back();
		ldriver.navigate().back();
		
	}
	
	public void login() {
		wait.until(ExpectedConditions.visibilityOf(uid));
		uid.sendKeys(username);
		wait.until(ExpectedConditions.visibilityOf(pwsd));
		pwsd.sendKeys(password);
		wait.until(ExpectedConditions.visibilityOf(loginbtn));
		loginbtn.click();		
		
	}
	
	public void addCustomer() {
		wait.until(ExpectedConditions.visibilityOf(addCustomer));
		addCustomer.click();
		wait.until(ExpectedConditions.visibilityOf(uname));
		uname.sendKeys("Vignesh");
		je.executeScript("window.scroll(0,document.body.scrollHeight)", "" );
		/*wait.until(ExpectedConditions.visibilityOf(gender));
		gender.click();*/
		wait.until(ExpectedConditions.visibilityOf(dob));
		dob.clear();
		dob.sendKeys("26");
		dob.sendKeys("08");
		dob.sendKeys("1999");
		wait.until(ExpectedConditions.visibilityOf(add));
		add.sendKeys("12 A Muniyandi Kovil Lane, Madurai");
		wait.until(ExpectedConditions.visibilityOf(city));
		city.sendKeys("Madurai");
		wait.until(ExpectedConditions.visibilityOf(state));
		state.sendKeys("TamilNadu");
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys("625001");
		wait.until(ExpectedConditions.visibilityOf(tele));
		tele.sendKeys("8903926387");
		wait.until(ExpectedConditions.visibilityOf(emailid));
		emailid.sendKeys("tsgopika31012000@gmail.com");
	}
	public void submit() {
		wait.until(ExpectedConditions.visibilityOf(sub));
		sub.click();
		
		
	}
	
	
	
	
	

}

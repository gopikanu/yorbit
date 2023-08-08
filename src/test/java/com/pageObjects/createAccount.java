package com.pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class createAccount {

	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor je;
	
	
	
	public createAccount(WebDriver rdriver)
	{
		ldriver=rdriver;
		wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		 je = (JavascriptExecutor) ldriver;
	  	PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(xpath="//*[@id=\"master-1\"]")
	@CacheLookup
	WebElement Frame1;
	
	@FindBy(linkText="Demo Software")
	@CacheLookup
	WebElement demoswbtn;
	
	@FindBy(xpath="//*[@id=\"master-1\"]")
	@CacheLookup
	WebElement Frame2;
	
	@FindBy(partialLinkText="Data")
	@CacheLookup
	WebElement website1btn;
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	@CacheLookup
	WebElement cookies;
	
	@FindBy(xpath="//*[@id=\"hero\"]/div/div/div/div[1]/div/div[1]/form/div/input[1]")
	@CacheLookup
	WebElement mail1;
	
	@FindBy(xpath="//*[@id=\"hero\"]/div/div/div/div[1]/div/div[1]/form/div/button")
	@CacheLookup
	WebElement startfreebtn;
	
	@FindBy(xpath="//*[@class=\"TextContainer-sc-16ba1uz-0 ioA-Dvw sc-odcnt9-0 iygZql\"]")
	@CacheLookup
	WebElement signIn;
	
	/*@FindBy(xpath="//*[@name='email']")
	@CacheLookup
	WebElement removemail;*/
	
	@FindBy(xpath="//*[@data-test-id='work-email']")
	@CacheLookup
	WebElement usernm;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/div[1]/div[3]/span/form/button/span")
	@CacheLookup
	WebElement signbtn;
	
	@FindBy(partialLinkText="Welcome back!")
	@CacheLookup
	WebElement text;
	
	@FindBy(xpath="//*[@name='firstName']")
	@CacheLookup
	WebElement fName;
	
	@FindBy(xpath="//*[@name='lastName']")
	@CacheLookup
	WebElement lName;
	
	@FindBy(xpath="//*[@data-test-id='signup-phonenumber-text']")
	@CacheLookup
	WebElement phnum;
	
	@FindBy(xpath="//*[@data-test-id='password']")
	@CacheLookup
	WebElement pass1;
	
	@FindBy(xpath="//*[@data-test-id='signup-self-attribution']")
	@CacheLookup
	WebElement hear;
	
	@FindBy(xpath="//*[@data-test-id='signup-submit']")
	@CacheLookup
	WebElement signUpbtn;
	
	
	
	public void navigationscreen1() {
		ldriver.switchTo().frame(Frame1);
		System.out.println("Frame1");
		wait.until(ExpectedConditions.visibilityOf(demoswbtn));
		demoswbtn.click();
		ldriver.switchTo().frame(Frame2);
		System.out.println("Frame2");
		wait.until(ExpectedConditions.visibilityOf(website1btn));
		website1btn.click();
		
	}
	public void entermail1() {
		Set<String> windowhandles = ldriver.getWindowHandles();
		System.out.println(windowhandles);
		List<String> list = new ArrayList<String>(windowhandles);
		ldriver.switchTo().window(list.get(1));
		wait.until(ExpectedConditions.visibilityOf(mail1));
				mail1.sendKeys("Gopika.61070757@ltimindtree.com");
				wait.until(ExpectedConditions.visibilityOf(startfreebtn));
		startfreebtn.click();
	}
	
	public void signIn() {
		//wait.until(ExpectedConditions.visibilityOf(removemail));
		//removemail.clear();
		wait.until(ExpectedConditions.visibilityOf(signIn));
		signIn.click();
	}
	
	public void enterusername(String uname)  {
		wait.until(ExpectedConditions.visibilityOf(usernm));
		ldriver.switchTo().activeElement().sendKeys(uname);
		//usernm.sendKeys(uname);
	}
	
	public void enterpswd(String pswd) {
		wait.until(ExpectedConditions.visibilityOf(pass));
		pass.sendKeys(pswd);
	}
	
	public void clksignIn() {
		signbtn.click();
	}
	
	public void enterfirstname(String fname) {
		wait.until(ExpectedConditions.visibilityOf(fName));
		fName.sendKeys(fname);
	}
	
	public void enterlastname(String lname) {
		wait.until(ExpectedConditions.visibilityOf(lName));
		lName.sendKeys(lname);
	}
	
	public void enterpassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(pass1));
		pass1.sendKeys(password);
	}
	
	
	public void enterphonenumber() {
		wait.until(ExpectedConditions.visibilityOf(phnum));
		phnum.sendKeys("8903926387");
	}
	
	public void enterHAU() {
		wait.until(ExpectedConditions.visibilityOf(hear));
		hear.sendKeys("linkden");
	}
	
	public void clicksignUp() {
		je.executeScript("window.scroll(0,document.body.scrollHeight)", "" );
		//wait.until(ExpectedConditions.visibilityOf(signUpbtn));
		signUpbtn.click();
	}
}


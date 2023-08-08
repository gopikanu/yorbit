package com.pageObjects;

import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
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

public class registerationfortour {
	WebDriver ldriver;
	WebDriverWait wait;
	JavascriptExecutor je;
	Select dpcountry;
	Actions action;
	
	public registerationfortour(WebDriver rdriver)
	{
		ldriver=rdriver;
		wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		 je = (JavascriptExecutor) ldriver;
		 action = new Actions(ldriver);
	  	PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(partialLinkText="REGISTER")
	@CacheLookup
	WebElement register;
	
	@FindBy(xpath="//*[@name='firstName']")
	@CacheLookup
	WebElement fname;
	
	@FindBy(xpath="//input[@name='lastName']")
	@CacheLookup
	WebElement lname;
	
	@FindBy(xpath="//input[@name='phone']")
	@CacheLookup
	WebElement phonenumber;
	
	@FindBy(id="userName")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//input[@name='address1']")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	@CacheLookup
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	@CacheLookup
	WebElement state;
	
	@FindBy(xpath="//input[@name='postalCode']")
	@CacheLookup
	WebElement code;
	
	@FindBy(xpath="//*[@name='country']")
	@CacheLookup
	WebElement country;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//*[@name='password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//*[@name='confirmPassword']")
	@CacheLookup
	WebElement confirmpassword;
	
	@FindBy(xpath="//*[@name='submit']")
	@CacheLookup
	WebElement submitbtn;
	
	@FindBy(linkText="SIGN-OFF")
	@CacheLookup
	WebElement signIn;
	
	@FindBy(partialLinkText="Close")
	@CacheLookup
	WebElement close;
	
	@FindBy(xpath="//*[@id='ad_iframe']")
	@CacheLookup
	WebElement frame1;
	
	@FindBy(xpath="//*[@name='userName']")
	@CacheLookup
	WebElement userid;
	
	@FindBy(xpath="//*[@name='password']")
	@CacheLookup
	WebElement pswd;
	
	@FindBy(xpath="//*[@name='submit']")
	@CacheLookup
	WebElement submitbtn1;
	
	public void regclk() {
		register.click();
	}
	
	public void enterfirstname(String fName) {
		wait.until(ExpectedConditions.visibilityOf(fname));
		fname.sendKeys(fName);
	}
	
	public void enterlastname(String lName) {
		wait.until(ExpectedConditions.visibilityOf(lname));
		lname.sendKeys(lName);
	}
	
	
	
	public void enterphonenumber() {		
		wait.until(ExpectedConditions.visibilityOf(phonenumber));
		phonenumber.sendKeys("8903926387");
		
	}
	
	public void enteremail() {
		je.executeScript("window.scroll(0,document.body.scrollHeight)", "" );
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("tsgopika31012000.com");
		
	}
	
	public void entercity(String ucity) {		
		wait.until(ExpectedConditions.visibilityOf(city));
		city.sendKeys(ucity);
		
	}
	
	public void enteraddress(String add) {		
		wait.until(ExpectedConditions.visibilityOf(address));
		address.sendKeys(add);
		
	}
	
	public void enterstate(String ustate) {		
		wait.until(ExpectedConditions.visibilityOf(state));
		state.sendKeys(ustate);
		
	}
	
	public void enterPC() {
		
		wait.until(ExpectedConditions.visibilityOf(code));
		code.sendKeys("600100");
		
	}
	
public void sltcountry(String count) {
		
		wait.until(ExpectedConditions.visibilityOf(country));
		Select dpcountry = new Select(country);
		dpcountry.selectByValue(count);
		
	}
	
public void enterusername() {
	wait.until(ExpectedConditions.visibilityOf(username));
	username.sendKeys("tsgopika31012000@gmail.com");
	
}

public void enterpassword(String pass) {
	wait.until(ExpectedConditions.visibilityOf(password));
	password.sendKeys(pass);
	
}

public void entercnfpassword(String pass) {
	wait.until(ExpectedConditions.visibilityOf(confirmpassword));
	confirmpassword.sendKeys(pass);
	
}


public void clksubmitbtn() {
	wait.until(ExpectedConditions.visibilityOf(submitbtn));
	submitbtn.click();
	
}

public void clksignInlink() {
	wait.until(ExpectedConditions.visibilityOf(signIn));
	signIn.click();
	ldriver.navigate().to("https://demo.guru99.com/test/newtours/");
	
}
public void clearpopUp() {
	wait.until(ExpectedConditions.visibilityOf(frame1));
	ldriver.switchTo().frame(frame1);
	action.click().build().perform();
	wait.until(ExpectedConditions.visibilityOf(close));
	close.click();
}

public void loginIn(String pass) {
	wait.until(ExpectedConditions.visibilityOf(userid));
	userid.sendKeys("tsgopika31012000@gmail.com");
	wait.until(ExpectedConditions.visibilityOf(pswd));
	pswd.sendKeys(pass);
	wait.until(ExpectedConditions.visibilityOf(submitbtn1));
	submitbtn1.click();
	
}


}

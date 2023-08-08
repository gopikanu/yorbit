package com.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.pageObjects.createAccount;

public class TC001Login extends baseClass {
@Test
	 public void loginTest() throws IOException {
		 createAccount lF = new createAccount(driver);
		 logger.info("DemoAuto is opened");
		 lF.navigationscreen1();
		 captureScreen(driver,"1.emailentered");
		 lF.entermail1();
		 
		 logger.info("title of the page"+driver.getTitle());
		 
		 captureScreen(driver,"2.signUp");
		 logger.info("signUp page opens");
		 //driver.navigate().back();
		logger.info("title of the page"+driver.getTitle());
		lF.enterfirstname(firstName);
		lF.enterlastname(lastName);
		lF.enterphonenumber();
		lF.enterpassword(password);
		lF.enterHAU();
		captureScreen(driver,"3.CreateAccount");
		lF.clicksignUp();

		
		
		
		
		
		
	/*	lF.enterusername(mailid);
		 lF.enterpswd(password);
		 logger.info("password should be enetered");
		 //lF.enterusername(mailid);
		 captureScreen(driver,"loginTest");
		 logger.info("mailid should be enetered");
		 logger.info("title of the page"+driver.getTitle());*/
		 
		 
		 
		 if(driver.getTitle().equals(driver.getTitle()))
		 {
				Assert.assertTrue(true);
			logger.info("SignUp is passed");
			captureScreen(driver,"loginTest");
			}
		 
			else {
				Assert.assertTrue(false);
				logger.info("SignUp is falied");
				captureScreen(driver,"loginTest");
			}
	 }
}

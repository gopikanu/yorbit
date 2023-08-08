package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageObjects.registerationfortour;

public class TC002Register extends baseClass1{

	@Test
	public void register() throws IOException{
		
		registerationfortour reg = new registerationfortour(driver);
		reg.regclk();
		 captureScreen(driver,"01.Regsiteration Page");
		 logger.info("Registeration page is opened");
		 reg.enterfirstname(firstName);
		 logger.info("First name is entered");
		 reg.enterlastname(lastName);
		 logger.info("Last name is entered");
		 reg.enterphonenumber();
		 logger.info("Phonenumber is entered");
		 reg.enteremail();
		 logger.info("Email is entered");
		 reg.enteraddress(address);
		 logger.info("Address is entered");
		 reg.entercity(city);
		 logger.info("City is entered");
		 reg.enterstate(state);
		 logger.info("State is entered");
		 reg.enterPC();
		 logger.info("Postal code is entered");
		 reg.sltcountry(country);
		 logger.info("country is selected");
		 reg.enterusername();
		 logger.info("username is selected");
		 reg.enterpassword(password);
		 logger.info("password is selected");
		 reg.entercnfpassword(password);
		 logger.info("confirm password is selected");
		 captureScreen(driver,"02.Details entered - Regsiteration Page");
		 reg.clksubmitbtn();
		 logger.info("submit button is clicked");
		 captureScreen(driver,"03.Regsiteration is done");
		 reg.clksignInlink();
		 captureScreen(driver,"04.POP UP appears");
		//reg.clearpopUp();
		 captureScreen(driver,"05.Login Screen");
		 reg.loginIn(password);
		 captureScreen(driver,"06.Login Done");
		 
	}
}

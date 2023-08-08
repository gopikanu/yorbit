package com.testCases;

import java.io.IOException;
import com.pageObjects.telecom;

import org.testng.annotations.Test;

public class TC006teleCom extends baseClass1 {
	@Test
	public void telecom() throws IOException{
	
		telecom tc = new telecom(driver);
		tc.clktele_Link();
		logger.info("Add new customer");
		tc.add_customer();
		tc.f_Name(firstName);
		logger.info("First name entered");
		tc.l_Name(lastName);
		logger.info("last name entered");
		tc.email();
		logger.info("email entered");
		tc.address();
		logger.info("address entered");
		tc.phone();
		logger.info("phone number entered");
		captureScreen(driver,"18.New customer is added in telecom");
		tc.id();
		logger.info(" check the bill details");
		tc.pay_bill();
		captureScreen(driver,"19.phonebill");
	}

}

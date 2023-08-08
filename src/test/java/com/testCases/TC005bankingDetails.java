package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageObjects.banking;

public class TC005bankingDetails extends baseClass1{
	@Test
	public void banking() throws IOException{
		banking bnk = new banking(driver);
		bnk.clkbank_link();
		logger.info("click on bank link");
		bnk.login_link();
		bnk.enteremailID();
		captureScreen(driver,"12.Userid created in Banking project");
		bnk.getuserdetails();
		logger.info("userdeatils entered");
		bnk.login();
		captureScreen(driver,"13.Login done in Banking project");
		logger.info("Add the new Customer");
		bnk.addCustomer();
		captureScreen(driver,"14.New customer added in banking project");
		bnk.submit();
		
	}
	}
	

//mngr520137
//EsYpAdu

package com.testCases;

import java.io.IOException;
import com.pageObjects.payment;

import org.testng.annotations.Test;

public class TC004Payment extends baseClass1 {
	@Test
	public void payment() throws IOException{
		
		payment py = new payment(driver);
		
		py.gotopayment_page();
		logger.info("Goto payment");
		captureScreen(driver,"09.Payment Page");
		py.select_quantity();
		logger.info("Select payment");
		py.clkbuynow();
		logger.info("payment process");
		captureScreen(driver,"10.Payment Process");
		py.entercardnum();
		py.select_month();
		py.select_year();
		py.select_ccv(code);
		py.submitbtn();
		logger.info("Purchased the product");
		captureScreen(driver,"11.Payment Done");
	}
}


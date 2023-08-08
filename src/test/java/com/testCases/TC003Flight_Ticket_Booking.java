package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageObjects.flight_Ticket_Booking;
import com.pageObjects.registerationfortour;

public class TC003Flight_Ticket_Booking extends baseClass1{
@Test
	public void ticketbooking() throws IOException{
	
	registerationfortour reg = new registerationfortour(driver);
	flight_Ticket_Booking ftb =new flight_Ticket_Booking(driver);
	reg.loginIn(password);
	logger.info("successfully logged In");
	ftb.flightlink();
	logger.info("Navigated to flight booking screen");
	 captureScreen(driver,"07.Flight Ticket booking page");
	 ftb.destination_Place();
	 ftb.FromMonth();
	 ftb.FromDate();
	 ftb.Arrived_Place();
	 ftb.ToMonth();
	 ftb.ToDate();
	 ftb.flight_class();
	 ftb.select_airline();
	 ftb.ctnbutton();
	 captureScreen(driver,"08.Availibilty of Seats");
	 
	
	
	
	
}
}

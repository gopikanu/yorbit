package com.utilies;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() 
	{
	File src = new File("./Configuration/config.properties");
	try {
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}
	catch(Exception e) {
		System.out.println("Exception is"+e.getMessage());
	}
}

	public String getApplicationURL() {
		String Baseurl=pro.getProperty("url");
		return Baseurl;
	}
	
	public String getApplicationURL1() {
		String Baseurl=pro.getProperty("URL");
		return Baseurl;
	}
	
	public String getemailId() {
		String mail=pro.getProperty("mailId");
		return mail;
	}
	
	public String getPassword() {
		String pswd=pro.getProperty("password");
		return pswd;
	}
	
	public String getfirstname() {
		String fname=pro.getProperty("firstName");
		return fname;
	}
	
	public String getlasttname() {
		String lname=pro.getProperty("lastName");
		return lname;
	}

	public String getcity() {
		String City=pro.getProperty("city");
		return City;
	}
	
	public String getaddress() {
		String add=pro.getProperty("Address");
		return add;
	}
	
	public String getState() {
		String State=pro.getProperty("state");
		return State;
	}
	
	public String getcountry() {
		String count=pro.getProperty("country");
		return count;
	}
	
	public String getcode() {
		String count=pro.getProperty("code");
		return count;
	}
	
	public String getchromebrowser() {
		String chrome=pro.getProperty("chromepath");
		return chrome;
		
	}
	public String getedgebrowser() {
		String edge=pro.getProperty("edgePath");
		return edge;
	}
	
	public String getfirefoxbrowser() {
		String fox=pro.getProperty("firefoxpath");
		return fox;
	}

}

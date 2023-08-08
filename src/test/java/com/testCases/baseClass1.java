package com.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import com.utilies.ReadConfig;

public class baseClass1 {
	ReadConfig RC = new ReadConfig();
	public String URL= RC.getApplicationURL1();
	public String mailid =RC.getemailId();
	 public String password =RC.getPassword();
	 public String firstName = RC.getfirstname();
	 public String lastName = RC.getlasttname();
	 public String city = RC.getcity();
	 public String address = RC.getaddress();
	 public String state = RC.getState();
	 public String country = RC.getcountry();
	 public String code = RC.getcode();

	public static WebDriver driver;
	 public WebDriverWait wait;
	 public static Logger logger;
	@BeforeMethod
	public void Setup() {
	System.setProperty("webdriver.edge.driver",RC.getedgebrowser());
	driver = new EdgeDriver();
	logger = Logger.getLogger("Demoauto");
	PropertyConfigurator.configure("log4j.properties");
	driver.get(URL);
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	@AfterClass
	public void CloseUp() {
		driver.close();
	}
	
	
}

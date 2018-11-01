package com.momsbelief3.generic;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseLib 
{
public static WebDriver driver; //final Driver

@BeforeMethod(alwaysRun = true)
public void setUp() throws IOException
	{
	
		int ch = 1;
		System.out.println("Press 1 for Firefox"); 
		System.out.println("Press 2 for Chrome ");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		switch (ch)
		{
		case 1:
			
				System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
				driver = new FirefoxDriver();
				Reporter.log("Firefox launched",true);
				driver.manage().window().maximize();
				WaitStatementLib.iWaitForSecs(driver, 20);
				driver.get(Generic.getValue("url"));
				Reporter.log("Navigate to url", true);
				sc.close();
				break;
			
		case 2:
		
			System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
			driver = new ChromeDriver();
			Reporter.log("Chrome launched",true);
		
			
		}
		
	}
	@AfterMethod()
	public void tearDown(ITestResult result)
	{
		if(result.isSuccess())
		{
			System.out.println("Result Paas");
		}
		else
		{
			String fileName = result.getMethod().getMethodName();
			ScreenShotLib slib= new ScreenShotLib();
			slib.takeScreenShot(driver, fileName);
			Reporter.log("Screenshot has been taken",true);
		}
		
		Reporter.log("Browser closed",true);
	}
	
	}




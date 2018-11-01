package com.momsbelief3.scripts;


import org.testng.annotations.Test;

import com.momsbelief3.generic.BaseLib;
import com.momsbelief3.generic.ExcelUtilities;

import com.momsbelief3.pom.LoginPage;

public class LoginTest extends BaseLib
{
@Test(alwaysRun = true)
		
public void validLogin()
{
String username = ExcelUtilities.readdata("Sheet1", 1, 1);
String password = ExcelUtilities.readdata("Sheet1", 1, 2);
	


	LoginPage lp = new LoginPage(driver);
	lp.login(username,password);
}
	
	
	
}
	
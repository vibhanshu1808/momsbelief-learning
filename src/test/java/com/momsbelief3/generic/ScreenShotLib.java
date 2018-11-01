package com.momsbelief3.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShotLib 
{
	public void takeScreenShot(WebDriver driver,String fileName)
	{
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		File srcFile = efw.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshot/"+fileName+".png");
		try {
			FileUtils.copyFile(srcFile,destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

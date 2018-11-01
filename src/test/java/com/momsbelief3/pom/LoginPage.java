package com.momsbelief3.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage 
{
	@FindBy(name="email")
	private WebElement unTxBx;
	@FindBy(name="password")
	private WebElement pwdTxBx;
	@FindBy(name="ladda-label")
	private WebElement loginBtn;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public void login(String username,String password)
	{
		unTxBx.sendKeys(username);
		pwdTxBx.sendKeys(password);
		loginBtn.click();
	}
	public WebElement getUnTxBx() {
		return unTxBx;
	}
	public WebElement getPwdTxBx() {
		return pwdTxBx;
	}
	public WebElement getLoginBtn() {
		return loginBtn;

	}
}


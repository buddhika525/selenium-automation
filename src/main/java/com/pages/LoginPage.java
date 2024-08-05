package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		getDriverWait(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME, using="username")
	WebElement username;
	
	@FindBy(how=How.NAME, using="password")
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']") 
	WebElement loginButton;
	
	@FindBy(how=How.CSS, using=".oxd-text.oxd-text--p.orangehrm-login-forgot-header")
	WebElement forgotPasswordLink;
	
	@FindBy(how=How.CSS, using=".oxd-text.oxd-text--h5.orangehrm-login-title")
	WebElement loginTitle;
	
	
	public void enterUsername(String name) {
		//username.sendKeys(name);
		sendKeys(username, name);
	}
	
	public void enterPassword(String passwd) {
		sendKeys(password,passwd);
	}
	
	public String getLoginTitle() {
		return getText(loginTitle);
	}
	
	public boolean isForgetPWLinkDisplayed() {
		return isDisplayed(forgotPasswordLink);
	}
	
	public void enterLoginButton() {
		click(loginButton);
	}
	
	
}

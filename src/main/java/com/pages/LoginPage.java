package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME, using="username")
	WebElement username;
	
	@FindBy(how=How.NAME, using="password")
	WebElement password;
	
	@FindBy(how=How.CLASS_NAME, using="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")
	WebElement loginButton;
	
	@FindBy(how=How.CLASS_NAME, using="oxd-text oxd-text--p orangehrm-login-forgot-header")
	WebElement forgotPasswordLink;
	
	@FindBy(how=How.CLASS_NAME, using="oxd-text oxd-text--h5 orangehrm-login-title")
	WebElement loginTitle;
	
	
	public void enterUsername(String name) {
		username.sendKeys(name);
	}
	
	public void enterPassword(String passwd) {
		password.sendKeys(passwd);
	}
	
	public String getLoginTitle() {
		return loginTitle.getText();
	}
	
	public boolean isForgetPWLinkDisplayed() {
		return forgotPasswordLink.isDisplayed();
	}
	
	public void enterLoginButton() {
		loginButton.click();
	}
	
	
}

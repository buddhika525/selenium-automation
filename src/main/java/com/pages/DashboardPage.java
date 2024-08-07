package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{
	
	private WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		getDriverWait(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement dashboardText;
	
	public String getDashboardText() {
		return getText(dashboardText);
	}
	
	

}

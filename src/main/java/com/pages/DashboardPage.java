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
	
	@FindBy(xpath="//i[@class='oxd-icon bi-stopwatch']")
	WebElement watchIcon;
	
	/*
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span orangehrm-attendance-card-fulltime']")
	WebElement timeAtWorkToday;
	
	
	@FindBy(xpath="//div[@id='app']/div[1]//div[@class='oxd-layout-context']/div/div[1]/div//span")
	WebElement timeAtWorkToday;
	*/
	
	//div[@id='app']/div[1]//div[@class='oxd-layout-context']/div/div[1]/div//span/b[.='54m']
	@FindBy(css=".orangehrm-attendance-card-fulltime.oxd-text.oxd-text--span")
	WebElement timeAtWorkToday;
	
	//b[normalize-space()='9h']
	//span[@class='oxd-text oxd-text--span orangehrm-attendance-card-fulltime']
	

	
	public String getDashboardText() {
		return getText(dashboardText);
	}
	
	public AttendancePage clickPunchButton() {
		click(watchIcon);
		return new AttendancePage(driver);
	}
	
	public String getTimeSpent(){
		return getText(timeAtWorkToday);
	}
	
	

}

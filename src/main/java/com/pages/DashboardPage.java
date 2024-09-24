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
	
	@FindBy(css=".orangehrm-attendance-card-fulltime.oxd-text.oxd-text--span")
	WebElement timeAtWorkToday;
	
	@FindBy(css = "li:nth-of-type(11) > .oxd-main-menu-item")
	WebElement claimMenu;
	

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
	
	
	public ClaimsPage clickOnClaims(WebDriver driver) {
		click(claimMenu);
		return new ClaimsPage(driver);
	}
	

}

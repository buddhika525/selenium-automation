package com.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;

public class AttendancePage extends BasePage{

	public WebDriver driver;
	
	public AttendancePage(WebDriver driver) {
		this.driver = driver;
		getDriverWait(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='hh:mm']")
	WebElement punchInTime;
	
	@FindBy(xpath="//div[@id='app']/div[1]//form[@class='oxd-form']/div[1]/div/div[2]/div//div[@role='alert']/div[@class='oxd-time-hour-input']/input")
	WebElement setHour;
	
	@FindBy(xpath="//input[@placeholder='hh:mm']")
	WebElement setTime;
	
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--focus oxd-time-minute-input-text']")
	WebElement setMinute;
	
	@FindBy(name="am")
	WebElement selectAM;
	
	@FindBy(name="pm")
	WebElement selectPM;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitTime;
	
	//button[@type='submit']
	
	@FindBy(css=".bi-calendar.oxd-date-input-icon.oxd-icon")
	WebElement calanderIcon;
	
	@FindBy(xpath="//div[contains(text(),'12')]")
	WebElement datePicked;
	
	@FindBy(css="li:nth-of-type(8) > .oxd-main-menu-item > .oxd-main-menu-item--name.oxd-text.oxd-text--span")
	WebElement dashboardMenu;
	
	@FindBy(css=".orangehrm-main-title.oxd-text.oxd-text--h6")
	WebElement punchText;
	
	public String getpunchInOutText() {
		return getText(punchText);
	}
	
	public void setTime(String timePunched) {
		click(setTime);
		sendKeys(setTime, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		sendKeys(setTime, timePunched);
	}
	
	public void clickSubmitButton() throws InterruptedException {
		click(submitTime);
		Thread.sleep(8000);
	}
	
	
	public void navigateToDashboard() {
		click(dashboardMenu);
	}
	
}

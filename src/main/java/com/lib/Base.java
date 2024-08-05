package com.lib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	//public WebDriver driver;
	public WebDriverWait wait;
	
	public void getDriverWait(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void getURL(WebDriver driver, String url) {
		 driver.get(url);
	}
	
	public void sendKeys(WebElement element, String key) {
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(key);
	}
	
	public void click(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	}
	
	public boolean isDisplayed(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
	}
	
	public String getText(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element)).getText();
	}

}

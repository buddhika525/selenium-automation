package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClaimsPage extends BasePage{
	
	WebDriver driver;
	
	public ClaimsPage(WebDriver driver) {
		this.driver = driver;
		getDriverWait(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="button[type='submit']")
	WebElement submitBtn;
	
	@FindBy(css=".oxd-form .oxd-grid-item--gutters:nth-of-type(2) .oxd-select-dropdown")
	WebElement currencyList;
	
	@FindBy(xpath="//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[1]")
	WebElement currencyDropDown;
	
	@FindBy(xpath="//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div[2]")
	WebElement eventsList;
	
	@FindBy(css=".oxd-form .oxd-grid-item--gutters:nth-of-type(1) .oxd-select-wrapper")
	WebElement eventDropDown;
	
	@FindBy(xpath="//div[@role='listbox']")
	WebElement autoSuggesionList;
	
	@FindBy(xpath="//button[normalize-space()='Assign Claim']")
	WebElement assignClaimsButton;
	
	@FindBy(css=".oxd-autocomplete-text-input > input[placeholder='Type for hints...']")
	WebElement empNameTextBox;
	
	
	
	public void clickAssignClaimsBtn() {
		click(assignClaimsButton);
	}
	
	public void selectEmpname(String name) throws InterruptedException {
		sendKeys(empNameTextBox,"s");
		sleep();
		List<WebElement> elem = getElements(autoSuggesionList,name);
		WebElement itemtoClick = null;
		for(WebElement item: elem) {
			if(item.getText().contains(name)) {
				itemtoClick = item;
				sleep();
			}
			
		}
		
		click(itemtoClick);
	}
	
	public void selectDropDown(String name) throws InterruptedException {
		click(eventDropDown);
		List<WebElement> elem = getElements(eventsList,name);
		WebElement itemtoClick = null;
		for(WebElement item: elem) {
			if(item.getText().contains(name)) {
				itemtoClick = item;
			}
			
		}
		
		click(itemtoClick);
	}
	
	
	public void selectDropCurrencyDown(String name) throws InterruptedException {
		click(currencyDropDown);
		List<WebElement> elem2 = getElements(currencyList, name);
		WebElement itemtoClick = null;
		for(WebElement item: elem2) {
			if(item.getText().contains(name)) {
				itemtoClick = item;
			}
			
		}
		
		click(itemtoClick);
	}
	
	public void clickSubmit() {
		click(submitBtn);
	}


}

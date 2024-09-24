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
	
	@FindBy(xpath="//button[normalize-space()='Assign Claim']")
	WebElement assignClaimsButton;
	//.oxd-autocomplete-text-input > input[placeholder='Type for hints...']
	
	@FindBy(css=".oxd-autocomplete-text-input > input[placeholder='Type for hints...']")
	WebElement empNameTextBox;
	
	@FindBy(className=".oxd-autocomplete-dropdown")
	WebElement autoCompleteResults;
	
	@FindBy(css=".oxd-autocomplete-option")
	WebElement autoSugDropDown;
	
	@FindBy(css="div:nth-of-type(1) > .oxd-input-field-bottom-space.oxd-input-group > div:nth-of-type(2) > .oxd-select-wrapper > .oxd-select-text > .oxd-select-text-input")
	WebElement eventNameDropDown;
	
	@FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']']")
	WebElement eventName;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[1]")
	WebElement currencyDropDown;
	
	@FindBy(css="button[type='submit']")
	WebElement submitBtn;
	
		public void clickAssignClaimsBtn() {
		click(assignClaimsButton);
	}
	
	public void selectEmpname(String name) throws InterruptedException {
		sendKeys(empNameTextBox,"a");
		Thread.sleep(3000);
		//List<WebElement> elem = driver.findElements(By.cssSelector(".oxd-autocomplete-option"));
		List<WebElement> elem = getElements(By.cssSelector(".oxd-autocomplete-option"));
		//implicitWait(driver);
		//System.out.println("size " + elem.size());
		//System.out.println("element" +elem.get(1).getText());
		WebElement itemtoClick = null;
		for(WebElement item: elem) {
			if(item.getText().equals(name)) {
				//System.out.println("name matches " + item);
				itemtoClick = item;
				//Thread.sleep(3000);
			}
			
		}
		System.out.print("item " + itemtoClick);
		
		click(itemtoClick);
		//Thread.sleep(5000);
		//boolean visible = isDisplayed(autoCompleteResults);
		//Select objSelect = new Select(empNameTextBox);
		//objSelect.selectByVisibleText(name);
	}
	
	public void selectDropDown(String name) throws InterruptedException {
		//sendKeys(empNameTextBox,"a");
		//Thread.sleep(3000);
		//List<WebElement> elem = driver.findElements(By.cssSelector(".oxd-autocomplete-option"));
		click(eventNameDropDown);
		Thread.sleep(3000);
		List<WebElement> elem = getElements(By.cssSelector(".oxd-select-option"));
		//implicitWait(driver);
		System.out.println("size " + elem.size());
		//System.out.println("element" +elem.get(1).getText());
		WebElement itemtoClick = null;
		for(WebElement item: elem) {
			if(item.getText().equals(name)) {
				System.out.println("name matches " + item);
				itemtoClick = item;
				//Thread.sleep(3000);
			}
			
		}
		System.out.print("item " + itemtoClick);
		
		click(itemtoClick);
		//Thread.sleep(5000);
		//boolean visible = isDisplayed(autoCompleteResults);
		//Select objSelect = new Select(empNameTextBox);
		//objSelect.selectByVisibleText(name);
	}
	
	public void selectDropCurrencyDown(String name) throws InterruptedException {
		//sendKeys(empNameTextBox,"a");
		//Thread.sleep(3000);
		//List<WebElement> elem = driver.findElements(By.cssSelector(".oxd-autocomplete-option"));
		click(currencyDropDown);
		Thread.sleep(3000);
		List<WebElement> elem = getElements(By.cssSelector(".oxd-select-option"));
		//implicitWait(driver);
		System.out.println("size " + elem.size());
		//System.out.println("element" +elem.get(1).getText());
		WebElement itemtoClick = null;
		for(WebElement item: elem) {
			if(item.getText().equals(name)) {
				System.out.println("name matches " + item);
				itemtoClick = item;
				//Thread.sleep(3000);
			}
			
		}
		System.out.print("item " + itemtoClick);
		
		click(itemtoClick);
		//Thread.sleep(5000);
		//boolean visible = isDisplayed(autoCompleteResults);
		//Select objSelect = new Select(empNameTextBox);
		//objSelect.selectByVisibleText(name);
	}
	
	public void clickSubmit() {
		click(submitBtn);
	}


}

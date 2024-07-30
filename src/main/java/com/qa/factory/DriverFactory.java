package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	
	//initialise the theardloacl driver
		public WebDriver initDriver(String browser) {
			System.out.println("browser value is " + browser);
			
			if(browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				tldriver.set(new ChromeDriver());
			}
			
			else if(browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				tldriver.set(new FirefoxDriver());
			}
			else {
				System.out.println("Please pass a correct browser");
			}
			
			getDriver().manage().deleteAllCookies();
			getDriver().manage().window().maximize();
			return getDriver();
	}
		
	//this is used to get the driver with threadlocal
	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}

}

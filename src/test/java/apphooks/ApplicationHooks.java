package apphooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	private DriverFactory driverFactory;
	private ConfigReader reader;
	Properties prop;
	WebDriver driver;
	
	@Before(order=0)
	public void loadConfig() {
		reader = new ConfigReader();
		prop = reader.getProperties();
	}
	
	@Before(order=1)
	public void initDriver() {
		String browser = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driverFactory.initDriver(browser);
	}
	
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			String screenshot = scenario.getName().replaceAll("", "_");
			byte[] sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", screenshot);
		}
	}

}

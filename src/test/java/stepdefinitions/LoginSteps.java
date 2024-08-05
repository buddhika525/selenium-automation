package stepdefinitions;


import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class LoginSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private String title;
	private WebDriver driver;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver = DriverFactory.getDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    //added explicit wait for the login page to load
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@When("user checks the title of the page")
	public void user_checks_the_title_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		title = loginPage.getLoginTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String pagetitle) {
	    // Write code here that turns the phrase above into concrete actions
	    //Assert.assertTrue(title.equals(pagetitle));
		Assert.assertEquals(title, pagetitle);
	}

	@Then("forgot passowrd link should be displayed")
	public void forgot_passowrd_link_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(loginPage.isForgetPWLinkDisplayed());
	}

	@When("user enters the username {string}")
	public void user_enters_the_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.enterUsername(username);
	}

	@When("user enters the password {string}")
	public void user_enters_the_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.enterLoginButton();
	}

	@Then("user should be directed to the {string} page")
	public void user_should_be_directed_to_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}

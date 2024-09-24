package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.pages.ClaimsPage;
import com.pages.DashboardPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddClaimsSteps {
	
	WebDriver driver = DriverFactory.getDriver();
	DashboardPage dashboard = new DashboardPage(driver);
	ClaimsPage claims;

	@When("user clicks on claim menu")
	public void user_clicks_on_claim_menu() {
	    // Write code here that turns the phrase above into concrete actions
		claims = dashboard.clickOnClaims(driver);
	    
	}
	@When("user clicks on Assign claims button")
	public void user_clicks_on_assign_claims_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    claims.clickAssignClaimsBtn();
	    //Thread.sleep(5000);
	}
	@When("user selects {string} as the employee name")
	public void user_selects_as_the_employee_name(String empName) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    claims.selectEmpname(empName);
	    //Thread.sleep(5000);
	}
	@When("user selects {string} as Event")
	public void user_selects_as_event(String name) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		claims.selectDropDown(name);
	}
	@When("user selects {string} as Currency")
	public void user_selects_as_currency(String name) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    claims.selectDropCurrencyDown(name);
	}
	@When("User clicks on create button")
	public void user_clicks_on_create_button() {
	    // Write code here that turns the phrase above into concrete actions
		claims.clickSubmit();
	}
	@Then("User should be moved to {string} page")
	public void user_should_be_moved_to_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}

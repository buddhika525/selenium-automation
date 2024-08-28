package stepdefinitions;

import java.time.Duration;

import org.junit.Assert;

import com.pages.AttendancePage;
import com.pages.DashboardPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddAttendanceSteps {

	DashboardPage dashboard = new DashboardPage(DriverFactory.getDriver());
	AttendancePage attendace;

	@And("user clicks on watchIcon")
	public void user_clicks_on_watch_icon() {
		// Write code here that turns the phrase above into concrete actions
		attendace = dashboard.clickPunchButton();
	}

	@And("user sets Punch In time as {string}")
	public void user_sets_punch_in_time_as(String timeIn) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		
		String text =  attendace.getpunchInOutText();
		System.out.println(text);
		Assert.assertEquals("Punch In", text);
		
		attendace.setTime(timeIn);
		//DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		attendace.clickSubmitButton();
		System.out.println("clicked punched in");
	}

	@And("user sets Punch Out time as {string}")
	public void user_sets_punch_out_time_as(String timeOut) throws InterruptedException  {
		// Write code here that turns the phrase above into concrete actions

		
		String textOut =  attendace.getpunchInOutText();
		Assert.assertEquals("Punch Out", textOut);
		
		//Assert.assertEquals(punchOut, text);
		attendace.setTime(timeOut);
		attendace.clickSubmitButton();
		
		attendace.navigateToDashboard();
	}
	
	@Then("user checks time at work in Dashboard to be {string}")
	public void user_checks_time_at_work_in_dashboard_to_be(String text) {
	    // Write code here that turns the phrase above into concrete actions
		String timeSpent = dashboard.getTimeSpent();
		System.out.println("time at work " + timeSpent);
		Assert.assertTrue(timeSpent.contains(text));
	}

}

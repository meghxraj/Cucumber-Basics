package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber_basics.Base;
import io.cucumber.java.en.*;

public class StepDefinations extends Base{

	WebDriver driver;
//^ ans $ is regex used to match the words/text within
	@Given("^User has opened Facebook page$")
	public void user_has_opened_facebook_page() {
		driver = getDriver();
		driver.get("https://facebook.com");
	}

	@When("user logs in with {string} and {string}")
	public void user_logs_in_with_and(String string, String string2) {
		System.out.println("username and pwd");
	}


	@Then("dashboard is diaplayed")
	public void dashboard_is_diaplayed() {
		System.out.println(driver.getTitle());

	}

	@Then("other details are shown")
	public void other_details_are_shown() {
		driver.quit();

	}
	
	

	

}

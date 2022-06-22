package stepDefination;

import io.cucumber.java.en.*;

public class Background {
	
	@Given("Open to facebook page")
	public void open_to_facebook_page() {
	    System.out.println("open facebook page");
	}

	@Then("Login using test {int} and testpwd")
	public void login_using_test_and_testpwd(Integer int1) {
	    System.out.println("login int :"+int1);
	}

	@Then("verify if the title is displayed")
	public void verify_if_the_title_is_displayed() {
	   System.out.println("title displayed");
	}

	@Then("navigate to home page")
	public void navigate_to_home_page() {
	System.out.println("homepage nvigation");
	}

	@Then("perform some action")
	public void perform_some_action() {
	   System.out.println("action performed");
	}

	@Then("navigate to feed page")
	public void navigate_to_feed_page() {
	   System.out.println("navigate feed");
	}
	@Then("Navigate to feed tab")
	public void navigate_to_feed_tab() {
	   System.out.println("navigate feed tab");
	}
}

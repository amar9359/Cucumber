package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@Given("User is on Application login page")
	public void user_is_on_application_login_page() {
	    System.out.println("AAAAAAAAAAAA");
	}
	@When("User enters the username and password on login page")
	public void user_enters_the_username_and_password_on_login_page() {
	   System.out.println("BBBBBBBBBBBBBB");
	}
	@When("User clicks on login button on login page")
	public void user_clicks_on_login_button_on_login_page() {
	    System.out.println("CCCCCCCCCCCCCC");
	}
	@Then("User verify Dashboard page is displayed")
	public void user_verify_dashboard_page_is_displayed() {
	   System.out.println("DDDDDDDDDDDDDDD");
	}
	@Then("user click on My info tab on Dashboard Page")
	public void user_click_on_my_info_tab_on_dashboard_page() {
	    System.out.println("EEEEEEEEEEEEEEEEE");
	}

}

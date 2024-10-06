package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage2;

public class LoginSteps2 {
	WebDriver driver;
	Properties p;
	LoginPage2 lp;

	/*@Given("User navigates to the login page")
	public void user_navigates_to_the_login_page() {
		
	}*/

	@Given("User enter the email address {string} and password {string}")
	public void user_enter_the_email_address_and_password(String string, String string2) {
		lp=new LoginPage2(BaseClass.getDriver());
	    lp.getUsername(string);
	    lp.getPassword(string2);
	}

	@When("User click on the Login button")
	public void user_click_on_the_login_button() {
	   lp.clickLoginButton();
	}

	@Then("User should navigates to the Homepage")
	public void user_should_navigates_to_the_homepage() {
	   lp.validCredentials();
	}

	@Then("User should not navigates to the Homepage and validate the error message")
	public void user_should_not_navigates_to_the_homepage_and_validate_the_error_message() {
	    lp.invalidCredentials();
	}
}

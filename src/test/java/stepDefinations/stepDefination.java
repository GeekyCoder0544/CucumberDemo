package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^User is on NetBanking Landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("Navigated to Login Page");
    }

    @When("^User Login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("Logged in Success");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home page is arrived");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("Cards are displayed");
    }

}

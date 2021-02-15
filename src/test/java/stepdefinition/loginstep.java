package stepdefinition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
public class loginstep {
	@Given("^user is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
		
		System.out.println("hi");
        
    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
    	System.out.println("hi");
    }
    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String arg1, String arg2) throws Throwable {
    	
    	System.out.println(arg1+" "+arg2);
        
    }
    @Then("^page is populated$")
    public void page_is_populated() throws Throwable {
    	System.out.println("hi");
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("hi");
    }
    @Then("^cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
      System.out.println(arg1);
    }
}

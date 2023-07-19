package stepDef;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.TestBase;

public class GoogleSearch_StepDef extends TestBase{

	public GoogleSearch_StepDef() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("User is able to launch Google Chrome")
	public void user_is_able_to_launch_google_chrome() {
	    initialization();
	}

	@Given("User is able to access Search Text Box")
	public void user_is_able_to_access_search_text_box() {
	}

	@When("User enters inofmration in search box")
	public void user_enters_inofmration_in_search_box() {
	    
	}

	@When("User hits Search button")
	public void user_hits_search_button() {
	    
	}

	@Then("User is able to navigate to Search Page Result")
	public void user_is_able_to_navigate_to_search_page_result() {
	    
	}
}

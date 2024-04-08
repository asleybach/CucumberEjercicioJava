package src.test.java.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesfactory.Test_PF;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;

public class TestStepsPF {

	ChromeDriver driver = new ChromeDriver();
	Test_PF test;
	
	@Given("user go to the Google search page")
	public void user_go_to_the_google_search_page() {
	    System.out.println("user go to the Google search page");	    
	    test.user_go_to_the_google_search_page();
	    
	}
	
	@When("user search for {string}")
	public void user_search_for(String string) {
	    System.out.println("user search for Automation");    
	    test.user_search_for();
	}

	@Then("user see search results for {string}")
	public void user_see_search_results_for(String string) {
	    System.out.println("user see search results for Automation");
	}

	@And("user click the Wikipedia link for {string}")
	public void user_click_the_wikipedia_link_for(String string) {		
		System.out.println("user click the Wikipedia link for Automation");		
	}

	@And("user capture a screenshot of the Wikipedia page")
	public void user_capture_a_screenshot_of_the_wikipedia_page() {       
	    System.out.println("user capture a screenshot of the Wikipedia page");
	    test.user_capture_a_screenshot_of_the_wikipedia_page();
	}
	
}
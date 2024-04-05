package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;

public class TestSteps {
	
	/*

	ChromeDriver driver = new ChromeDriver();
	
	@SuppressWarnings("deprecation")
	@Given("user go to the Google search page")
	public void user_go_to_the_google_search_page() {
	    System.out.println("user go to the Google search page");
	    
	    System.setProperty(
	    		"webdriver.chrome.drive",
	    		"src/test/resources/driver/chrome"
	    );
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    
	    driver.navigate().to("https://google.com");
	    
	}

	@When("user search for {string}")
	public void user_search_for(String string) {
	    System.out.println("user search for Automation");
	    
	    driver.findElement(By.name("q")).sendKeys("Automation");
        driver.findElement(By.name("btnK")).click();
	}

	@Then("user see search results for {string}")
	public void user_see_search_results_for(String string) {
	    System.out.println("user see search results for Automation");
	}

	@And("user click the Wikipedia link for {string}")
	public void user_click_the_wikipedia_link_for(String string) {
		
		driver.findElement(By.partialLinkText("Wikipedia")).click();
	    
		System.out.println("user click the Wikipedia link for Automation");
	}

	@And("user capture a screenshot of the Wikipedia page")
	public void user_capture_a_screenshot_of_the_wikipedia_page() {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        screenshotFile.renameTo(new File("target/captura_wikipedia.png"));

        driver.quit();
        
        
	    System.out.println("user capture a screenshot of the Wikipedia page");
	}

	*/
}

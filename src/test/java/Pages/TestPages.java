package src.test.java.Pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestPages {
	
	WebDriver driver;
	
	public TestPage(WebDriver driver) {
		this.driver = driver;
	}
		
	@SuppressWarnings("deprecation")
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

	public void user_search_for() {
	    System.out.println("user search for Automation");    
	    driver.findElement(By.name("q")).sendKeys("Automation");
	    driver.findElement(By.name("btnK")).click();
	}

	public void user_click_the_wikipedia_link_for(String string) {
		
		driver.findElement(By.partialLinkText("Wikipedia")).click();
	    
		System.out.println("user click the Wikipedia link for Automation");
	}

	public void user_capture_a_screenshot_of_the_wikipedia_page() {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
	    screenshotFile.renameTo(new File("target/captura_wikipedia.png"));
	    driver.quit();   
	    System.out.println("user capture a screenshot of the Wikipedia page");
	}

}


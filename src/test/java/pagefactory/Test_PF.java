package src.test.java.pagefactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pagesfactory.Test_PF;


public class Test_PF {
	
	public Test_PF(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, Test_PF.class);
		
	}
	
	@SuppressWarnings("deprecation")
	public void user_go_to_the_google_search_page() {
		
		System.setProperty(
	    		"webdriver.chrome.drive",
	    		"src/test/resources/driver/chrome"
	    );
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    
	    driver.navigate().to("https://google.com");
	    
	}
	
	public void user_search_for() {
		  driver.findElement(By.name("q")).sendKeys("Automation");
	        driver.findElement(By.name("btnK")).click();
	}
	
	public void user_click_the_wikipedia_link_for () {
		
		driver.findElement(By.partialLinkText("Wikipedia")).click();
		
	}
	
	public void user_capture_a_screenshot_of_the_wikipedia_page() {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        screenshotFile.renameTo(new File("target/captura_wikipedia.png"));

        driver.quit();
	}
	
	

}

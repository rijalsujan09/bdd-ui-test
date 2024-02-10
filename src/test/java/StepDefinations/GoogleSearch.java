package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

//	WebDriver driver = null;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Step : browser is open");
//
//		String projectpath = System.getProperty("user.dir");
//		System.out.println(projectpath);
//		System.getProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on  google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside Step: User is on google search page");
//		driver.navigate().to("https://google.com");
//		
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//		System.out.println("Inside Step: User enters a text in search box");
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		Thread.sleep(2000);
//	}
//
//	@And("hit enter")
//	public void hit_enter() throws InterruptedException {
//		System.out.println("Inside Step: User hits enter");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		
//		Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		System.out.println("Inside Step: User in navigated to search result.");
//		driver.getPageSource().contains("Oline Courses");
//		
//		driver.close();
//		driver.quit();
//	}

}

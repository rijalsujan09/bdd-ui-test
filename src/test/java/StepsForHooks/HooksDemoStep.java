package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoStep {

//	WebDriver driver;
//
//	@Before(order = 1)
//	public void browserSetup() {
//		System.out.println("I am  inside browser set-up");
//		System.setProperty("webdrive.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//	
//	@Before(order = 2)
//	public void newSetUp() {
//		System.out.println("I am inside setp 2");
//	}
//
//	@After(order = 2)
//	public void tearDown() {
//		System.out.println("I am  inside tearDown");
//		driver.close();
//		driver.quit();
//	}
//	
//	@After( order = 1)
//	public void tearDownTwo() {
//		System.out.println("I am  inside tearDown two");
//		driver.close();
//		driver.quit();
//	}
//	
//	
//	@BeforeStep
//	public void beforeSteps() {
//		System.out.println("\nI am inside beforeSteps ----1");
//	}
//	
//	@AfterStep
//	public void afterSteps() {
//		System.out.println("I am inside afterSteps ----2\n");
//	}
//	
//
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//
//		System.out.println("Hi from login page");
//	}
//
//	@When("enter valid username and password")
//	public void enter_valid_username_and_password() {
//		System.out.println("Enter username and password ");
//
//	}
//
//	@When("click login button")
//	public void click_login_button() {
//		System.out.println("click login button");
//
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		System.out.println("Hi from Home page");
//	}
}

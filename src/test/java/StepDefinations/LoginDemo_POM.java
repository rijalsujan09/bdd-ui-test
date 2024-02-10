package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPageBSS;

public class LoginDemo_POM {
	
//	WebDriver driver = new ChromeDriver();
//	LoginPageBSS loginPage = new LoginPageBSS(driver);
//
//	@Given("open browser")
//	public void open_browser() {
//		System.out.println("============PageObject Model==============");
//		System.out.println("Step:1 -> browser is open");
//		String projectpath = System.getProperty("user.dir");
//		System.out.println(projectpath);
//		System.getProperty("webdriver.chrome.driver", projectpath + "/src/test/resources/drivers/chromedriver.exe");
////		driver = new ChromeDriver();
////		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////
////		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@Given("user is on loginPage")
//	public void user_is_on_login_page() throws InterruptedException {
//		System.out.println("===========================================");
//		System.out.println("Step:2 -> User is on login page");
////		driver = new ChromeDriver();
//		driver.navigate().to("https://bss.ddaas.castera.us");
//		Thread.sleep(1000);
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//		System.out.println("===========================================");
//		System.out.println("Step:3 -> User enters username and password"); 
//		 loginPage.enterUsername(username);
//		 loginPage.enterPassword(password);
////		driver.findElement(By.id("username")).sendKeys(username);
////		driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(500);
//	}
//
//	@When("click on login button")
//	public void click_on_login_button() throws InterruptedException {
//		System.out.println("===========================================");
//		System.out.println("Step:4 -> User clicks login button");
//		loginPage.clickLogin();
////		driver.findElement(By.className("login_btn")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user is navigated to the dashboard")
//	public void user_is_navigated_to_the_dashboard() throws InterruptedException {
//		System.out.println("===========================================");
//		System.out.println("Step:5 -> User is on Dashboard");
//		loginPage.userInfoDisplayed();
////		driver.getPageSource().contains("dashboard");
//		Thread.sleep(1000);
//		driver.close();
//		driver.quit();
//		System.out.println("===========================================");
//	}
}

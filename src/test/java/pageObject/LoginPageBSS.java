package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageBSS {
	
	protected WebDriver driver;
	
	private By bss_username = By.id("username");
	private By bss_password = By.id("password");
	private By btn_login = By.className("login_btn");
	private By user_info = By.className("user_info");
	 
	
	public LoginPageBSS(WebDriver driver) {
		this.driver = driver;
	}
	

	public void enterUsername(String username) {
		driver.findElement(bss_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(bss_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void userInfoDisplayed() {
		driver.findElement(user_info).isDisplayed();
	}
	
	
	public void loginValidUser(String username, String password) {
		driver.findElement(bss_username).sendKeys(username);
		driver.findElement(bss_password).sendKeys(password);
		driver.findElement(btn_login).click();

	}
}

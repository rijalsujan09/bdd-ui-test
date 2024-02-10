package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	@FindBy(className = "user_info")
	WebElement user_info;

//	@FindBy(partialLinkText = "test")
//	List<WebElement> myLinks;
//
//	@FindBy(how = How.ID, using = "username")
//	WebElement abc;

	protected WebDriver driver;

	public HomePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void userInfoDisplayed() {
		Boolean bool = user_info.isDisplayed();
		String msg = (bool) ? "yes we are in Dashboard" : "No we are in Dashboard";
		System.out.println(msg);
	}
}

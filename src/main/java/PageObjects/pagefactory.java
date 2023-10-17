package PageObjects;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactory  {
	WebDriver driver;
	public pagefactory(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy (id = "Email")
	private WebElement username;
	
	@FindBy (id = "Password")
	private WebElement passwordinLogin;

	@FindBy (xpath = "//*[text()='Log in']")
	private WebElement login;
	
	@FindBy (xpath = "(//input[@type='submit'])[2]")
	private WebElement click;


public WebElement getusername() {
		return username;
	}
public WebElement getclick() {
	return click;
}

	public WebElement getpasswordinLogin() {
		return passwordinLogin;
	}

public WebElement login() {
		return login;
	}
@FindBy (id = "register-button")
private WebElement save;


public WebElement getSave() {
	return save;
}


}
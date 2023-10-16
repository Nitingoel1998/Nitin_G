package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyLoginPage {

	public WebDriver driver;

	public VerifyLoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement Practice;
	
	@FindBy(xpath = "//a[text()='Test Login Page']")
	private WebElement TestLogin;

	@FindBy(id = "username")
	private WebElement Username;

	@FindBy(id = "password")
	private WebElement Password;
	
	@FindBy(id = "submit")
	private WebElement Submit;

	@FindBy(xpath = "//*[@class='post-title']")
	private WebElement verifyLogin;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getTestLogin() {
		return TestLogin;
	}
	public WebElement getverifyLogin() {
		return verifyLogin;
	}
	public WebElement getPractice() {
		return Practice;
	}
}
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactory  {

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

	@FindBy(xpath="(//a[contains(text(),'Electronics')])[3]")

    private WebElement Electronics;

       @FindBy(xpath="(//*[@title='Show products in category Cell phones'])[3]")

       private WebElement cellphone;

       

       @FindBy(xpath="(//input[@type='button'])[3]")

        private WebElement AddToCart;

       

public WebElement getusername() {
		return username;
	}
public WebElement getElectronics() {
	return Electronics;
}
public WebElement getcellphone() {
	return cellphone;
}
public WebElement getaddtocart() {
	return AddToCart;
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
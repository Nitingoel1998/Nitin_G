package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;


	 

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	 

	public class DemoWebShopPage {

	 

		WebDriver driver;

		public DemoWebShopPage(WebDriver Stepsdriver) {
			this.driver = Stepsdriver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//a[@class='ico-register']")
		WebElement RegisterLink;

		@FindBy(id = "gender-male")
		WebElement MaleGender;

		@FindBy(id = "gender-female")
		WebElement FemaleGender;

		@FindBy(id = "FirstName")
		WebElement FirstName;

		@FindBy(id = "LastName")
		WebElement LastName;

	 

		@FindBy(id = "Email")
		WebElement Email;

		@FindBy(name = "Password")
		WebElement Password;

		@FindBy(name = "ConfirmPassword")
		WebElement ConfirmPassword;

		@FindBy(id = "register-button")
		WebElement Register_Button;


		public void click_register_link_page() {
			RegisterLink.click();
		}

		public void enter_details_for_registeration(String FName, String LName, String gender, String EmailID, String pswd) {
			if(gender.equalsIgnoreCase("male")) {
				MaleGender.click();
			}else {
				FemaleGender.click();
			}

			FirstName.sendKeys(FName);
			LastName.sendKeys(LName);
			Email.sendKeys(EmailID);
			Password.sendKeys(pswd);
			ConfirmPassword.sendKeys(pswd);
		}

		public void click_on_register_button() {
			Register_Button.click();
		}



	// Identifiers
}

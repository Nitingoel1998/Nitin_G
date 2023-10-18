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

		@FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
		WebElement Gift_Cards;
		@FindBy(xpath = "(//div[@class='picture']/a/img)[1]")
		WebElement Gift_Cards_Img1;
		@FindBy(xpath = "//input[@class='recipient-email']")
		WebElement Recipient_email;
		@FindBy(xpath = "//input[@class='recipient-name']")
		WebElement Recipient_name;
		@FindBy(xpath = "//textarea[@class='message']")
		WebElement emailTextMessage;
		@FindBy(xpath = "//input[@value='Email a friend']")
		WebElement emailButton;
		@FindBy(xpath = "//input[@class='friend-email']")
		WebElement friendemailid;
		@FindBy(xpath = "//input[@name='send-email']")
		WebElement sendEmail;
		
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

public void sendGiftcard() {
	Gift_Cards.click();
	Gift_Cards_Img1.click();
	Recipient_email.click();
	Recipient_email.sendKeys("test1@gmail.com");
	Recipient_name.sendKeys("Test1");
	emailTextMessage.sendKeys("Send Message");
	emailButton.click();
	friendemailid.sendKeys("Test2@gmail.com");
	sendEmail.click();
}

	// Identifiers
}

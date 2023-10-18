package StepDefinitions;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import PageObjects.pagefactory;
import org.testng.Assert;

import PageObjects.DemoWebShopPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
//import cucumber.api.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebShop {
	public static WebDriver driver;
	public static DemoWebShopPage registerUser;
	public static pagefactory l;
	@Given("Open the browser")
	public void open_the_browser() {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
//		WebDriverManager.chromedriver().setup();
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/java/Driver/chromedriver.exe" );
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	}

	@When("Enter the URL {string}")
	public void enter_the_URL(String url) {
		 l = new pagefactory(driver);
		registerUser = new DemoWebShopPage(driver);
		driver.get(url);
		
	    
	}

	@And("Click on register button")
	public void click_on_register_button() {
	   registerUser.click_register_link_page();
	}



	@And("Enter the details {string} , {string} , {string} , {string} and {string}")
	public void enter_the_details(String FName, String LName, String Gender, String Email, String Password) {
		registerUser.enter_details_for_registeration(FName, LName, Gender, Email, Password);
	}



	@Then("Click on save")
	public void click_on_save() {
		registerUser.click_on_register_button();
	}
	
	@Then("click logged in")
	public void click_logged_in() {
       	
		l.login().click();
	}

	@Then("enter username and password and click enter")
	public void enter_username_and_password_and_click_enter() {
		
		l.getusername().sendKeys("mannugo@gmail.com");
		l.getpasswordinLogin().sendKeys("Test@123");
		l.getclick().click();
	}
	@Then("click phone and add to cart")

	public void click_phone_and_add_to_cart() {

		l.getElectronics().click();

		l.getcellphone().click();

		l.getaddtocart().click();

		driver.quit();

	}
	
	@Then("Select laptop and click on Add to compare")

	public void Select_laptop_and_Add_to_Compare() {

		registerUser.Add_to_Compare_laptop();

		driver.quit();

	}
}


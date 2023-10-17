package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObjects.DemoWebShopPage;
//import cucumber.api.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoWebShop {
	public static WebDriver driver;
	public static DemoWebShopPage registerUser;
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
	
	
}


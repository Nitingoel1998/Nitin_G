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
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
//import cucumber.api.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static WebDriver driver;
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
		driver.get(url);
	    
	}


	
	
//	@After
//	public void tearDown() {
//		driver.close();
//		System.out.println("Browser Closed ");
//	}
}


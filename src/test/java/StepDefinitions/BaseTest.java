package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;

	public void openBrowser() {
		 ChromeOptions options=new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
}

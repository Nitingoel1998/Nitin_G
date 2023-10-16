package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;

public class GoogleSearchPage {
	WebDriver driver;

	// Identifiers
	public By SearchBox = By.name("q");
	By firstSearchItem = By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]");
	By amazonSearchBox = By.xpath("//input[@id='twotabsearchtextbox']");
	//By closePopUp = By.xpath("//div[@class='_2QfC02']/button[@class='_2KpZ6l _2doB4z']");
	By amazonPriceText = By.xpath("(//span[@class='a-price-whole'])[1]");
	By flipkartPriceText = By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]");
	By closepopup = By.xpath("//div[@class='_2QfC02']/button[@class='_2KpZ6l _2doB4z']");
	By AppleSiteSearchIcon = By.id("globalnav-menubutton-link-search");
	By AppleSearchBar = By.xpath("//input[@placeholder='Search']/..");
	By AppleFirstSearchItem = By.xpath("(//a[@class='rf-serp-name-link'])[1]");
	public By flipKartItemCount = By.xpath("//span[@class='_10Ermr']");
	public By AmazonItemCount = By.xpath("//*[contains(text(),'results for')]");
	// input[@id='twotabsearchtextbox']

	// Constructor to force the class to use the same driver
	// It will be called everytime when an instance or object of the class is
	// created
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	// methods for all the objects and actions to be performed

	
	
	public double numericPrice(String text) {

		String price = text.replaceAll("[^0-9]", "");
		double originalPrice = Double.parseDouble(price);
		return originalPrice;
	}

	public void enterTextInAmazonSearchBoxAndSearch(String text) {
		WebElement amzSearchBox = driver.findElement(amazonSearchBox);
		amzSearchBox.click();

		amzSearchBox.sendKeys(text + Keys.ENTER);
	}
	
	public void enterTextInAmazonSearchBoxAndCount(String text) {
		WebElement amzSearchBox = driver.findElement(amazonSearchBox);
		amzSearchBox.click();

		amzSearchBox.sendKeys(text);
	}

	public void openURL(String URL) {
		driver.navigate().to(URL);
	}
	
	
	
	public void closePopUp() {

		if(driver.findElement(closepopup).isDisplayed()) {
			driver.findElement(closepopup).click();
		}
	}

	public void enterTextAndSearch(String value) {
		driver.findElement(SearchBox).sendKeys(value + Keys.ENTER);
	}
	
	public void enterTextAndCount(String value) {
		driver.findElement(SearchBox).sendKeys(value);
	}

	public void max_Window() {
		driver.manage().window().maximize();
	}

	public void navigate_Back() {
		driver.navigate().back();
	}

	public void close_Browser() {
		driver.quit();
//		driver.close();
	}

	public void click_firstItem() {
		driver.findElement(firstSearchItem).click();
	}

	public void searchItemOnFlipkartOrAmazon(String text) {
		String webTitle = driver.getTitle();

		if (webTitle.contains("Amazon")) {

			enterTextInAmazonSearchBoxAndSearch(text);

		} else {

			WebElement ClosePopUpIcon = driver.findElement(closepopup);

			if (ClosePopUpIcon.isDisplayed()) {
				ClosePopUpIcon.click();
			}

			enterTextAndSearch(text);
			Actions action = new Actions(driver);
			action.moveToElement((WebElement) SearchBox);
			

		}
	}

	public void captureAndComparePrices() {

		String webTitle = driver.getTitle();
		double amazPrice = 0;
		double flipPrice = 0;
		
		if (webTitle.contains("Amazon")) {

			String amazonPrice = driver.findElement(amazonPriceText).getText();
			amazPrice = numericPrice(amazonPrice);
			System.out.println("AmazonPrice = " + amazPrice);
		}		
		else {

			String flipkartPrice = driver.findElement(flipkartPriceText).getText();
			flipPrice = numericPrice(flipkartPrice);
			System.out.println("FlipkartPrice = " + flipPrice);
		}
		amazPrice = amazPrice;
		flipPrice = flipPrice;
		if(amazPrice>flipPrice){
			System.out.println("Amazon Price is higher");
		}
		if(amazPrice<flipPrice){
			System.out.println("Flipkart Price is higher");
		}
		if(amazPrice==flipPrice){
			System.out.println("Amazon and Flipkart Prices are same");
		}
		
	}

}

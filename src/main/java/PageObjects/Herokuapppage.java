package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 

public class Herokuapppage {

 

    WebDriver driver;

 

    // Identifiers
    By javascriptAlert = By.xpath("//a[text() = 'JavaScript Alerts']");
    //By result = By.id("result");
 

    // Constructor to force the class to use the same driver
    // It will be called everytime when an instance or object of the class is
    // created
    public Herokuapppage(WebDriver driver) {
        this.driver = driver;
    }

 

    public void openURL(String URL) {
        driver.navigate().to(URL);
    }

 

    // methods for all the objects
    public void clickJavascriptAlert() {
        driver.findElement(javascriptAlert).click();
    }
    public void result() {
    	try {
    	String result=driver.findElement(By.id("result")).getText();
    	System.out.println(result);
    }catch(Exception e) {
    	
    }
    }

    public void clickEachAlert(String value) {
        driver.findElement(By.xpath("//button[text() = '"+value+"']")).click();
    }

 

}

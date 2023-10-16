package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 

public class OrangeHCMPage {

 

    WebDriver driver;

    public By username = By.name("username");
    public By password = By.name("password");
    public By btn = By.xpath("//button[@type='submit']");

    By PIM = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]");
    By addEmp = By.xpath("//a[contains(text(),'Add Employee')]");
    By firstname = By.name("firstName");
    By middleName = By.name("middleName");
    By lastname = By.name("lastName");
//    By captureID =

    By empList = By.xpath("//a[contains(text(),'Employee List')]");
    By empSearch = By.xpath("(//input[@placeholder='Type for hints...'])[1]");

    By records = By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]");



    public OrangeHCMPage(WebDriver OrangeHCMdriver) {
        this.driver = OrangeHCMdriver;
    }

    public void Login(String userName, String passWord) {
        driver.findElement(username).sendKeys(userName);
        driver.findElement(password).sendKeys(passWord);
        driver.findElement(btn).click();
    }

    public void addEmployee(String FName, String MName, String LName) throws InterruptedException {
        driver.findElement(PIM).click();
        driver.findElement(addEmp).click();
        Thread.sleep(3000);
        driver.findElement(firstname).sendKeys(FName);
        driver.findElement(middleName).sendKeys(MName);
        driver.findElement(lastname).sendKeys(LName);
        Thread.sleep(2000);
        driver.findElement(btn).click();
        System.out.println("Employee Added Successfully");
    }

    public String searchEmployee(String nameToSearch) throws InterruptedException {
        System.out.println("I'm inside searchEmployee");
        driver.findElement(empList).click();
        System.out.println("clicked empllist"); 
        Thread.sleep(2000);
        driver.findElement(empSearch).sendKeys(nameToSearch);
        Thread.sleep(2000);
        System.out.println("entered nameToSearch");
        driver.findElement(btn).click();
        System.out.println("Clicked search button");
        Thread.sleep(2000);
        String record = driver.findElement(records).getText();
        return record;
    }

    public void verification(String actual, String expected) {
        if(actual.toLowerCase().contains(expected.toLowerCase())) {
            System.out.println("Not Found");
        }else {
            System.out.println("Found");

            //driver.findElement(By.xpath("(//div[@class='oxd-table-cell oxd-padding-cell'])[2]"));
//            count = 
        }
    }



}

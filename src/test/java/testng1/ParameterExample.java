package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParameterExample {

    public static WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {

        System.setProperty("webdriver.chrome.driver", "F:/PRATHAMESH SHEVALE/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }
    @Test
    public void verifyParameterization(){
        String name = "Rankala";
        String city = "Kolhapur";
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(name + " " + city);
        element.sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}

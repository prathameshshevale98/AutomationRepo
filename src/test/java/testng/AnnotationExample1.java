package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample1 {

    public static WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "F:/PRATHAMESH SHEVALE/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test1() {
        driver.get("https://www.instagram.com/accounts/login/");
    }

    @Test
    public void test2() {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }

}
package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenExample {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "F:/PRATHAMESH SHEVALE/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.instagram.com/accounts/login/");
            Thread.sleep(2000);
            driver.close();
        }
    }


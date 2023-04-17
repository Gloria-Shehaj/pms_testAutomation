package pms_completetest.pom.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public WebDriver initializeDriver(){
        System.setProperty("web-driver.chrome.driver","C:\\Users\\User\\selenium_jars&drivers\\drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;

    }
}

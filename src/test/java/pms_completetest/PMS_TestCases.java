package pms_completetest;


import org.testng.annotations.Test;
import pms_completetest.pom.base.BaseTest;
import pms_completetest.pom.pages.LogInPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class PMS_TestCases extends BaseTest {


@Test (priority = 1)
    public void logInTest(){
   // System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\selenium_jars&drivers\\drivers\\chromedriver\\chromedriver.exe");
           // WebDriver driver = new ChromeDriver();
            driver.get("https://pms.dev.al/#/login");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            LogInPage logInPage = new LogInPage(driver);
            String actualTitle = logInPage.pageTitle();
            String expectedTitle = "Hotel Managment System";
            assertEquals(actualTitle,expectedTitle);
            logInPage.fillLogInSteps("P11111111S","admin", "tempP@ss1234");
}

}


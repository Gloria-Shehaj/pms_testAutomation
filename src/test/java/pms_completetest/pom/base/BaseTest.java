package pms_completetest.pom.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pms_completetest.pom.factory.DriverManager;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void startDriver(){
        driver = new DriverManager().initializeDriver();

    }
    @AfterMethod
    public void takeSnapShot(String name) throws IOException{
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(System.getProperty("user.dir")+"/pms_completetest/snapShot"+timestamp() + ".png");
        FileUtils.copyFile(srcFile,destFile);
    }
    public String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
    public void quitDriver(){
        driver.quit();

    }
}

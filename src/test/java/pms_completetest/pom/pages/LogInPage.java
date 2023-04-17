package pms_completetest.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pms_completetest.pom.base.BasePage;

public class LogInPage extends BasePage {
    private final By niptField = By.cssSelector("input[name='nipt']");
    private final By userNameField = By.cssSelector("input[formcontrolname=\"username\"]");
    private final By passwordField = By.cssSelector("[formcontrolname='password']");
    private final By logInButton = By.cssSelector(".mat-raised-button");
    public LogInPage(WebDriver driver) {
        super(driver);
    }
    public String pageTitle() {
    return driver.getTitle();}

    public void fillLogInSteps(String nipt, String username, String password){
        driver.findElement(niptField).sendKeys(nipt);
        driver.findElement(userNameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(logInButton).click();

    }
    public void enterNiptValue(String nipt){
        driver.findElement(niptField).sendKeys(nipt);
    }
    public void enterUsernameValue(String username){
        driver.findElement(userNameField).sendKeys(username);
    }
    public void enterPasswordValue(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLogInButton(){
        driver.findElement(logInButton).click();
    }
}

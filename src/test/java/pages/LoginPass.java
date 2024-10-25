package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.ElementAction;
import utility.WebDriverUtility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPass {

    WebDriverUtility ui ;
    private WebDriver driver;
    private ElementAction elementAction;


    public LoginPass(WebDriver driver) {
        this.ui = new WebDriverUtility();
        this.driver = driver;
        this.elementAction = new ElementAction(driver);
    }

    public void enterEmail(String email) throws InterruptedException {

        By emailField = By.id("email");
        elementAction.enterTxt(emailField, email);
        ui.sleep(1);
    }

    public void enterPassword(String password) throws InterruptedException {

        By passwordField = By.id("passwd");
        elementAction.enterTxt(passwordField,password);
        ui.sleep(1);
    }


    public void clickLogin() throws InterruptedException {

        By clickLoginBtn = By.xpath("//span[contains(.,'Sign in')]");
        elementAction.clickElement(clickLoginBtn);
        ui.sleep(1);
    }





}


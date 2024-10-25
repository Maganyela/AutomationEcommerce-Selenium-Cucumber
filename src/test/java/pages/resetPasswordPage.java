package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ElementAction;
import utility.WebDriverUtility;

import java.util.concurrent.TimeUnit;

public class resetPasswordPage {


    private ElementAction elementAction;
    private WebDriver driver;
    WebDriverUtility ui;

    public resetPasswordPage(WebDriver driver) {
        this.driver = driver;
        this.elementAction = new ElementAction(driver);
        this.ui = new WebDriverUtility();
    }

    public void clickForgotPassword() throws InterruptedException {

        By forgotPassword = By.xpath("//a[.='Forgot your password?']");
        elementAction.clickElement(forgotPassword);

        ui.sleep(2);
    }

    public void enterEmail(String emailAddress) throws InterruptedException {

        By emailField = By.id("email");
        elementAction.enterTxt(emailField,emailAddress);

        ui.sleep(2);
    }

    public void clickRecoveryPassword() {

        By recoveryButton = By.xpath("//span[.='Retrieve Password']");
        elementAction.clickElement(recoveryButton);
    }

}

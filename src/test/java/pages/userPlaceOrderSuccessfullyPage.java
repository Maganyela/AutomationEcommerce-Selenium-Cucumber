package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.ElementAction;
import utility.WebDriverUtility;

import static org.junit.Assert.assertTrue;

public class userPlaceOrderSuccessfullyPage {

    WebDriverUtility ui = new WebDriverUtility();
    private ElementAction elementAction;
    private WebDriver driver;

    public userPlaceOrderSuccessfullyPage(WebDriver driver) {
        this.driver = driver;
        this.elementAction = new ElementAction(driver);
    }

    public void clickProceedCashOut() throws InterruptedException {

        By clickCashOutButton = By.xpath("//span[contains(.,'Proceed to checkout')]");
        elementAction.clickElement(clickCashOutButton);

        ui.sleep(2);
    }

    public void clickProceedCashOutSummary() throws InterruptedException {

        By clickCashOutSummary = By.xpath("//span[.='Proceed to checkout']");
        elementAction.clickElement(clickCashOutSummary);

        ui.sleep(2);
    }


    public void clickProceedCashOutAddress() throws InterruptedException {

        By clickProceedCashOut = By.xpath("//span[.='Proceed to checkout']");
        elementAction.clickElement(clickProceedCashOut);

        ui.sleep(2);
    }



    public void clickCashOutBtn() throws InterruptedException {

        By clickCheckbox = By.id("cgv");
        By clickCashOut = By.xpath("//button[@name='processCarrier']/span[contains(.,'Proceed to checkout')]");

        elementAction.clickElement(clickCheckbox);
        ui.sleep(3);
        elementAction.clickElement(clickCashOut);

        ui.sleep(2);
    }

    public void clickCashCheckPayment() throws InterruptedException {

        By clickCashCheckBtn = By.cssSelector(".cheque");
        elementAction.clickElement(clickCashCheckBtn);

        ui.sleep(2);
    }


    public void clickConfirmOrder() throws InterruptedException {

        By clickConfirmOrderBtn = By.xpath("//span[.='I confirm my order']");
        elementAction.clickElement(clickConfirmOrderBtn);

        ui.sleep(2);
    }

    public void clickOrderHistory() throws InterruptedException {

        By clickViewOrderHistory = By.cssSelector(".button-exclusive");
        elementAction.clickElement(clickViewOrderHistory);

        ui.sleep(3);
    }

    public void clickBackToAccount() throws InterruptedException {

        By clickBackToAccountBtn = By.xpath("//span[contains(.,'Back to Your Account')]");
        elementAction.clickElement(clickBackToAccountBtn);

        ui.sleep(2);
    }

    public void confirHomeLogo() {

        WebElement logo = driver.findElement(By.cssSelector("[alt='My Shop']"));
        assertTrue(logo.isDisplayed());
    }

}

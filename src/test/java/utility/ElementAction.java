package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ElementAction {

    private WebDriver driver;

    // initiate the driver
    public ElementAction(WebDriver driver) {
        this.driver = driver;

    }

    // Enter text function
    public void enterTxt(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    // Click Button or Element
    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

}

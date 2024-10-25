package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ElementAction;
import utility.WebDriverUtility;

public class filterProductColorPage {


    WebDriverUtility ui = new WebDriverUtility();
    private ElementAction elementAction;
    private WebDriver driver;

    public filterProductColorPage(WebDriver driver) {
        this.driver = driver;
        this.elementAction = new ElementAction(driver);
    }

    public void clickVisibleProduct() throws InterruptedException {

        By clickProductField = By.cssSelector("[alt='Faded Short Sleeve T-shirts']");
        elementAction.clickElement(clickProductField);

        ui.sleep(2);
    }

    public void clickBlueColor() throws InterruptedException {

        By clickBlueField  = By.name("Blue");
        elementAction.clickElement(clickBlueField);

        ui.sleep(4);
    }

    public void clickOrangeColor() throws InterruptedException {

        By clickOrangeField = By.name("Orange");
        elementAction.clickElement(clickOrangeField);

        ui.sleep(4);
    }
}

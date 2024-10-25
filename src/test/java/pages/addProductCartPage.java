package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.ElementAction;
import utility.WebDriverUtility;

public class addProductCartPage {


    WebDriverUtility ui = new WebDriverUtility();
    private ElementAction elementAction;
    private WebDriver driver;

    public addProductCartPage(WebDriver driver) {
        this.driver = driver;
        this.elementAction = new ElementAction(driver);
    }

    public void clickWomanButton() throws InterruptedException {

        By clickWomanField = By.xpath("//a[.='Women']");
        elementAction.clickElement(clickWomanField);

        ui.sleep(2);
    }

    public void clickPlusSign() throws InterruptedException {

        By clickSignField = By.xpath("//div[@id='categories_block_left']//li[1]/span[@class='grower CLOSE']");
        elementAction.clickElement(clickSignField);

        ui.sleep(2);
    }

    public void clickBlouseText() throws InterruptedException {

        By clickBlouseField = By.xpath("//div[@id='categories_block_left']//a[contains(.,'Blouses')]");
        elementAction.clickElement(clickBlouseField);

        ui.sleep(2);
    }

    public void clickVisibleProduct() throws InterruptedException {

        By clickProductField = By.cssSelector("[src='http://www.automationpractice.pl/img/p/7/7-home_default.jpg']");
        elementAction.clickElement(clickProductField);

        ui.sleep(2);
    }
    public void clickWhiteColor() throws InterruptedException {

        By clickWhiteField = By.name("White");
        elementAction.clickElement(clickWhiteField);

        ui.sleep(2);
    }

    public void clickAddCart() throws InterruptedException {

        By addCartButton = By.xpath("//span[.='Add to cart']");
        elementAction.clickElement(addCartButton);

        ui.sleep(2);
    }

    public void clickCashoutButton() throws InterruptedException {

        By clickProceedCashout = By.xpath("//span[contains(.,'Proceed to checkout')]");
        elementAction.clickElement(clickProceedCashout);

        ui.sleep(2);
    }


}

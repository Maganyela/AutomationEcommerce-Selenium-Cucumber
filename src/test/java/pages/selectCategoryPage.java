package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.ElementAction;
import utility.WebDriverUtility;

public class selectCategoryPage {

    WebDriverUtility ui = new WebDriverUtility();
    private ElementAction  elementAction;
    private WebDriver driver;

    public selectCategoryPage(WebDriver driver) {

        this.driver = driver;
        this.elementAction = new ElementAction(driver);

    }

    public void clickDressButton() throws InterruptedException {

        By clickDressButton = By.cssSelector(".sf-menu > li > [title='Dresses']");
        elementAction.clickElement(clickDressButton);

        ui.sleep(2);
    }

    public void clickCasualCheckbox() throws InterruptedException {

        By clickCasualCheckbocField = By.xpath("//input[@value='9']");
        elementAction.clickElement(clickCasualCheckbocField);

        ui.sleep(3);
    }

    public void clickEvenCheckbox() throws InterruptedException {

        By clickEvenCheckboxField = By.xpath("//input[@value='10']");
        elementAction.clickElement(clickEvenCheckboxField);

        ui.sleep(3);
    }

    public void clickSummerCheckboxField() throws InterruptedException {

        By clickSummerCheckboxField = By.xpath("//input[@value='11']");
        elementAction.clickElement(clickSummerCheckboxField);

        ui.sleep(3);
    }

    public void seeCategories() {

        WebElement txtCategories = driver.findElement(By.cssSelector(".cat-name"));
        assert(txtCategories.getText().equals("Dresses > Categories Casual Dresses/Evening Dresses/Summer Dresses"));
    }
}

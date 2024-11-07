package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.ElementAction;
import utility.WebDriverUtility;

public class searchProductPage {

    WebDriverUtility ui = new WebDriverUtility();
    private ElementAction elementAction;
    private WebDriver driver;

    public searchProductPage(WebDriver driver) {
        this.driver = driver;
        this.elementAction = new ElementAction(driver);
    }

    public void searchTheProduct(String productType) throws InterruptedException {


        By enterSearchField = By.id("search_query_top");
        elementAction.enterTxt(enterSearchField,productType);
        ui.sleep(3);
    }

    public void clickSearch() throws InterruptedException {

        By clickSearchField = By.name("submit_search");
        elementAction.clickElement(clickSearchField);
        ui.sleep(2);
    }

    public void textSearched() {

        WebElement txtSearchedField = driver.findElement(By.cssSelector(".lighter"));
        assert(txtSearchedField.getText().equals("Faded Short Sleeve T-shirts"));
    }
}

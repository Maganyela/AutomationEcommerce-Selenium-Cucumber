package stepDefnition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.searchProductPage;
import utility.WebDriverUtility;

public class searchProductStepDefinition {

    private searchProductPage searchProductPage;

    public searchProductStepDefinition() {
        searchProductPage = new searchProductPage(WebDriverUtility.getDriver());
    }

    @When("I search any product on the search bar")
    public void i_search_any_product_on_the_search_bar() throws InterruptedException {

        searchProductPage.searchTheProduct("Faded Short Sleeve T-shirts");
    }

    @When("I click on the search button")
    public void i_click_on_the_search_button() throws InterruptedException {

        searchProductPage.clickSearch();
    }

    @Then("the user should see the text that is used to search")
    public void i_should_be_able_to_see_the_productt() {

        searchProductPage.textSearched();
    }
}

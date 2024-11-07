package stepDefnition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.addProductCartPage;
import utility.WebDriverUtility;

public class addProductCartStepDefinition {

    private addProductCartPage productCartPage;

    public addProductCartStepDefinition() {

        productCartPage = new addProductCartPage(WebDriverUtility.getDriver());
    }

    @When("I click on the Woman button")
    public void i_click_on_the_woman_button() throws InterruptedException {

        productCartPage.clickWomanButton();
    }

    @When("I click on the plus sign to open the field")
    public void i_click_on_the_plus_sign_to_open_the_field() throws InterruptedException {

        productCartPage.clickPlusSign();
    }

    @When("I click on the Blouses text")
    public void i_click_on_the_blouses_text() throws InterruptedException {

        productCartPage.clickBlouseText();
    }

    @When("I click the Visible product")
    public void i_click_the_visible_product() throws InterruptedException {

        productCartPage.clickVisibleProduct();
    }

    @When("I click the White color")
    public void i_click_the_white_color() throws InterruptedException {

        productCartPage.clickWhiteColor();
    }

    @When("I click the Add to cart button")
    public void i_click_the_add_to_cart_button() throws InterruptedException {

        productCartPage.clickAddCart();
    }

    @When("I click the Proceed to cashOut button")
    public void i_click_the_proceed_to_cashout_button() throws InterruptedException {

        productCartPage.clickCashoutButton();
    }

    @Then("The product should be in the cart ready for cashOut")
    public void the_product_should_be_in_the_cart_ready_for_cashOut(){

        productCartPage.summaryCart();
    }
}

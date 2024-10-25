package stepDefnition;

import io.cucumber.java.en.When;
import pages.filterProductColorPage;
import utility.WebDriverUtility;

public class filterProductColorStepDefinition {


    private filterProductColorPage filterProductColor;

    public filterProductColorStepDefinition() {
        filterProductColor = new filterProductColorPage(WebDriverUtility.getDriver());
    }

    @When("I click the product")
    public void i_click_the_product() throws InterruptedException {

        filterProductColor.clickVisibleProduct();
    }

    @When("I click the Blue color checkbox")
    public void i_click_the_blue_color_checkbox() throws InterruptedException {

        filterProductColor.clickBlueColor();
    }

    @When("I click the Orange color checkbox")
    public void i_click_the_orange_color_checkbox() throws InterruptedException {

        filterProductColor.clickOrangeColor();
    }

    @When("I should be able to see the product colors")
    public void i_should_be_able_to_see_the_product_colors() {

    }
}

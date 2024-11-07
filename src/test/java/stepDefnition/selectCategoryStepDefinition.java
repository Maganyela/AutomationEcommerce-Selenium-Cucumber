package stepDefnition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.selectCategoryPage;
import utility.WebDriverUtility;

public class selectCategoryStepDefinition {

    private selectCategoryPage selectcategoryPage;

    public selectCategoryStepDefinition() {
        selectcategoryPage = new selectCategoryPage(WebDriverUtility.getDriver());
    }

    @When("I click on the Dresses button")
    public void i_click_on_the_dresses_button() throws InterruptedException {

        selectcategoryPage.clickDressButton();
    }

    @When("I click on Casual dress checkbox")
    public void i_click_on_casual_dress_checkbox() throws InterruptedException {

        selectcategoryPage.clickCasualCheckbox();
    }

    @When("I click on Evening dress checkbox")
    public void i_click_on_evening_dress_checkbox() throws InterruptedException {

        selectcategoryPage.clickEvenCheckbox();
    }

    @When("I click on Summer dress checkbox")
    public void i_click_on_summer_dress_checkbox() throws InterruptedException {

        selectcategoryPage.clickSummerCheckboxField();
    }

    @Then("I should be able to see the different product")
    public void i_should_be_able_to_see_the_different_product() {

        selectcategoryPage.seeCategories();
    }
}

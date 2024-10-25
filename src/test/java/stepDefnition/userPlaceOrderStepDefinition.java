package stepDefnition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import pages.userPlaceOrderSuccessfullyPage;
import utility.WebDriverUtility;

public class userPlaceOrderStepDefinition {
    
    private userPlaceOrderSuccessfullyPage orderSuccessfullyPage;

    public userPlaceOrderStepDefinition() {

        orderSuccessfullyPage = new userPlaceOrderSuccessfullyPage(WebDriverUtility.getDriver());
    }

    @When("I click the Proceed to cashOut Initially")
    public void i_click_the_proceed_to_cashOut() throws InterruptedException {

        orderSuccessfullyPage.clickProceedCashOut();
    }

    @When("I click on the Proceed to cashOut on Summary stage")
    public void i_click_on_the_proceed_to_cashOut_on_summary_stage() throws InterruptedException {

        orderSuccessfullyPage.clickProceedCashOutSummary();
    }


    @When("I click the proceed to cashOut on Address stage")
    public void i_click_proceed_to_cashOut_on_address_stage() throws InterruptedException {

        orderSuccessfullyPage.clickProceedCashOutAddress();
    }


    @When("I click the proceed to cashOut on Shipping stage")
    public void i_click_the_proceed_to_cashOut_on_shipping_stage() throws InterruptedException {

        orderSuccessfullyPage.clickCashOutBtn();
    }


    @When("I click on the Cash by check on Payment stage")
    public void i_click_on_the_cash_by_check_on_payment_stage() throws InterruptedException {

        orderSuccessfullyPage.clickCashCheckPayment();
    }

    @When("I click on the confirm my order button")
    public void i_click_on_the_confirm_my_order_button() throws InterruptedException {

        orderSuccessfullyPage.clickConfirmOrder();
    }

    @When("I click on the view order history button")
    public void i_click_on_the_view_order_history_button() throws InterruptedException {

        orderSuccessfullyPage.clickOrderHistory();
    }

    @When("I click on the back to you account button")
    public void i_click_on_the_back_to_you_account_button() throws InterruptedException {

        orderSuccessfullyPage.clickBackToAccount();
    }

    @Then("I should navigate to the home page")
    public void i_should_navigate_to_the_home_page() {

    }
}

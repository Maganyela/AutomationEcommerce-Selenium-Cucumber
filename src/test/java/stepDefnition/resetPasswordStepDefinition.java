package stepDefnition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.resetPasswordPage;
import utility.WebDriverUtility;

public class resetPasswordStepDefinition {


    private resetPasswordPage resetPasswordPage;

    public resetPasswordStepDefinition() {

        resetPasswordPage = new resetPasswordPage(WebDriverUtility.getDriver());
    }

    @When("I click the forgot password hyperlink")
    public void i_click_the_forgot_password_hyperlink() throws InterruptedException {

        resetPasswordPage.clickForgotPassword();
    }

    @When("I enter the valid email address")
    public void i_enter_the_valid_email_address() throws InterruptedException {

        resetPasswordPage.enterEmail("vitwendmpho@gmail.com");
    }

    @When("I click the Recover button")
    public void i_click_the_recovery_button() {

        resetPasswordPage.clickRecoveryPassword();
    }

    @Then("It shows message of successfully sent")
    public void it_shows_message_of_successfully_sent() {

    }
}
package stepDefnition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.RegistrationPage;
import utility.WebDriverUtility;



public class RegistrationStepDefinition {

    private RegistrationPage registrationPage;



    public RegistrationStepDefinition() {

        registrationPage = new RegistrationPage(WebDriverUtility.getDriver());
    }

    @Given("I am on the Web Application page")
        public void i_am_on_the_login_page() throws InterruptedException {

        registrationPage.navigateToRegisterPage("http://www.automationpractice.pl/index.php");

    }

    @When("I click on the Sign in text")
    public void i_click_on_the_register_text() throws InterruptedException {


        registrationPage.clickRegisterText();
    }

    @When("I enter email")
    public void i_enter_as_email() throws InterruptedException {
        registrationPage.enterEmail("vitwedd@gmail.com");
    }


    @When("I click on the create an account button")
    public void i_click_on_the_create_an_account_button() throws InterruptedException {
        registrationPage.clickCreateAccount();
    }


    @When("I select the radiobutton")
    public void i_select_the_radiobutton() throws InterruptedException {

        registrationPage.selectRadioButton("Mr");
    }

    @When("I enter firstname")
    public void i_enter_as_firstname() throws InterruptedException {
        registrationPage.enterFirstName("Vitwend");
    }

    @When("I enter lastname")
    public void i_enter_as_lastname() throws InterruptedException {
        registrationPage.enterLastName("Maganyela");
    }

    @When("I enter password")
    public void i_enter_as_password() throws InterruptedException {
        registrationPage.enterPassword("Maganyela@09");
    }
    
    @When("I select from the day dropdown")
    public void i_select_from_the_day_dropdown() throws InterruptedException {
        registrationPage.selectDayDropDown("10");
    }

    @When("I select from the month dropdown")
    public void i_select_from_the_dropdown() throws InterruptedException {
        registrationPage.selectMonthDropDown("September");
    }

    @When("I select from the year dropdown")
    public void i_select_from_the_year_dropdown() throws InterruptedException {
        registrationPage.selectYearDropDown("2001");
    }


    @When("I click on the Register button")
    public void i_click_on_the_register_button() throws InterruptedException {
        registrationPage.clickRegisterButton();
    }
    @Then("I should be registered")
    public void i_should_be_registered() {

    }
}

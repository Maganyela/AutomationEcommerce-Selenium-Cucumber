package stepDefnition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPass;
import pages.RegistrationPage;
import utility.ExcelUtility;
import utility.WebDriverUtility;

import java.io.IOException;

public class LoginPassStepDefinition {

    private RegistrationPage registrationPage;
    private LoginPass loginPass;
    private ExcelUtility excelUtility;



    public LoginPassStepDefinition() throws IOException {

        loginPass = new LoginPass(WebDriverUtility.getDriver());
        registrationPage = new RegistrationPage(WebDriverUtility.getDriver());
        excelUtility = new ExcelUtility();
    }

    @When("I enter the email")
    public void i_enter_the_email() throws IOException, InterruptedException {

        String email = excelUtility.readExcelCellValue("Username",2,1);
        loginPass.enterEmail(email);
    }

    @When("I enter the password")
    public void i_enter_the_password() throws IOException, InterruptedException {

        String password = excelUtility.readExcelCellValue("Password", 2, 2);
        loginPass.enterPassword(password);
    }

    @When("I click on the Sign In button")
    public void i_click_on_the_login_button() throws InterruptedException {
        loginPass.clickLogin();
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {

    }



}

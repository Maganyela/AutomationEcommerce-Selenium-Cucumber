package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.ElementAction;
import utility.WebDriverUtility;

public class RegistrationPage {
    WebDriverUtility ui = new WebDriverUtility();
    private ElementAction elementAction;
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        this.elementAction = new ElementAction(driver);
    }


    //Launch the url
    public void navigateToRegisterPage(String url) throws InterruptedException {

        driver.get(url);
        ui.sleep(2);
    }

    // Function to click on the Register text
    public void clickRegisterText() throws InterruptedException {

        By registerText = By.cssSelector(".login");
        elementAction.clickElement(registerText);

        ui.sleep(2);
    }

    public void enterEmail(String email) throws InterruptedException {

        By emailField = By.id("email_create");
        elementAction.enterTxt(emailField, email);
        ui.sleep(2);
    }

    public void clickCreateAccount() throws InterruptedException {

        By clickRegister = By.xpath("//span[contains(.,'Create an account')]");
        elementAction.clickElement(clickRegister);
        ui.sleep(2);
    }


    // Function to select the Male RadioButton
    public void selectRadioButton(String radioButton) throws InterruptedException {

        if(radioButton.equalsIgnoreCase("Mr")) {
            By maleRadioButton = By.xpath("//div[@class='account_creation']/div[@class='clearfix']//input[@value='1']");
            elementAction.clickElement(maleRadioButton);
            ui.sleep(2);
        }
        else if (radioButton.equalsIgnoreCase("Mrs"))
        {
            By femaleRadioButton = By.xpath("//input[@value='2']");
            elementAction.clickElement(femaleRadioButton);

            ui.sleep(2);
        }
    }

    // Function to enter the firstname
    public void enterFirstName(String firstName) throws InterruptedException {

        By firstNameField = By.id("customer_firstname");
        elementAction.enterTxt(firstNameField, firstName);
        ui.sleep(2);
    }

    // Function to enter the lastname
    public void enterLastName(String lastName) throws InterruptedException {

        By lastNameField = By.id("customer_lastname");
        elementAction.enterTxt(lastNameField, lastName);
        ui.sleep(2);
    }

    public void enterPassword(String password) throws InterruptedException {
        By passwordField = By.id("passwd");
        elementAction.enterTxt(passwordField, password);
        ui.sleep(3);
    }


    public void selectDayDropDown(String day) throws InterruptedException {

        // Open the dropdown
        By dayDropDown = By.id("days");
        WebElement dropdownElement = driver.findElement(dayDropDown);
        dropdownElement.click();

        // Locate the option and click it
        By optionLocator = By.xpath("//select[@id='days']/option[contains(.,'10')]");
        WebElement optionElement = driver.findElement(optionLocator);
        optionElement.click();
        ui.sleep(2);
    }

    public void selectMonthDropDown(String month) throws InterruptedException {

        // Open the dropdown
        By monthDropDown = By.id("months");
        WebElement dropdownElement = driver.findElement(monthDropDown);
        dropdownElement.click();

        // Locate the option and click it
        By optionLocator = By.xpath("//option[contains(.,'September')]");
        WebElement optionElement = driver.findElement(optionLocator);
        optionElement.click();
        ui.sleep(2);
    }

    public void selectYearDropDown(String year) throws InterruptedException {

        // Open the dropdown
        By yearDropDown = By.id("years");
        WebElement dropdownElement = driver.findElement(yearDropDown);
        dropdownElement.click();

        // Locate the option and click it
        By optionLocator = By.xpath("//option[contains(.,'2001')]");
        WebElement optionElement = driver.findElement(optionLocator);
        optionElement.click();
        ui.sleep(2);
    }


    public void clickRegisterButton() throws InterruptedException {

        By clickRegister = By.xpath("//span[.='Register']");
        elementAction.clickElement(clickRegister);
        ui.sleep(2);
    }

    public void confirmUserRegistration() {

        WebElement txtElement = driver.findElement(By.cssSelector(".page-subheading"));
        assert(txtElement.getText().equals("Your personal information"));
    }

}

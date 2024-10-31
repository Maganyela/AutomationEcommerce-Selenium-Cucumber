package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class Hooks {

    private String appUrl;

    @BeforeClass
    @Parameters({"app.url"})
    public void setUp(String appUrl, String browser) {
        this.appUrl = appUrl;
        // Initialize WebDriver here if needed
        WebDriverUtility.getDriver(); // Example method to initialize WebDriver
    }

    public String getAppUrl() {
        return appUrl;
    }
//
//    @AfterClass
//    public void tearDown() {
//        WebDriverUtility.quitDriver();
//    }
}

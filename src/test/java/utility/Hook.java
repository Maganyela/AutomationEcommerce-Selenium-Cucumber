package utility;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.Logger;

public class Hook {

    private WebDriver driver;
    private static ThreadLocal<Scenario> currentScenario = new ThreadLocal<>();
    private ScreenshotUtility screenshotUtility;
    private static final Logger logger = Logger.getLogger(Hook.class.getName());

    @Before
    public void setUp(Scenario scenario) {
        currentScenario.set(scenario); // Store the current scenario
        screenshotUtility = new ScreenshotUtility();

        driver = WebDriverUtility.getDriver();
        driver.manage().window().maximize(); // Ensure the browser window is maximized
        logger.info("WebDriver initialized and browser window maximized.");
    }

    @AfterStep
    public void takeScreenshot() {
        Scenario scenario = currentScenario.get();
        if (scenario != null) {


            // Capture the entire page screenshot
            byte[] screenshot = screenshotUtility.attachScreenshot(driver);

            scenario.attach(screenshot, "image/png", "Screenshot");
            logger.info("Screenshot attached to Allure report.");
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null; // Clear the reference
        }
    }
}
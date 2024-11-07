package utility;

import io.cucumber.java.After;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;

public class WebDriverUtility {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            String browser = System.getProperty("chrome", "edge");
            try {
                if (browser.equalsIgnoreCase("chrome")) {
                    WebDriver driverInstance = new ChromeDriver();
                    driverInstance.manage().window().maximize();
                    driver.set(driverInstance);
                } else if (browser.equalsIgnoreCase("edge")) {
                    WebDriver driverInstances = new EdgeDriver();
                    driverInstances.manage().window().maximize();
                    driver.set(driverInstances);
                }
            } catch (Exception e) {
                System.out.println("Error initializing WebDriver: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return driver.get();
    }

    @After
    public void tearDown() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove(); // Clean up the ThreadLocal
        }
    }

    public void sleep(int seconds)  {

        try {
            Thread.sleep(seconds * 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

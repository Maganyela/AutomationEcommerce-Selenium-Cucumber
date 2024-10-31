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

//    private static WebDriver driver;
    private static WebDriverWait wait;


    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    public static WebDriver getDriver() {
        if (driver.get() == null) {
            String browser = System.getProperty("browser", "chrome");
            try {
                if (browser.equalsIgnoreCase("chrome")) {
                    driver.set(new ChromeDriver());


                } else if (browser.equalsIgnoreCase("edge")) {
                    driver.set(new EdgeDriver());
                } else
                {
                    throw new IllegalArgumentException("Browser not supported: " + browser);
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
        WebDriver localDriver = driver.get();
        if (localDriver != null) {
            localDriver.quit();
        }
        driver.remove();
    }

    public static void removeDriver() {
        driver.remove();
    }
    public void sleep(int seconds) throws InterruptedException {

        try {
            Thread.sleep(seconds * 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void waitForManualIntervention() {
        System.out.println("Please solve the reCAPTCHA manually and press Enter to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public void waitForElementToBeVisible(WebElement element) {
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
//
//    public void waitForElementToBeClickable(WebElement element) {
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//    }
}

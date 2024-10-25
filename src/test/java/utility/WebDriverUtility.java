package utility;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class WebDriverUtility {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public static WebDriver getDriver() {
        if (driver == null) {
            try {
                driver = new ChromeDriver();
            } catch (Exception e) {
                System.out.println("Error initializing WebDriver: " + e.getMessage());
                e.printStackTrace();
            }

        }
        return driver;
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

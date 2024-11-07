package utility;


import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {

    public static String captureScreenshot(WebDriver driver, String screenshotName) {
        String directoryPath = "src/main/resources/screenshots/";
        try {
            Files.createDirectories(Paths.get(directoryPath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String destination = directoryPath + screenshotName + "_" + timestamp + ".png";
        File finalDestination = new File(destination);

        try {
            // Copy the screenshot to the destination
            FileHandler.copy(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
// Return the path of the saved screenshot
        return destination;
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] attachScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}


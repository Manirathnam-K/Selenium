package Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Screen_Shot {
	public static void captureScreenshot(WebDriver driver, String screenshotName) {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = "./test/reports/screenshots/" + screenshotName + "_" + timeStamp + ".png";
try {
            Path path = Paths.get("./test/reports/screenshots/");
            Files.createDirectories(path);
            Files.move(source.toPath(), Paths.get(dest));
            Reporter.log("<br><img src='" + dest + "' height='400' width='700'/><br>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


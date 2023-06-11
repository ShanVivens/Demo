package src.main.java.Generic_Libraries;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class screenShot {
    public void getScreenShot(WebDriver driver,  String name) throws IOException {
        Date d = new Date();
        String currentDate = d.toString().replaceAll(":","_");
        TakesScreenshot screen = (TakesScreenshot) driver;
        File source = screen.getScreenshotAs(OutputType.FILE);
        File destination = new File(Autoconstant.photoPath+currentDate+name+".png");
        FileUtils.copyFile(source,destination);
    }
}

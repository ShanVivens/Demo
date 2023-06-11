package src.main.java.Generic_Libraries;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class baseClass {
    public WebDriver driver;
    public propertyFile p = new propertyFile();
    @BeforeMethod
    public void openApp() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(p.getPropertyFileData("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void closeApp(ITestResult result) throws IOException {
        int status = result.getStatus();
        String name = result.getName();
        if(status==2){
            screenShot s = new screenShot();
            s.getScreenShot(driver,name);
        }
        driver.quit();
    }

}

package src.main.java.Generic_Libraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class webDriverUtilities {
    public void mouseHover(WebDriver driver, WebElement element){
        Actions a = new Actions(driver);
        a.moveToElement(element).perform();
    }
    public void dragAndDrop(WebDriver driver, WebElement source, WebElement target){
        Actions a = new Actions(driver);
        a.dragAndDrop(source, target).perform();
    }
    public void doubleClick(WebDriver driver, WebElement element){
        Actions a = new Actions(driver);
        a.doubleClick(element).perform();
    }
    public void dropDown(WebElement element, String text){
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }
    public void switchFrame(WebDriver driver){
        driver.switchTo().frame(0);
    }
    public void switchBackFrame(WebDriver driver){
        driver.switchTo().defaultContent();
    }
    public void alertPopup(WebDriver driver){
        driver.switchTo().alert().accept();
    }
    public void switchTabs(WebDriver driver){
        Set<String> child = driver.getWindowHandles();
        for (String b: child) {
            driver.switchTo().window(b);
        }
    }
    public void scrollBar(WebDriver driver, int x , int y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("windows.scrollBy("+x+","+y+")");
    }
}

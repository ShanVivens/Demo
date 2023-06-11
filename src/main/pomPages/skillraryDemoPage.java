package src.main.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryDemoPage {
    public WebElement getCoursetab() {
        return coursetab;
    }
    public void setCoursetab(WebElement coursetab) {
        this.coursetab = coursetab;
    }
    @FindBy(xpath = "//a[@id='course']")
    private WebElement coursetab;
    @FindBy(xpath = "(//a[text()='Selenium Training'])[1]")
    private WebElement seleniumtraining;
    public skillraryDemoPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void seleniumtrainingTab(){
        seleniumtraining.click();
    }
}

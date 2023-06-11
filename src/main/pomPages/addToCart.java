package src.main.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCart {
    @FindBy(xpath = "//button[@id='add']")
    private WebElement addbtn;

    public WebElement getAddbtn() {
        return addbtn;
    }

    public void setAddbtn(WebElement addbtn) {
        this.addbtn = addbtn;
    }
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement addtocart;

    public addToCart(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void addtocartbtn(){
        addtocart.click();
    }

}

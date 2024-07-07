package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JackJonesPage {
    public JackJonesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@type='search']")
    public WebElement aramakutusu;
    @FindBy(xpath = "//span[@class='label' and text()='Allow All']")
    public WebElement cookie;


}

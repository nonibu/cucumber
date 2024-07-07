package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WingsTopPage {
    public WingsTopPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
@FindBy (xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    public WebElement CookieAccept;
    @FindBy (xpath = "//*[@id=\"nav\"]/div[1]/a[1]")
    public WebElement Homepage;

    @FindBy(xpath = "//*[@id=\"nav\"]/div[1]/a[2]")
    public WebElement Menu;

    @FindBy(xpath = "//*[@id=\"nav\"]/div[1]/a[3]")
    public WebElement Flavors;

    @FindBy(xpath = "//*[@id=\"nav\"]/div[1]/a[4]")
    public WebElement WingsCalculator;

    @FindBy(xpath = "//*[@id=\"nav\"]/div[1]/a[5]")
    public WebElement Location;

    @FindBy(xpath ="//*[@id=\"nav\"]/div[2]/wri-cart-location/div/div/button[1]")
    public WebElement Carryout;

    @FindBy(xpath ="//*[@id=\"nav\"]/div[2]/wri-cart-location/div/div/button[2]")
    public WebElement Delivery;

    @FindBy(xpath = "//span[@ngxsliderelement]")
    public WebElement HowHungry;

    @FindBy(xpath = "//span[@aria-valuetext='1']")
    public WebElement HowHungryValue;






}

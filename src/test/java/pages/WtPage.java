package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WtPage {
    public WtPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[contains(@class, 'onetrust-close-btn-handler') and contains(@class, 'onetrust-close-btn-ui') and contains(@class, 'banner-close-button') and contains(@class, 'ot-close-icon')]")
    public WebElement CookieAccept;
    @FindBy (xpath = "//*[@id=\"nav\"]/div[1]/a[1]")
    public WebElement Homepage;

    @FindBy(xpath = "//*[@id=\"nav\"]/div[1]/a[2]")
    public WebElement Menu;
    @FindBy(xpath = "//*[@id=\"wri-nav-container\"]/div/div[1]")
    public WebElement Special;
    @FindBy(xpath = "(//div[contains(@class, 'wri-product-img')])[1]")
    public WebElement IlkUrun;
    @FindBy (xpath = "//*[@id=\"main-content\"]/wri-choose-location/div/wri-handoff-mode-selector/button[2]")
    public WebElement deliver;
    @FindBy(xpath = "//*[@id=\"location-search-input\"]")
    public WebElement location;






}

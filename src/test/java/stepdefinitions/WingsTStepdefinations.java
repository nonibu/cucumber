package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.WtPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Set;

public class WingsTStepdefinations {
    WtPage wtPage=new WtPage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("cookies kabul ederler")
    public void cookies_kabul_ederler() {
        wtPage.CookieAccept.click();

    }
    @Then("HomePage click")
    public void home_page_click() {
        wtPage.Homepage.click();



    }
    @Then("Homepage Right click")
    public void homepage_right_click() {
        String expectedUrl= ConfigReader.getProperty("WT");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedUrl,actualUrl);


    }
    @Then("Menu click")
    public void menu_click() {
       wtPage.Menu.click();
    }
    @Then("Menu Right click")
    public void menu_right_click() {
        String expectectedurl=ConfigReader.getProperty("WTM");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectectedurl,actualUrl);
    }


    @Then("click Special")
    public void clickSpecial() {
        wtPage.Special.click();
    }

    @And("ilk urunun  sayfasina gider")
    public void ilkUrununSayfasinaGider() {
        wtPage.IlkUrun.click();
    }

    @Then("Location adresi yaz ve Enter bas")
    public void locationAdresiYazVeEnterBas() {
        wtPage.deliver.click();
        wtPage.location.sendKeys("34215 Rogallo Line");
        Actions actions1=new Actions(Driver.getDriver());
        WebElement locate=Driver.getDriver().findElement(By.xpath("//*[@id=\"ngb-typeahead-0-0\"]/div"));
        actions1.moveToElement(locate).click().perform();

        ////*[@id="ngb-typeahead-0-0"]/div
    }
}

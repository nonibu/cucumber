package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.JackJonesPage;

public class JackJonesRedefinitions {
    JackJonesPage jackJonesPage=new JackJonesPage();
    @Then("{string} cookies kabul eder")
    public void cookies_kabul_eder(String cookieAccept) {
        jackJonesPage.cookie.click();
    }
}

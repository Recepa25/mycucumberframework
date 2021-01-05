package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WalmartPage;
import utilities.ConfigReader;
import utilities.Driver;

public class WalmartStepDefinitions {
    WalmartPage walmartPage = new WalmartPage();

    @When("kullanici walmart anasayfaya gider")
    public void kullanici_walmart_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("walmart_url"));
    }

    @Then("walmart sayfasinda {string} icin arama yapar")
    public void walmart_sayfasinda_icin_arama_yapar(String string) {
        walmartPage.walmartAramaKutusu.sendKeys(string + Keys.ENTER);

    }

    @Then("walmart sayfa basliginin {string} icerdigini test eder")
    public void walmart_sayfa_basliginin_icerdigini_test_eder(String kelime) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(kelime));
    }


}




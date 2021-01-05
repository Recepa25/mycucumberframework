package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WalmartPage {


    public WalmartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@class='e1xoeh2i1 css-kb1qza eesbt950']")
    public WebElement walmartAramaKutusu;



}
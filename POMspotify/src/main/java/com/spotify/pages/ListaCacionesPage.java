package com.spotify.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ListaCacionesPage extends PageObject {
    private final By anclaCanciones = By.xpath(
            "//a[@class=\"btE2c3IKaOXZ4VNAb8WQ\"] ");
    @FindBy(xpath = "//button[(@data-encore-id=\"buttonPrimary\") and (@data-testid=\"play-button\") and (@class=\"Button-sc-qlcn5g-0 bGlWbV\")]/span[@class=\"ButtonInner-sc-14ud5tc-0 bXrXni encore-bright-accent-set\"]")
    WebElement btnReproduccion;
    @FindBy(xpath = "//div[(@data-testid=\"context-item-info-title\")and(@class=\"encore-text encore-text-body-small PcH6VnzkkDqD36P93i9Q\")]/span/a[@data-testid=\"context-item-link\"]")
    WebElement h1TituloCancion;
    @FindBy(xpath = "//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")
    WebElement btnCookies;


    public By getAnclaCanciones() {
        return anclaCanciones;
    }

    public WebElement getBtnReproduccion() {
        return btnReproduccion;
    }

    public WebElement getH1TituloCancion() {
        return h1TituloCancion;
    }

    public WebElement getBtnCookies() {
        return btnCookies;
    }
}
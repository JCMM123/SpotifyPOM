package com.spotify.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeSpotyfypage extends PageObject {
    @FindBy(xpath = "//a[@href=\"/search\"]")
    WebElement btnSeach;
    @FindBy(xpath = "//input[@data-testid=\"search-input\"]")
    WebElement inputSeach;
    @FindBy(xpath = "//button[@class=\"Button-sc-1dqy6lx-0 kTFJuL encore-text-body-medium-bold encore-over-media-set SFgYidQmrqrFEVh65Zrg\"]")
    WebElement btnPerfil;

    public WebElement getBtnSeach() {
        return btnSeach;
    }

    public WebElement getInputSeach() {
        return inputSeach;
    }

    public WebElement getBtnPerfil() {
        return btnPerfil;
    }

}

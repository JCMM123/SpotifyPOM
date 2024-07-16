package com.spotify.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeSpotyfypage extends PageObject {

    @FindBy(xpath = "//span[contains(text(),\"Log in\")]")
    WebElement btnLogin;
    @FindBy(xpath = "//input[@id=\"login-username\"]")
    WebElement inputUserLogin;
    @FindBy(xpath = "//input[@id=\"login-password\"]")
    WebElement inputPasswordLogin;
    @FindBy(xpath = "//button[@id=\"login-button\"]")
    WebElement btnLogeo;
    @FindBy(xpath = "//a[@href=\"/search\"]")
    WebElement btnSeach;
    @FindBy(xpath = "//input[@data-testid=\"search-input\"]")
    WebElement inputSeach;
    @FindBy(xpath = "//button[@class=\"Button-sc-1dqy6lx-0 kTFJuL encore-text-body-medium-bold encore-over-media-set SFgYidQmrqrFEVh65Zrg\"]")
    WebElement btnPerfil;

    public WebElement getInputUserLogin() {
        return inputUserLogin;
    }

    public WebElement getInputPasswordLogin() {
        return inputPasswordLogin;
    }

    public WebElement getBtnLogeo() {
        return btnLogeo;
    }

    public WebElement getBtnSeach() {
        return btnSeach;
    }

    public WebElement getInputSeach() {
        return inputSeach;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }

    public WebElement getBtnPerfil() {
        return btnPerfil;
    }

}

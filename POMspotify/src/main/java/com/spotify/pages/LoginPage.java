package com.spotify.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(xpath = "//span[contains(text(),\"Log in\")]")
    WebElement btnLogin;
    @FindBy(xpath = "//input[@id=\"login-username\"]")
    WebElement inputUserLogin;
    @FindBy(xpath = "//input[@id=\"login-password\"]")
    WebElement inputPasswordLogin;
    @FindBy(xpath = "//button[@id=\"login-button\"]")
    WebElement btnLogeo;

    public WebElement getBtnLogin() {
        return btnLogin;
    }

    public WebElement getInputUserLogin() {
        return inputUserLogin;
    }

    public WebElement getInputPasswordLogin() {
        return inputPasswordLogin;
    }

    public WebElement getBtnLogeo() {
        return btnLogeo;
    }

}

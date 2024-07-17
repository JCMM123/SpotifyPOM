package com.spotify.steps;

import com.spotify.pages.LoginPage;
import com.spotify.utils.CallData;
import com.spotify.pages.HomeSpotyfypage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStep {
    @Page
    LoginPage loginPage;

    @Page
    HomeSpotyfypage homeSpotyfypage;

    @Step("El usuario se identifica")
    public void login(){
        loginPage.getBtnLogin().click();
        loginPage.getInputUserLogin().sendKeys(CallData.extractTo().get(0).get("Usuario"), Keys.ENTER);
        loginPage.getInputPasswordLogin().sendKeys(CallData.extractTo().get(0).get("Password"), Keys.ENTER);
        loginPage.getBtnLogeo().click();
    }
    @Step("EL usuario se identifica")
    public void verificacionUsuario(){
        homeSpotyfypage.getBtnPerfil().click();
        assertTrue(homeSpotyfypage.getBtnPerfil().isDisplayed(),"Elemento no encontrado tal vez demoro la carga de la pagina web");
        assertNotNull(homeSpotyfypage.getBtnPerfil());
    }

}

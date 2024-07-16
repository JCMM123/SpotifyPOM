package com.spotify.steps;

import com.spotify.pages.HomeSpotyfypage;
import com.spotify.utils.CallData;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeSpotifyStep {
    @Page
    HomeSpotyfypage homeSpotyfypage;
    ArrayList<Map<String, String>> datos = CallData.extractTo();

    @Step("Abrir el navegador")
    public void openBrowser(){
        homeSpotyfypage.openUrl("https://open.spotify.com/intl-es");
    }

    @Step("El usuario se identifica")
    public void login(){
        homeSpotyfypage.getBtnLogin().click();
        homeSpotyfypage.getInputUserLogin().sendKeys(datos.get(0).get("Usuario"), Keys.ENTER);
        homeSpotyfypage.getInputPasswordLogin().sendKeys(datos.get(0).get("Password"), Keys.ENTER);
        homeSpotyfypage.getBtnLogeo().click();
        homeSpotyfypage.getBtnPerfil();
    }
    @Step("EL usuario se identifica")
    public void verificacionUsuario(){
        homeSpotyfypage.getBtnPerfil().click();
        assertTrue(homeSpotyfypage.getBtnPerfil().isDisplayed(),"Elemento no encontrado tal vez demoro la carga de la pagina web");
        assertNotNull(homeSpotyfypage.getBtnPerfil());
    }

    @Step("El usuario busca su cancion")
    public void buscarCacion(){
        homeSpotyfypage.getBtnSeach().click();
        homeSpotyfypage.getInputSeach().sendKeys(datos.get(0).get("ListaDeCancionesBuscar"), Keys.ENTER);
    }

}

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


    @Step("El usuario busca su cancion")
    public void buscarCacion(){
        homeSpotyfypage.getBtnSeach().click();
        homeSpotyfypage.getInputSeach().sendKeys(datos.get(0).get("ListaDeCancionesBuscar"), Keys.ENTER);
    }

}

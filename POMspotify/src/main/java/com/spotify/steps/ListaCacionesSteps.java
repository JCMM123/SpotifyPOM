package com.spotify.steps;

import com.spotify.utils.CallData;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import com.spotify.pages.ListaCacionesPage;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.spotify.utils.SelectionCanciones.selectorCanciones;


public class ListaCacionesSteps {

    @Page
    ListaCacionesPage listaCacionesPage;

    @Step("El usuario selecciona la cancion")
    public void seleccionarCancion(){
        selectorCanciones(
                listaCacionesPage.getDriver().findElements(listaCacionesPage.getAnclaCanciones()),
                CallData.extractTo().get(0).get("ListaDeCancionesBuscar")
        ).click();

        listaCacionesPage.getBtnReproduccion().click();
    }

    @Step("Verificamos el titulo de la cancion")
    public void validacion(){
        assertTrue(
                listaCacionesPage.getH1TituloCancion().getText().toLowerCase()
                        .contains(CallData.extractTo().get(0).get("ListaDeCancionesBuscar").toLowerCase())
                ,"No es la cancion esperada."
        );
    }
}

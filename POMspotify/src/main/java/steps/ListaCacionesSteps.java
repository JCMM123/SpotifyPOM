package steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import pages.ListaCacionesPage;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.SelectionCanciones.selectorCanciones;
import static utils.CallData.extractTo;


public class ListaCacionesSteps {

    @Page
    ListaCacionesPage listaCacionesPage;

    @Step("El usuario selecciona la cancion")
    public void SeleccionarCacion(){
        selectorCanciones(
                listaCacionesPage.getDriver().findElements(listaCacionesPage.getAnclaCanciones()),
                extractTo().get(0).get("ListaDeCancionesBuscar")
        ).click();

        listaCacionesPage.getBtnReproduccion().click();
    }

    @Step("Verificamos el titulo de la cancion")
    public void validacion(){
        assertTrue(
                listaCacionesPage.getH1TituloCancion().getText().toLowerCase()
                        .contains(extractTo().get(0).get("ListaDeCancionesBuscar").toLowerCase())
                ,"No es la cancion esperada."
        );
    }
}

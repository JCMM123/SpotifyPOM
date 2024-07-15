package steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import org.openqa.selenium.Keys;
import pages.HomeSpotyfypage;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static utils.CallData.extractTo;

public class HomeSpotifyStep {
    @Page
    HomeSpotyfypage homeSpotyfypage;
    ArrayList<Map<String, String>> datos = extractTo();

    @Step("Abrir el navegador")
    public void userOpenBrowser(){
        homeSpotyfypage.openUrl("https://open.spotify.com/intl-es");
    }

    @Step("El usuario se identifica")
    public void Login(){
        homeSpotyfypage.getBtnLogin().click();
        homeSpotyfypage.getInputUserLogin().sendKeys(datos.get(0).get("Usuario"), Keys.ENTER);
        homeSpotyfypage.getInputPasswordLogin().sendKeys(datos.get(0).get("Password"), Keys.ENTER);
        homeSpotyfypage.getBtnLogeo().click();
        homeSpotyfypage.getBtnPerfil();
    }
    @Step("EL usuario se identifica")
    public void VerificacionUsuario(){
        assertNotNull(homeSpotyfypage.getBtnPerfil());
    }

    @Step("El usuario busca su cancion")
    public void BuscarCacion(){
        homeSpotyfypage.getBtnSeach().click();
        homeSpotyfypage.getInputSeach().sendKeys(datos.get(0).get("ListaDeCancionesBuscar"), Keys.ENTER);
    }

}

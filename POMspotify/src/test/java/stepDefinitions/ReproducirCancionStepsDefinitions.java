package stepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import steps.HomeSpotifyStep;
import steps.ListaCacionesSteps;

public class ReproducirCancionStepsDefinitions {
    @Managed
    WebDriver driver;
    @BeforeAll
    public void setUpClass(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
    }
    @BeforeEach
    public void setUpTest(){
        driver= new ChromeDriver();
    }
    @AfterAll
    public void driverQuit(){
        driver.quit();
    }

    @Steps
    HomeSpotifyStep homeSpotifyStep;
    @Steps
    ListaCacionesSteps listaCacionesSteps;

    @Given("el usuario esta logeado en el sitio web de spotify")
    public void elUsuarioEstaLogeadoEnElSitioWebDeSpotify() {
        homeSpotifyStep.userOpenBrowser();
        homeSpotifyStep.Login();
        homeSpotifyStep.VerificacionUsuario();
    }

    @When("busca en la barra de busqueda su cancion y la selecciona")
    public void buscaEnLaBarraDeBusquedaSuCancionYLaSelecciona() {
        homeSpotifyStep.BuscarCacion();
        listaCacionesSteps.SeleccionarCacion();
    }

    @Then("el usuario escuchara su musica correctamente")
    public void elUsuarioEscucharaSuMusicaCorrectamente() {
        listaCacionesSteps.validacion();
    }

}

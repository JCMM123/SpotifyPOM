package com.spotify.stepDefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import com.spotify.steps.HomeSpotifyStep;

public class LogeoSpotifyStepsDefinitions {

    @Steps
    HomeSpotifyStep homeSpotifyStep;

    @Given("que el usuario esta en la pagina principal de de spotify")
    public void queElUsuarioEstaEnLaPaginaPrincipalDeDeSpotify() {
        homeSpotifyStep.openBrowser();
    }
    @When("el usuario ingresa sus credenciales")
    public void elUsuarioIngresaSusCredenciales() {
        homeSpotifyStep.login();
    }

    @Then("el usuario ve su perfil en la parte superior de la pagina principal")
    public void elUsuarioVeSuPerfilEnLaParteSuperiorDeLaPaginaPrincipal() {
        homeSpotifyStep.verificacionUsuario();
    }
}

package com.spotify.stepDefinitions;

import com.spotify.steps.HomeSpotifyStep;
import com.spotify.steps.LoginStep;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class LogeoSpotifyStepsDefinitions {

    @Steps
    HomeSpotifyStep homeSpotifyStep;

    @Steps
    LoginStep loginStep;

    @Given("que el usuario esta en la pagina principal de de spotify")
    public void queElUsuarioEstaEnLaPaginaPrincipalDeDeSpotify() {
        homeSpotifyStep.openBrowser();
    }

    @When("el usuario ingresa sus credenciales")
    public void elUsuarioIngresaSusCredenciales() {
        loginStep.login();
    }

    @Then("el usuario ve su perfil en la parte superior de la pagina principal")
    public void elUsuarioVeSuPerfilEnLaParteSuperiorDeLaPaginaPrincipal() {
        loginStep.verificacionUsuario();
    }
}

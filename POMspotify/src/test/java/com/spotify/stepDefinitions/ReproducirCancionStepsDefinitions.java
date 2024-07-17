package com.spotify.stepDefinitions;

import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.*;
import com.spotify.steps.HomeSpotifyStep;
import com.spotify.steps.ListaCacionesSteps;

public class ReproducirCancionStepsDefinitions {

    @Steps
    HomeSpotifyStep homeSpotifyStep;
    @Steps
    ListaCacionesSteps listaCacionesSteps;

    @When("busca en la barra de busqueda su cancion y la selecciona")
    public void buscaEnLaBarraDeBusquedaSuCancionYLaSelecciona() {
        homeSpotifyStep.buscarCacion();
        listaCacionesSteps.seleccionarCancion();
    }

    @Then("el usuario escuchara su musica correctamente")
    public void elUsuarioEscucharaSuMusicaCorrectamente() {
        listaCacionesSteps.validacion();
    }

}

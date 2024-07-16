package com.spotify.runners;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@BusquedaCancion",
        glue = "com/spotify/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ReproducirCancionRunner {
}

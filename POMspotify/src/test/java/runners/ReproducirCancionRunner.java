package runners;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reproducirCancion.feature",
        glue = "stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ReproducirCancionRunner {
}

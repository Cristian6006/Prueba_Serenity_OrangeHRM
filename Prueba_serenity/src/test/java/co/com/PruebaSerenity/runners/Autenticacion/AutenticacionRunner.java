package co.com.PruebaSerenity.runners.Autenticacion;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "co.com.Automatizacion.AxxionSystem",
        tags = "@Autenticacion",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AutenticacionRunner {
}

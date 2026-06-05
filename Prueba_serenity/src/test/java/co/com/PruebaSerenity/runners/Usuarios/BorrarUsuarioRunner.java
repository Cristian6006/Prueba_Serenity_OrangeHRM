package co.com.PruebaSerenity.runners.Usuarios;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.com.PruebaSerenity",
        tags = "@BorrarUsuario",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class BorrarUsuarioRunner {
}

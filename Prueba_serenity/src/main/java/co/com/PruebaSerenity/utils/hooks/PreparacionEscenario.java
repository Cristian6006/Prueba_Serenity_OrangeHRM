package co.com.PruebaSerenity.utils.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class PreparacionEscenario {
    @Before
    public void PreparacionEscenario() {
        OnStage
                .setTheStage(new OnlineCast());
        theActorCalled("administrador");
    }
}

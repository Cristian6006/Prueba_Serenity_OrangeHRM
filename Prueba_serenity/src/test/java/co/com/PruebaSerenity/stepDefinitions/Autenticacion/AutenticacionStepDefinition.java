package co.com.PruebaSerenity.stepDefinitions.Autenticacion;

import co.com.PruebaSerenity.models.Credenciales;
import co.com.PruebaSerenity.questions.Autenticacion.TituloDashboard;
import co.com.PruebaSerenity.task.Autenticacion.IniciarSesion;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AutenticacionStepDefinition {
    @Dado("Que el administrador se encuentra la pagina de Autenticacion de OrangeHRM")
    public void queElAdministradorSeEncuentraLaPaginaDeAutenticacionDeOrangeHRM() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
    }
    @Cuando("inicie sesion con las credenciales correctas")
    public void inicieSesionConLasCredencialesCorrectas(List<Credenciales> credenciales) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conCredenciales(credenciales)
        );
    }
    @Entonces("deberia ser redirigido al dashboard principal")
    public void deberiaSerRedirigidoAlDashboardPrincipal() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TituloDashboard.tituloDashboard())
        );
    }
}

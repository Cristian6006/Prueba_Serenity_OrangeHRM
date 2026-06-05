package co.com.PruebaSerenity.stepDefinitions.Usuarios;

import co.com.PruebaSerenity.questions.Usuarios.MensajeExito;
import co.com.PruebaSerenity.task.Usuarios.NavegarA;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class UsuariosStepDefinition {
    @Dado("se encuentre en la pagina de Gestion de Informacion Personal")
    public void seEncuentreEnLaPaginaDeGestionDeInformacionPersonal() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavegarA.laPaginaUsuarios()
        );
    }
    @Dado("que existe un empleado registrado")
    public void queExisteUnEmpleadoRegistrado() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("deberia ver un mesaje de exito")
    public void deberiaVerUnMesajeDeExito() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(MensajeExito.mensajeExito()));
    }
}

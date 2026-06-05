package co.com.PruebaSerenity.stepDefinitions.Usuarios;

import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.questions.Usuarios.MensajeExito;
import co.com.PruebaSerenity.task.Usuarios.AgregarUsuario;
import co.com.PruebaSerenity.task.Usuarios.EsperarUsuarioVisible;
import co.com.PruebaSerenity.task.Usuarios.NavegarA;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class UsuariosStepDefinition {
    @Dado("se encuentre en la pagina de Gestion de Informacion Personal")
    public void seEncuentreEnLaPaginaDeGestionDeInformacionPersonal() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavegarA.laPaginaUsuarios()
        );
    }
    @Dado("que existe un usuario")
    public void queExisteUnUsuario() {
        Usuario currentUser = UsuarioHelper.crearUsuario();
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(
                AgregarUsuario.with(currentUser),
                EsperarUsuarioVisible.conDatosDe(currentUser)
        );
    }
    @Entonces("deberia ver un mesaje de exito")
    public void deberiaVerUnMesajeDeExito() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(MensajeExito.mensajeExito()));
    }
}

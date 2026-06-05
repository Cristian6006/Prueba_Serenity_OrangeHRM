package co.com.PruebaSerenity.stepDefinitions.Usuarios;

import co.com.PruebaSerenity.factories.UsuarioFactory;
import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.task.Usuarios.AgregarUsuario;
import co.com.PruebaSerenity.task.Usuarios.BorrarUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public class BorrarUsuarioStepDefinition {
    private Usuario updatedUser;

    @Cuando("el administrador elimina a el usuario")
    public void elAdministradorEliminaAElUsuario() {
        updatedUser = UsuarioFactory.randomUser();
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(BorrarUsuario.with(updatedUser));
    }
    @Entonces("que el usuario no exista en la lista")
    public void queElUsuarioNoExistaEnLaLista() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

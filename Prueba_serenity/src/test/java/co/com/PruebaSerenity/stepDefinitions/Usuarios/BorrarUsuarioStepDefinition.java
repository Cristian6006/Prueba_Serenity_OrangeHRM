package co.com.PruebaSerenity.stepDefinitions.Usuarios;

import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.questions.Usuarios.UsuarioExiste;
import co.com.PruebaSerenity.task.Usuarios.BorrarUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import static org.hamcrest.Matchers.is;

public class BorrarUsuarioStepDefinition {

    @Cuando("elimina a el usuario del sistema")
    public void elAdministradorEliminaAElUsuario() {
        Actor actor = OnStage.theActorInTheSpotlight();
        Usuario currentUser = actor.recall("USUARIO");
        actor.attemptsTo(BorrarUsuario.with(currentUser));
    }
    @Entonces("que el usuario no exista en la lista")
    public void queElUsuarioNoExistaEnLaLista() {
        Actor actor = OnStage.theActorInTheSpotlight();
        Usuario currentUser = actor.recall("USUARIO");
        actor.should(GivenWhenThen.seeThat(
                "La ausencia en la lista del usuario" + currentUser,
                UsuarioExiste.enLaLista(currentUser),
                is(false)
                )
        );
    }
}

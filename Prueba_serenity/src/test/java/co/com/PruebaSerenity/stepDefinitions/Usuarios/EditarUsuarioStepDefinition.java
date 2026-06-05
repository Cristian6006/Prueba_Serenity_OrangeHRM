package co.com.PruebaSerenity.stepDefinitions.Usuarios;

import co.com.PruebaSerenity.factories.UsuarioFactory;
import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.questions.Usuarios.UsuarioExiste;
import co.com.PruebaSerenity.task.Usuarios.EditarUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class EditarUsuarioStepDefinition {
    private Usuario updatedUser;

    @Cuando("el administrador actualiza la informacion del usuario")
    public void elAdministradorActualizaLaInformacionDelUsuario() {
        Actor actor = OnStage.theActorInTheSpotlight();
        Usuario currentUser = actor.recall("USUARIO");
        updatedUser = UsuarioFactory.updatedUser(currentUser);
        actor.attemptsTo(EditarUsuario.with(updatedUser));
    }
    @Entonces("los datos actualizados deberian verse reflejados")
    public void losDatosActualizadosDeberianVerseReflejados() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.should(seeThat(UsuarioExiste.enLaLista(updatedUser), is(true)));
    }
}

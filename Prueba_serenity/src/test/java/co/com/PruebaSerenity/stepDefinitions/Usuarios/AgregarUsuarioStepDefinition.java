package co.com.PruebaSerenity.stepDefinitions.Usuarios;

import co.com.PruebaSerenity.factories.UsuarioFactory;
import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.questions.Usuarios.UsuarioVisible;
import co.com.PruebaSerenity.task.Usuarios.AgregarUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class AgregarUsuarioStepDefinition {

    private Usuario currentUser;

    @Cuando("el administrador crea un nuevo usuario")
    public void elAdministradorIngreseLosDatosDelNuevoUsuario() {
        currentUser = UsuarioFactory.randomUser();
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(AgregarUsuario.with(currentUser));
    }
    @Entonces("ver el nuevo usuario en la lista")
    public void verElNuevoUsuarioEnLaLista() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.should(seeThat(UsuarioVisible.inTheList(currentUser), is(true)));
    }
}

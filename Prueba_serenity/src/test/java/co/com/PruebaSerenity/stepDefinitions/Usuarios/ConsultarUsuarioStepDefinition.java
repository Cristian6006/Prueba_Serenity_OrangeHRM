package co.com.PruebaSerenity.stepDefinitions.Usuarios;

import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.questions.Usuarios.UsuarioExiste;
import co.com.PruebaSerenity.task.Usuarios.BorrarUsuario;
import co.com.PruebaSerenity.task.Usuarios.ConsultarUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.hamcrest.Matchers.is;

public class ConsultarUsuarioStepDefinition {
    @Cuando("e ingresa el nombre del usuario y su ID")
    public void eIngresaElNombreDelUsuarioYSuId() {
        Actor actor = OnStage.theActorInTheSpotlight();
        Usuario usuarioActual = actor.recall("USUARIO");
        actor.attemptsTo(ConsultarUsuario.with(usuarioActual));
    }
    @Entonces("deberia ver unicamente el usuario con su nombre y ID")
    public void deberiaVerUnicamenteElUsuarioConSuNombreYId() {
        Actor actor = OnStage.theActorInTheSpotlight();
        Usuario usuarioActual = actor.recall("USUARIO");
        actor.should(GivenWhenThen.seeThat(
                        "Al usuario en la lista" + usuarioActual,
                        UsuarioExiste.enLaLista(usuarioActual)
                )
        );
    }
}

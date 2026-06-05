package co.com.PruebaSerenity.task.Usuarios;

import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.userInterfaces.UsuariosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultarUsuario implements Task {
    private final Usuario usuario;

    public ConsultarUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public static ConsultarUsuario with(Usuario usuario) {
        return instrumented(ConsultarUsuario.class, usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarUsuarioVisible.conDatosDe(usuario),
                Click.on(UsuariosUI.BOTON_ACTUALIZAR_USUARIO)
        );
    }
}

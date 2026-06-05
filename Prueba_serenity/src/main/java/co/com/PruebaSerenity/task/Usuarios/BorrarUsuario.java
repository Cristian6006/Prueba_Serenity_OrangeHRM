package co.com.PruebaSerenity.task.Usuarios;

import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.userInterfaces.UsuariosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BorrarUsuario implements Task {
    private final Usuario usuario;

    public BorrarUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public static BorrarUsuario with(Usuario usuario) {
        return instrumented(BorrarUsuario.class, usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UsuariosUI.BOTON_ACTUALIZAR_USUARIO)

        );
    }
}

package co.com.PruebaSerenity.task.Usuarios;

import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.userInterfaces.DashboardUI;
import co.com.PruebaSerenity.userInterfaces.UsuariosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarUsuario implements Task {
    private final Usuario usuario;

    public AgregarUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public static AgregarUsuario with(Usuario usuario) {
        return instrumented(AgregarUsuario.class, usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UsuariosUI.BOTON_AGREGAR_USUARIOS),
                Enter.theValue(usuario.getFirstName()).into(UsuariosUI.INPUT_PRIMER_NOMBRE),
                Enter.theValue(usuario.getMiddleName()).into(UsuariosUI.INPUT_SEGUNDO_NOMBRE),
                Enter.theValue(usuario.getLastName()).into(UsuariosUI.INPUT_APELLIDO),
                Enter.theValue(usuario.getId()).into(UsuariosUI.INPUT_ID),
                Click.on(UsuariosUI.BOTON_SALVAR_USUARIOS)
        );
    }
}

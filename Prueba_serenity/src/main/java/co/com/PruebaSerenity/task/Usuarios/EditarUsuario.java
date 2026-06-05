package co.com.PruebaSerenity.task.Usuarios;

import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.userInterfaces.UsuariosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EditarUsuario implements Task {
    private final Usuario updatedUser;

    public EditarUsuario(Usuario updatedUser) {
        this.updatedUser = updatedUser;
    }

    public static EditarUsuario with(Usuario usuario) {
        return instrumented(EditarUsuario.class, usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ActualizarCampo.con(
                        UsuariosUI.INPUT_PRIMER_NOMBRE,
                        updatedUser.getFirstName()
                ),
                ActualizarCampo.con(
                            UsuariosUI.INPUT_SEGUNDO_NOMBRE,
                        updatedUser.getMiddleName()
                ),
                ActualizarCampo.con(
                        UsuariosUI.INPUT_APELLIDO,
                        updatedUser.getLastName()
                ),
                Click.on(UsuariosUI.BOTON_SALVAR_USUARIOS)
        );

    }
}

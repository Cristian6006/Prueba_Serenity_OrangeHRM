package co.com.PruebaSerenity.task.Usuarios;

import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.userInterfaces.UsuariosUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EsperarUsuarioVisible {

    public static Performable conDatosDe(Usuario usuario) {
        return Task.where(
                WaitUntil.the(
                        UsuariosUI.USUARIO_VISIBLE.of(usuario.getFullName()),
                        isVisible()
                ).forNoMoreThan(30).seconds()
        );
    }

}

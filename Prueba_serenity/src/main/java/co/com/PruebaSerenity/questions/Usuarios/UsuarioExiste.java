package co.com.PruebaSerenity.questions.Usuarios;

import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.userInterfaces.UsuariosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.PruebaSerenity.userInterfaces.UsuariosUI.MENSAJE_EXITO;

public class UsuarioExiste implements Question<Boolean> {
    private static final Logger logger =
            LoggerFactory.getLogger(UsuarioExiste.class);

    private final Usuario usuario;

    public UsuarioExiste(Usuario usuario) {
        this.usuario = usuario;
    }

    public static UsuarioExiste enLaLista(Usuario usuario) {
        return new UsuarioExiste(usuario);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String iD = usuario.getId();
            String nombreEsperado = (usuario.getFirstName()).trim();
            actor.attemptsTo(
                    Click.on(UsuariosUI.BOTON_ACTUALIZAR_USUARIO),
                    Enter.theValue(iD).into(UsuariosUI.INPUT_ID).thenHit(Keys.TAB),
                    Enter.theValue(nombreEsperado).into(UsuariosUI.EMPLOYEE_NAME),
                    Click.on(UsuariosUI.BOTON_BUSCAR)
            );
            logger.info("ID ={}", usuario.getId());
            return Visibility.of(UsuariosUI.USUARIO_EXISTE.of(iD)).answeredBy(actor);
        } catch (Exception e) {
            logger.error("El usuario no fue encontrado: {}", e.getMessage());
            return false;
        }
    }
}

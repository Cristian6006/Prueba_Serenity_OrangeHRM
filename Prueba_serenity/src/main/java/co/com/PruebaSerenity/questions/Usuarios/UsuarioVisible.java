package co.com.PruebaSerenity.questions.Usuarios;

import co.com.PruebaSerenity.models.Usuario;
import co.com.PruebaSerenity.userInterfaces.UsuariosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class UsuarioVisible implements Question<Boolean> {
    private static final Logger logger =
            LoggerFactory.getLogger(UsuarioVisible.class);

    private final Usuario usuario;

    public UsuarioVisible(Usuario usuario) {
        this.usuario = usuario;
    }

    public static UsuarioVisible inTheList(Usuario usuario) {
        return new UsuarioVisible(usuario);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String nombreCompletoEsperado = (usuario.getFirstName() + " " + usuario.getLastName()).trim();
            actor.attemptsTo(
                    WaitUntil.the(
                            UsuariosUI.USUARIO_VISIBLE.of(nombreCompletoEsperado),
                            isVisible()
                    ).forNoMoreThan(30).seconds()
            );
            logger.info("Nombre esperado: {}", nombreCompletoEsperado);
            logger.info("firstName={}", usuario.getFirstName());
            logger.info("middleName={}", usuario.getLastName());
            return Visibility.of(
                    UsuariosUI.USUARIO_VISIBLE.of(nombreCompletoEsperado)
            ).answeredBy(actor);

        } catch (Exception e){
            logger.error("El usuario no fue encontrado: {}", e.getMessage());
            return false;
        }
    }
}

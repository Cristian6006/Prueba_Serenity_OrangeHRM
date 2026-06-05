package co.com.PruebaSerenity.questions.Usuarios;

import co.com.PruebaSerenity.userInterfaces.UsuariosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.PruebaSerenity.userInterfaces.UsuariosUI.MENSAJE_EXITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajeExito implements Question<Boolean> {
    private static final Logger logger =
            LoggerFactory.getLogger(MensajeExito.class);

    private static final String MENSAJE_ESPERADO = "Success";

    public static MensajeExito mensajeExito() {
        return new MensajeExito();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(MENSAJE_EXITO, isVisible())
                            .forNoMoreThan(10)
                            .seconds()
            );
            String texto = Text.of(MENSAJE_EXITO).answeredBy(actor).trim();
            logger.info("Texto capturado: {}", texto);
            return texto.equalsIgnoreCase(MENSAJE_ESPERADO);
        } catch (Exception e){
            logger.error("El mensaje de guardado no fue encontrado: {}", e.getMessage());
            return false;
        }
    }
}

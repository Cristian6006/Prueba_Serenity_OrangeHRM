package co.com.PruebaSerenity.task.Usuarios;

import co.com.PruebaSerenity.userInterfaces.DashboardUI;
import co.com.PruebaSerenity.userInterfaces.UsuariosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegarA implements Task {

    @Override
    public <T extends Actor> void  performAs(T actor) {
        actor.attemptsTo(
                Click.on(DashboardUI.BOTON_NAV_USUARIOS)
        );
    }
    public static NavegarA laPaginaUsuarios() {
        return instrumented(NavegarA.class);
    }
}

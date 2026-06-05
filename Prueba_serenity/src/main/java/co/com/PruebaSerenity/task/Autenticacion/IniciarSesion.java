package co.com.PruebaSerenity.task.Autenticacion;

import co.com.PruebaSerenity.models.Credenciales;
import co.com.PruebaSerenity.userInterfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {
    private List<Credenciales> credenciales;

    public IniciarSesion(List<Credenciales> credenciales) { this.credenciales = credenciales;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        String user = credenciales.get(0).getUsuario();
        String pass = credenciales.get(0).getContraseña();

        actor.attemptsTo(
                Enter.theValue(user).into(LoginUI.INPUT_EMAIL),
                Enter.theValue(pass).into(LoginUI.INPUT_PASSWORD),
                Click.on(LoginUI.BOTON_ACCEDER)
        );
    }

    public static IniciarSesion conCredenciales(List<Credenciales> credenciales) {
        return instrumented(IniciarSesion.class, credenciales);
    }
}

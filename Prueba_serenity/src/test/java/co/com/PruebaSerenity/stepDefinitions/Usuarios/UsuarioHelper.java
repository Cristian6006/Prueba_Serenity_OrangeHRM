package co.com.PruebaSerenity.stepDefinitions.Usuarios;

import co.com.PruebaSerenity.factories.UsuarioFactory;
import co.com.PruebaSerenity.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public class UsuarioHelper {
    private UsuarioHelper() {}

    public static Usuario crearUsuario() {
        Usuario usuario = UsuarioFactory.randomUser();
        OnStage.theActorInTheSpotlight()
                .remember("USUARIO", usuario);
        return usuario;
    }
}

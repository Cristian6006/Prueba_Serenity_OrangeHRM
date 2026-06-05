package co.com.PruebaSerenity.utils.hooks;

import co.com.PruebaSerenity.models.Credenciales;
import io.cucumber.java.DataTableType;
import java.util.Map;

public class DataTableConfig {
    @DataTableType
    public Credenciales credencialesInicioSesion(Map<String, String> fila) {
        Credenciales credenciales = new Credenciales();

        credenciales.setUsuario(fila.get("usuario"));
        credenciales.setContraseña(fila.get("contraseña"));

        return credenciales;
    }
}

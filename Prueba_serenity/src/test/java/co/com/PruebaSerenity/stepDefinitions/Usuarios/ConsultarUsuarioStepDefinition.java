package co.com.PruebaSerenity.stepDefinitions.Usuarios;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class ConsultarUsuarioStepDefinition {
    @Cuando("el administrador ingresa el nombre del usuario")
    public void elAdministradorIngresaElNombreDelUsuario(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debria ver unicamente el usuario con {string} buscado")
    public void debriaVerUnicamenteElUsuarioConBuscado(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

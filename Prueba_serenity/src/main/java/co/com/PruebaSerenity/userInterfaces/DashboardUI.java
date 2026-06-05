package co.com.PruebaSerenity.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardUI {
    public static final Target TITULO_DASHBOARD = Target.the("Mensaje de bienvenida")
            .locatedBy("//h6[contains(., 'Dashboard')]");
    public static final Target BOTON_NAV_USUARIOS = Target.the("Bonton Navegacion Usuarios").locatedBy("//a[contains(@href,'viewPimModule')]");
}

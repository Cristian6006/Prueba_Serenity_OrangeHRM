package co.com.PruebaSerenity.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuariosUI {

    // AGREGAR USUARIO
    public static final Target BOTON_AGREGAR_USUARIOS = Target.the("Bonton Agregar Usuarios").locatedBy("//li[contains(., 'Add Employee')]");
    public static final Target INPUT_PRIMER_NOMBRE = Target.the("Campo Nombre Categoria").located(By.name("firstName"));
    public static final Target INPUT_SEGUNDO_NOMBRE = Target.the("Campo Tipo Categoria").located(By.name("middleName"));
    public static final Target INPUT_APELLIDO = Target.the("Campo Descripcion").located(By.name("lastName"));
    public static final Target INPUT_ID = Target.the("Campo Descripcion").locatedBy("//label[normalize-space()='Employee Id']/ancestor::div[contains(@class,'oxd-input-group')]" +
            "//input");
    public static final Target BOTON_SALVAR_USUARIOS = Target.the("Bonton Agregar Usuarios").locatedBy("//button[contains(., ' Save ')]");
    public static final Target USUARIO_VISIBLE = Target.the("Usuario").locatedBy("//h6[normalize-space(.)='{0}']");
    public static final Target MENSAJE_EXITO = Target.the("Mensaje de Guaradado").locatedBy("//p[normalize-space()='Success']");

    //CONSULTAR USUARIOS

    public static final Target EMPLOYEE_NAME = Target.the("Campo Employee Name").located(By.xpath("//label[normalize-space()='Employee Name']" + "/following::input[@placeholder='Type for hints...'][1]"));
    public static final Target BOTON_BUSCAR = Target.the("Boton Buscar").locatedBy("//button[contains(@class, 'oxd-button') and normalize-space()='Search']");
    public static final Target TABLA_RESULTADO_NOMBRE = Target.the("Nombre en tabla de resultados").locatedBy("//div[@class='oxd-table-body']//div[@class='oxd-table-card'][1]//div[@role='cell'][3]");

    //BORRAR USUARIO

    public static final Target BOTON_ACTUALIZAR_USUARIO = Target.the("Boton de refresco de usuarios").locatedBy("//li[contains(., 'Employee List')]");
}


# language: es
  # Author: Cristian

  Característica: Autenticacion en la pagina OrangeHRM
    Como administrador del sistema
    Quiero poder realizar el inicio de sesion correctamente
    Para gestionar, procesar y acceder a datos de forma eficiente a través de internet a su información cuando sea necesario

  @Autenticacion

  Escenario: Iniciar Sesion
    Dado Que el administrador se encuentra la pagina de Autenticacion de OrangeHRM
    Cuando inicie sesion con las credenciales correctas
    | usuario || contraseña |
    | Admin || admin123     |
    Entonces deberia ser redirigido al dashboard principal

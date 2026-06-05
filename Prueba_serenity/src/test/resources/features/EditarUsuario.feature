# language: es
  # Author: Cristian

Característica: Editar Usuario
  Como administrador del sistema
  Quiero modificar la información de un usuario
  Para mantener sus datos actualizados.

  Antecedentes:
    Dado Que el administrador se encuentra la pagina de Autenticacion de OrangeHRM
    Y inicie sesion con las credenciales correctas
      | usuario || contraseña |
      | Admin || admin123     |
    Y se encuentre en la pagina de Gestion de Informacion Personal

  @EditarUsuario

  Escenario: Actualizar un usuario existente
    Dado que existe un usuario
    Cuando el administrador actualiza la informacion del usuario
    Entonces deberia ver un mesaje de exito
    Y los datos actualizados deberian verse reflejados
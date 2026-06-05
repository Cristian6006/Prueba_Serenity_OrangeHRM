# language: es
  # Author: Cristian

Característica: Agregar Usuario
  Como administrador del sistema
  Quiero eliminar usuarios
  Para mantener actualizado el registro del sistema.

  Antecedentes:
    Dado Que el administrador se encuentra la pagina de Autenticacion de OrangeHRM
    Y inicie sesion con las credenciales correctas
      | usuario || contraseña |
      | Admin || admin123     |
    Y se encuentre en la pagina de Gestion de Informacion Personal

    @BorrarUsuario

    Escenario: Eliminar un usuario
      Dado que existe un usuario
      Cuando elimina a el usuario del sistema
      Entonces deberia ver un mesaje de exito
      Y que el usuario no exista en la lista
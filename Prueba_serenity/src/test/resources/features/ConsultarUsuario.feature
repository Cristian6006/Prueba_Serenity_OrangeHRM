# language: es
  # Author: Cristian

Característica: Consultar Usuario
  Como administrador del sistema
  Quiero visualizar la lista de usuarios
  Para consultar su información.

  Antecedentes:
    Dado Que el administrador se encuentra la pagina de Autenticacion de OrangeHRM
    Y inicie sesion con las credenciales correctas
      | usuario || contraseña |
      | Admin || admin123     |
    Y se encuentre en la pagina de Gestion de Informacion Personal

  @ConsultarUsuario

  Escenario: Buscar usuario por nombre y ID
    Dado que existe un usuario
    Cuando e ingresa el nombre del usuario y su ID
    Entonces deberia ver unicamente el usuario con su nombre y ID

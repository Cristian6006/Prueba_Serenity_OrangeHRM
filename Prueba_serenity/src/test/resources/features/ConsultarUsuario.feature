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

  Esquema del escenario: Buscar usuario por nombre
    Cuando el administrador ingresa el nombre del usuario
    | usuario |
    | Alex |
    Entonces debria ver unicamente el usuario con "<nombre>" buscado
    Ejemplos:
    | nombre |
    | Alex |
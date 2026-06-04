# language: es
  # Author: Cristian

Característica: Agregar Usuario
  Como administrador del sistema
  Quiero poder registrar nuevos usuarios
  para que puedan acceder al sistema.

  Antecedentes:
    Dado Que el administrador se encuentra la pagina de Autenticacion de OrangeHRM
    Y inicie sesion con las credenciales correctas
      | usuario || contraseña |
      | Admin || admin123     |
    Y se encuentre en la pagina de Gestion de Informacion Personal

  @AgregarUsuario

  Escenario: Crear un nuevo usuario
    Dado que existe un empleado registrado
    Cuando el administrador ingrese los datos del nuevo usuario
    Entonces deberia ver un mesaje de exito
    Y ver el nuevo usuario en la lista


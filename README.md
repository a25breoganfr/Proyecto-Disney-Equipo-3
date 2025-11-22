# Proyecto-Disney-Equipo-3
__________________________
# Índice
- [Introducción](#introducción)
  - [Postman](#postman) 
- [Manual técnico](#manual-técnico)
- [Manual de Usuario](#manual-de-usuario)
  - [Manejo de Errores](#manejo-de-errores)
      - [Ventana Login](#ventana-login)
          - [Registrar para añadir películas](#registrar-para-añadir-películas)
          - [Campos vacíos en Login](#campos-vacíos-en-login)
          - [Usuario o contraseña incorrectos](#Usuario-o-contraseña-incorrectos)
 


## Introducción
Esta es una aplicación que permite buscar el nombre de un personaje Disney. Una vez introducido el nombre nos mostrará la imagen correspondiente y el listado de películas.

### Postman
Se ha utilizado la aplicación [Postman](https://www.postman.com/) para poder visualizas el contenido de las API. A continuación dejamos una imagen con nuestra API y el GET que hemos usado para comprobar los datos disponibles: 

 ![Peticion1](/imagenes/postman.jpg)

## Manual técnico
### Requisitos 
- **Java SE 17 o superior**: El proyecto está desarrollado con Java 17 por lo que deberías tener instalada esta versión o una superior.
- **Interfaz**: El proyecto está realizado con una interfaz gráfica implementada, usando el modelo MVC, modelo, vista y controlador de Swing.
- **IDE**: Para el desarrollo de la aplicación hemos utilizado el IDE NetBeans.

## Manual de Usuario 
Al abrir la apliación se nos mostrará una ventana tal y como dejo a continuación

 ![Peticion1](/imagenes/mainJFrame.jpg)

Una vez dentro, el usuario deberá introducir el nombre del personaje, una vez le de al botón "Search" se mostrará automáticamente el nombre, la imagen y el listado de películas.

![Peticion1](/imagenes/character.jpg)
 
Si por error el usuario introduce un personaje que no existe, la aplicación mostrará dicho error.

![Peticion1](/imagenes/noExiste.jpg)

Para poder añadir una película el usuario debe estar registrado, podrá hacerlo dandole al botón "Register" donde se le abrirá la siguiente ventana

![Peticion1](/imagenes/register.jpg)

Una vez registrado el usuario deverá introducir sus credenciales en la pestaña de "login", para poder llegar allí deberá darle al botón correspondiente.

![Peticion1](/imagenes/login.jpg)

## Manejo de errores
En la aplicación implementamos diferentes mensajes para indicarle al usuario si está haciendo algo mal, para poder hacer la interfaz más interactiva y entendible.

### Ventana Login

#### Registrar para añadir películas
La aplicación permite consultar la información de las películas sin estar resgistrado, sin embargo, a la hora de añadir deberá estar logueando, sino le saldrá un mensaje aclarando.

![Peticion1](/imagenes/registrarParaPeliculas.jpg)

Dentro de las vista para poder escribir las credenciales implementamos una serie de mensajes para ayudar al usuario:

##### Campos vacíos en login
Si el usuario no escribe ninguna credencial y presiona el botón para loguearse aparecerá un mensaje como el que dejamos a continuación.

![Peticion1](/imagenes/camposVaciosLogin.jpg)

#### Usuario o contraseña incorrectos
Si por error el usuario introduce mal el nombre de usuario o la contraseña se le comunicará de la siguiente forma.

![Peticion1](/imagenes/loginIncorrecto.jpg)

### Ventana Register




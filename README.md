# Proyecto-Disney-Equipo-3
__________________________
# Índice
- [Introducción](#introducción)
  - [Postman](#postman) 
- [Manual técnico](#manual-técnico)
	- [Estructura](#estructura)
	- [Metodología](#motodología)
- [Manual de Usuario](#manual-de-usuario)
- [Manejo de Errores](#manejo-de-errores)
    - [Ventana Login](#ventana-login)
        - [Registrar para añadir películas](#registrar-para-añadir-películas)
        - [Campos vacíos en Login](#campos-vacíos-en-login)
        - [Usuario o contraseña incorrectos](#Usuario-o-contraseña-incorrectos)
    - [Ventana Register](#Ventana-Register)
        - [Campos vacíos en Register](#Campos-vacíos-en-Register)
        - [Usuario ya logueado](Usuario-ya-logueado)
        - [Contraseñas no coinciden](#Contraseñas-no-coinciden)
        - [Añadir película](#Añadir-película)
        - [Película vacía](#Película-vacía)
- [Reparto de tareas](#reparto-de-tareas)
- [Mejoras](#mejoras)
- [Conclusiones](#conclusiones)
- [Autores](#autores)


 
  

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
### Estructura 
La Estructura de este proyecto siguió el modelo MVC.  
En el modelo se guardan los datos de un personaje de la API y un arreglo de esos personajes para almacenarlos todos. Las clases User y Users se almacenan en un archivo txt con su usuario y contraseña haciendo, posteriormente, uso de los métodos de validación y guardado implementados.  
  
En la vista se implementá la interfaz completa del programa utilizando Java Swing. Todos los componentes; botones, campos de texto e imágenes, han sido colocados siguiendo unos estrictos criterios de usabilidad y principios de mínima sorpresa. La vista va a gestionar la interacción del usuario con el programa, asegurándose de que esta sea lo más agradable posible y  se comunicará con el controlador para garantizar que los botones utilizan los métodos correspondientes.  
  
El controlador se comunica con la vista y sus entradas por TextField, e implementa los métodos del modelo y de la clase Utilities en el main para que cada botón cumpla su función manejando la información recibida.  
### Metodología 
Durante el desarrollo de todo el programa utilizamos un sistema de branches con GitHub que nos permitió actualizar el código independiente de cada uno de manera eficiente y eficaz. En cada sesión subíamos los avances en la branch develop y corregíamos los problemas de compatibilidad. De esta manera conseguimos trabajar de manera simultanea manteniendo un código íntegro en todo momento.  
Al tener un producto ya finalizado y presentable se realizó un merge a la rama main para presentar el proyecto.  
  
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

### Registrar para añadir películas
La aplicación permite consultar la información de las películas sin estar resgistrado, sin embargo, a la hora de añadir deberá estar logueando, sino le saldrá un mensaje aclarando.

![Peticion1](/imagenes/registrarParaPeliculas.jpg)

Dentro de las vista para poder escribir las credenciales implementamos una serie de mensajes para ayudar al usuario:

### Campos vacíos en login
Si el usuario no escribe ninguna credencial y presiona el botón para loguearse aparecerá un mensaje como el que dejamos a continuación.

![Peticion1](/imagenes/camposVaciosLogin.jpg)

### Usuario o contraseña incorrectos
Si por error el usuario introduce mal el nombre de usuario o la contraseña se le comunicará de la siguiente forma.

![Peticion1](/imagenes/loginIncorrecto.jpg)

### Ventana Register

### Campos vacíos en Register
Tal y como hicimos en la ventana de Login, para poder registrarse, si el usuario presiona el botón de registro y los campos están vacíos aparecerá el siguiente error.

![Peticion1](/imagenes/camposVacíoRegister.jpg)

### Usuario ya logueado
Si en la aplicación tenemos almacenado un nombre de usuario, si al registrarse introduce el mismo, aparecerá un mensaje advirtiendo.

![Peticion1](/imagenes/usuarioExiste.jpg)

### Contraseñas no coinciden
El usuario una vez introduce la contraseña para confirmarla y le presiona el botón de registro al no estar las contraseñas bien introducidas se le proporcionará un aviso, como el mostrado a continuación

![Peticion1](/imagenes/contraseñasNoCoinciden.jpg)

## Añadir película
Una vez estemos registrados y logueados, si queremos añadir una películas primero debemos introducir el nombre del personaje, si no aparecerá el siguiente error.

![Peticion1](/imagenes/personajeVacio.jpg)

## Película vacía
Si el usuario presiona el botón añadir pero este no contiene datos, se le avisará de la siguiente forma.

![Peticion1](/imagenes/películaVacía.jpg)

## Reparto de tareas
El reparto de tareas nunca fue concretado, mas bien, cada persona comunicaba al grupo en qué iba a trabajar durante la sesión y se lo presentaba al grupo una vez terminado antes de subirlo a GitHub. Al final, acabó siendo lo siguiente:  
Breogán implementó el modelo, haciendo gestion del login o register de los usuarios, su guardado, lectura y verificación. También hizo la clase Utilities implementando métodos de búsqueda por nombre y serialización de la API usando Gson. Aportó además, su parte al Readme.  
Nerea gestionó la vista y el controlador con todos sus botones y ventanas. Se encargó de que cada componente utilizase el método adecuando y lo manejase para conseguir el resultado deseado. Hizo gran parte del Readme aportando las capturas del programa.  
Angel implementó el método de gestion de imágenes para el programa y ayudó en corrección de errores en compatibilidades con el código y en el diseño de la vista de las ventanas. 

## Mejoras
De tener más tiempo haríamos del programa un buscador más cualificado:  

-Añadiríamos búsqueda por ID además de por nombre.  
-Desde el botón ADD se podría añadir además de películas, shorts, videojuegos y shows.  
-Se mostrarían los aliados y enemigos de cada personaje.  

## Conclusiones
El tiempo estimado para la realización del proyecto ha sido de, además de las horas de clase, unas 8h cada uno contando con investigación, implementación de código y depuración.

Los tres miembros del grupo coincidimos con que ha sido un proyecto desafiante en muchos sentidos. También por ese motivo, creemos que ha sido una muy buena práctica docente, ya que hemos aprendido a superar esos problemas que van apareciendo para entregar un programa acabado en la fecha acordada.
Ha sido especialmente interesante y educativo aprender a manejar datos de una API, conectarse con ella, mapear los datos y guardarlos en un archivo y sacarlos por pantalla a nuestro criterio. Implementar una interfaz nos ha resultado satisfactorio y creemos que hemos presentado un buen resultado en este aspecto. Todo esto trabajando en grupo desde GitHub, herramienta con la que estamos familiarizados como resultado de este proyecto.
En conclusión este trabajo nos ha preparado notablemente para una futura entrega y para hacer una mejor gestión del trabajo en equipo de cara a las prácticas en empresa.

## Autores
Breogán Fontenla Rosende  
Nerea Salgado Martínez  
Angel Gestoso Agrelo  




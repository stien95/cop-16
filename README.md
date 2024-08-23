En la unidad 1 de nuestro curso, nos enfocamos en el análisis y la especificación de problemas, utilizando contratos que detallan entradas, salidas, ejemplos y casos de prueba. Aprendimos a modelar la información relevante para la solución del problema mediante el uso de variables, constantes, tipos de datos primitivos y cadenas de texto. A través de este proceso, desarrollamos habilidades para resolver problemas utilizando estructuras de control, como instrucciones secuenciales, subrutinas, condicionales y repetitivas. Además, aprendimos a utilizar operadores de asignación, aritméticos, relacionales, de cadenas y lógicos, así como estructuras contenedoras lineales de tamaño fijo y cadenas de texto en la construcción de soluciones.

En la unidad 2, hemos trabajado en el análisis de un problema construyendo un modelo con los elementos que intervienen en el problema y especificando los servicios que el programa debe ofrecer, bajo el paradigma de programación orientado a objetos.

Aprenderemos a construir las clases que implementan el modelo de la solución del problema, identificando de manera informal los métodos de una clase y clasificarlos en métodos constructores, de consulta y de modificación. Utilizamos una arquitectura para un programa que permita repartir de manera adecuada las responsabilidades entre la interfaz de usuario y el modelo de la solución, y cómo relacionar dichos componentes. Finalmente, hemos aprendido a relacionar todos los conceptos vistos en las dos primeras unidades del curso.

Esta tarea integradora presenta una actividad en la cual se requiere aplicar todos los conocimientos adquiridos en la unidad 1 y la unidad 2\.  Por tanto, esta tarea es un instrumento para verificar el cumplimiento de los objetivos que han sido planteados para las unidades 1 y 2 descritas en el programa del curso.  

A continuación, encontrará un enunciado que narra de forma detallada la situación problemática que se espera usted solucione.

### **Enunciado**

El 20 de febrero de 2024 se oficializó que la COP de biodiversidad será realizada en la ciudad de Cali entre el 21 de octubre y el 01 de noviembre. El encuentro es la 16ª edición de la Convención Marco de Naciones Unidas sobre el Cambio Climático.

La Conferencia de las Partes (COP) del Convenio sobre la Diversidad Biológica, CBD por sus siglas en inglés, es un tratado internacional adoptado en la Cumbre de la Tierra de Río de Janeiro en 1992 y que entró en vigor en 1993, con el propósito de conservar la diversidad biológica, procurar un uso sostenible y garantizar la participación justa y equitativa de los beneficios derivados de la utilización de los recursos genéticos de las especies.

La COP de biodiversidad, es un espacio internacional para establecer agendas, compromisos y marcos de acción en relación con la conservación de la biodiversidad y los servicios ecosistémicos, y atender desafíos como la crisis climática, la pérdida de hábitats naturales, la sobreexplotación de recursos naturales, entre otros.

Se celebra cada dos años y reúne a representantes de más de 190 países miembros del convenio, así como a organizaciones intergubernamentales, no gubernamentales, sociedad civil y otros actores relevantes.

*“Paz con la naturaleza”* es el lema del evento, según lo indicado por el Ministerio de Ambiente y Desarrollo Sostenible. La COP16 será un espacio para escuchar a los pueblos indígenas, campesinos y comunidades étnicas, en lo asociado a nuestra relación con los ecosistemas y la importancia de generar acciones para proteger la biodiversidad.

La región del Pacífico, cuenta con más de 200 áreas protegidas, incluidos 11 Parques Nacionales Naturales que conforman 51.388 kilómetros cuadrados de biodiversidad, y hábitat de 1297 especies de fauna, así como de 14.000 especies de plantas.

Debido a la premura del evento, nuestro alcalde ha convocado a las universidades y al sector tecnológico para brindar una aplicación que permita el conocimiento y la navegación tanto de los lugares con diversidad biológica como de las comunidades que cuidan dichos lugares, adicionalmente de la agenda de las actividades que conforman el evento.

El desarrollo consistirá en 3 partes:

1\. Primera fase: se encargará de la gestión de la agenda del evento, estadísticas y cálculos sobre las actividades.  
2\. Segunda fase: se encargará de la gestión de lugares biodiversos, registrando sus primeros datos iniciales y realizando cálculos y búsquedas sobre ellos.  
3\. La tercera parte consiste en reorganizar y reagrupar los dos aplicativos iniciales, unirlos bajo el paradigma OO y extender una última vez la aplicación agregando las comunidades que se encargan de estos lugares biodiversos y detallandolos más a fondo.

**Primera fase: Interacción de Rutas Ecológicas**

La COP16 en Cali, aparte de tener eventos de tipo conferencia y panelistas, también tiene algunos eventos sociales orientados a educar la comunidad caleña acerca de la biodiversidad y motivar a que la cuiden. Entre estos eventos promotores, existen los eventos de la **Franja Multicolor**, entre los cuales se encuentran 3 caminatas (rutas) a sitios biodiversos y de turismo verde en la ciudad. Se pueden consultar en: [https://www.cop16colombia.com/es/eventos-franja-multicolor/](https://www.cop16colombia.com/es/eventos-franja-multicolor/)

Cabe resaltar que a pesar de que la COP 16 se desarrolla oficialmente desde el Lunes 21 de Octubre hasta el Viernes 1 de Noviembre, las rutas de esta franja comienzan a partir desde el Sábado 19\.

Se desea realizar un programa que sea usado por un organizador voluntario de la COP 16, para registrar un grupo de personas que participará en la ruta un día en específico, que cumpla con lo siguiente:

* Se solicita el nombre y la cédula del organizador voluntario para registro del programa, además de brindarle un saludo de bienvenida.  
* Posibilidad de escoger la ruta: se debe escoger una de las 3 rutas programadas. Dependiendo de la ruta que se escoja, se debe desplegar la siguiente información:  
  * Punto de encuentro de la actividad.  
  * Hora de inicio de la actividad.  
  * Hora de finalización de la actividad.  
* Se debe informar la cantidad de integrantes que harán de la actividad de la siguiente manera:  
  * Cantidad de participantes.  
  * Cantidad de guías.  
* Ingresar los datos meteorológicos del día, los cuales son:  
  * Temperatura en grados centígrados °C.  
  * Porcentaje de Humedad relativa.  
    * Si la temperatura está entre 20°C y 25°C y la humedad relativa entre 40% y 60%, el programa debe desplegar el mensaje de: “¡Hace un buen día para caminar por Cali\!”  
* La Alcaldía de Cali dispone de buses para el recorrido de las personas desde el punto de encuentro al lugar de la caminata. Cada bus dispone de una capacidad para 25 personas, así que, dependiendo de la cantidad de personas que harán parte de la actividad, así mismo el programa debe decir cuántos buses son necesarios para ejecutar la actividad sin que nadie se quede por fuera.

**Ejemplo de ejecución (Primera fase del aplicativo)**

A continuación se muestra un ejemplo de una de las interacciones que podría tener el sistema a la hora de ejecutarse, no es una camisa de fuerza, pero puede ser útil como guía (el **\#** indica mensaje del sistema y **\>** indica entrada del usuario):

| \# Bienvenido voluntario a la aplicación de Interacción de Rutas Ecológicas COP 16 Cali \- Colombia. ¿Cuál es tu nombre? \> Juan Betancourt \# Por favor, digita tu cédula. \> 1123456789 \# ¡Bienvenido, Juan Betancourt\! \# ¿Qué ruta registrarás el día de hoy? \> Farallones \# ¡Excelente\! La Ruta de los Farallones tiene como punto de encuentro Calle 16 \- Universidad del Valle iniciando a las 6:40 am, y termina a las 4:00 pm. \# ¿Cuántos participantes acudirán a la caminata el día de hoy? \> 50 \# ¿Cuántos guías acudirán a la caminata el día de hoy? \> 10 \# Ingresar la temperatura en grados centígrados °C \> 24.3 \# Ingresar el porcentaje de humedad relativa \> 50 \# ¡Hace un buen día para caminar por Cali\! \# Al ser un total de 60 personas que harán parte de la actividad, se necesitarán un total de: \# 3 buses para llevarla a cabo de manera exitosa. ¡Nos vemos en la COP16\! |
| :---- |

**Segunda fase: Gestión de Lugares Biodiversos**

En medio del discurso ambiental que aborda la COP 16, se hace casi que obligatorio hablar sobre lugares especiales en el ambiente que resultan ser biodiversos por naturaleza y que debemos identificarlos y conocerlos para poder protegerlos de la mejor manera posible. A estos lugares, se les llama *lugares con* *diversidad ecológica*.

De los *lugares con diversidad biológica* se deberá almacenar la siguiente información:

- Nombre del lugar.  
- Nombre del depto (Chocó, Valle, Cauca, Nariño).  
- Cantidad de kilómetros cuadrados.

El segundo aplicativo pretende tener la capacidad de almacenar hasta 30 *lugares con diversidad biológica* (el nombre del lugar debe ser único), y, sobre éstos, se desea ofrecer al usuario (voluntario):

* Mostrar los nombres de los lugares ordenados desde el que tiene menor área (km²) hasta el de mayor área.  
* Mostrar cuál es el departamento que tiene más lugares con diversidad biológica registrados, e indicar cuántos tiene.

**Ejemplo de ejecución (Segunda fase del aplicativo)**

| \# Bienvenido voluntario a la aplicación de Gestión de Lugares Biodiversos COP 16 Cali \- Colombia.  \# Te presentamos las siguientes opciones, ingresa: \# 1\. Para registrar un lugar con diversidad biológica \# 2\. Para consultar los lugares ordenados de menor a mayor con respecto al área \# 3\. Para consultar el departamento que tiene más lugares con diversidad biológica registrados hasta el momento. \# 4\. Para salir del programa. \> 1 \# Ingresa el nombre del lugar biodiverso \> Parque Nacional Natural Puracé \# Ingresa el departamento en el cual está el lugar \> Cauca \# Ingresa la cantidad de kilómetros cuadrados que abarca el lugar \> 919 \# Lugar ingresado con éxito. \# 1\. Para registrar un lugar con diversidad biológica \# 2\. Para consultar los lugares ordenados de menor a mayor con respecto al área \# 3\. Para consultar el departamento que tiene más lugares con diversidad biológica registrados hasta el momento. \# 4\. Para salir del programa. \> 1 \# Ingresa el nombre del lugar biodeverso \> Parque Nacional Natural Farallones de Cali \# Ingresa el departamento en el cual está el lugar \> Valle \# Ingresa la cantidad de kilómetros cuadrados que abarca el lugar \> 1965 \# Lugar ingresado con éxito. \# 1\. Para registrar un lugar con diversidad biológica \# 2\. Para consultar los lugares ordenados de menor a mayor con respecto al área \# 3\. Para consultar el departamento que tiene más lugares con diversidad biológica registrados hasta el momento. \# 4\. Para salir del programa. \> 1 \# Ingresa el nombre del lugar biodeverso \> Parque Nacional Natural Uramba Bahía Málaga \# Ingresa el departamento en el cual está el lugar \> Valle \# Ingresa la cantidad de kilómetros cuadrados que abarca el lugar \> 471 \# Lugar ingresado con éxito. \# 1\. Para registrar un lugar con diversidad biológica \# 2\. Para consultar los lugares ordenados de menor a mayor con respecto al área \# 3\. Para consultar el departamento que tiene más lugares con diversidad biológica registrados hasta el momento. \# 4\. Para salir del programa. \> 2 \# Los lugares ordenados de menor a mayor con respecto al área hasta el momento son: \#  Parque Nacional Natural Uramba Bahía Málaga \- 471 kilómetros cuadrados. \#  Parque Nacional Natural Puracé \- 919 kilómetros cuadrados. \#  Parque Nacional Natural Farallones de Cali \- 1965 kilómetros cuadrados. \# 1\. Para registrar un lugar con diversidad biológica \# 2\. Para consultar los lugares ordenados de menor a mayor con respecto al área \# 3\. Para consultar el departamento que tiene más lugares con diversidad biológica registrados hasta el momento. \# 4\. Para salir del programa. \> 3 \# El departamento con más lugares biodiversos registrados es: \# Valle, con 2 lugares biodiversos. |
| :---- |

**Tercera fase: Unificación de procesos**

El objetivo en esta tercera fase, sería poder reorganizar los dos aplicativos que se han realizado, pero bajo el paradigma orientado a objetos, en distintas clases y respetando la división de responsabilidades. Adicional a esta mejora, se extiende la noción de lugar biodiverso, añadiendo los siguientes atributos:

- Foto del lugar  
- Fecha de inauguración  
- Comunidad que lo cuida.  
- Recursos económicos ($) necesarios para un buen cuidado del hábitat.  
- Especies que la habitan, como máximo en esta versión beta se almacenarán 50 especies en cada lugar. De las especies se debe almacenar la siguiente información:   
  - Nombre  
  - Si es flora o fauna,   
  - Una foto (ruta de acceso)   
  - Cantidad de ejemplares en el lugar. 

De la comunidad se debe llevar registro de la siguiente información:

- Nombre  
- Tipo: Afrocolombiana, Indigena, Raizal)  
- Nombre y celular del representante  
- Cantidad de habitantes  
- Mayores problemas: falta de hospital, falta de escuela, falta de agua potable, falta de acceso a alimentación básica). 

Adicional a lo que ya realizan los anteriores programas, se debe adicionar la posibilidad de:

* Ingresar una Comunidad.  
* Ingresar una especie a un lugar.  
* Modificar los datos de la especie en un lugar.  
* Creación de casos de prueba.

Con dos consultas adicionales:

* Consultar la información de las comunidades cuyos problemas son: que les falta un hospital o que les falta una escuela.  
* Consultar el nombre del lugar con mayor cantidad de especies.

### **Entregables**

La entrega de la tarea integradora se encontrará dividida en tres partes:

**Primera entrega: Hasta el sábado 24 de agosto de 2024 a las 21:59.**

Lleve a cabo las siguientes actividades de cada una de las etapas de desarrollo de software:

1. Análisis del problema:  
   1. **Identificación del problema y análisis de requerimientos para satisfacer la Primera Fase** de implementación del aplicativo (en el formato visto en la clase de Ingeniería de Software I, [descárguelo aquí](https://docs.google.com/document/d/1oDqJpNtlBHJcxUUSvJwMott6WMYP4yen/edit?usp=sharing\&ouid=107321456686737451647\&rtpof=true\&sd=true)).  
   2. Definición del **diagrama de flujo general** que represente la solución planteada.  
2. **Implementación en Java**. Incluya en la implementación, los comentarios descriptivos sobre el código java escrito por usted.   
3. Documentación. Se deben incluir **los contratos de los métodos implementados: descripción, parámetros y retorno.**  
4. Usar **GitHub como repositorio de código fuente y documentación**. Recuerde que se debe evidenciar su avance a través de los días en el desarrollo de su tarea.

Recuerde que puede encontrar la Rúbrica de la tarea integradora en el siguiente enlace.

**Segunda entrega: Hasta el sábado 7 de septiembre de 2024 a las 21:59.**

1. Análisis del problema:  
   1. **Actualización de la Identificación del problema y análisis de requerimientos para satisfacer la Primera y Segunda Fase** de implementación del aplicativo (en el formato visto en la clase de Ingeniería de Software I, [descárguelo aquí](https://docs.google.com/document/d/1oDqJpNtlBHJcxUUSvJwMott6WMYP4yen/edit?usp=sharing\&ouid=107321456686737451647\&rtpof=true\&sd=true)).  
2. Implementación en Java. Incluya en la implementación, los comentarios descriptivos sobre los atributos y métodos de cada clase.  
3. Documentación en JavaDoc (Debe entregarse el JavaDoc generado y ubicarlo en la carpeta doc). **Incluya los contratos de los métodos implementados: descripción, parámetros y retorno.**  
4. Usar GitHub como repositorio de código fuente y documentación utilizando la estructura de carpetas aprendida en clase. Recuerde que se debe evidenciar su avance a través de los días en el desarrollo de su tarea.

**Tercera entrega: Hasta el 28 de septiembre de 2024 a las 21:59.**

1. Análisis del problema:  
   1. **Actualización de la Identificación del problema y análisis de requerimientos para satisfacer la Primera, Segunda y Tercera Fase** de implementación del aplicativo (en el formato visto en la clase de Ingeniería de Software I, [descárguelo aquí](https://docs.google.com/document/d/1oDqJpNtlBHJcxUUSvJwMott6WMYP4yen/edit?usp=sharing\&ouid=107321456686737451647\&rtpof=true\&sd=true)).  
2. Diseño de la solución.   
- Elabore un **diagrama de clases** que modele la solución del problema de acuerdo con las buenas prácticas y los patrones de diseño revisados hasta el momento en el curso. Su diagrama debe incluir el paquete modelo y el de interfaz de usuario.   
- **Tabla de trazabilidad entre el análisis y el diseño** ([Enlace](https://docs.google.com/document/d/19KhqEW8sLzceHlUzPyreCF5Q7gh9b0xUiJuagKhHmb4/edit?usp=drive\_link)).  
3. **Implementación en Java**. Incluya en la implementación, los comentarios descriptivos sobre los atributos y métodos de cada clase.  
4. **Documentación en JavaDoc** (Debe entregarse el JavaDoc generado y ubicarlo en la carpeta doc). **Incluya los contratos de los métodos implementados: descripción, parámetros y retorno.**  
5. Usar GitHub como repositorio de código fuente y documentación utilizando la estructura de carpetas aprendida en clase. Recuerde que se debe evidenciar su avance a través de los días en el desarrollo de su tarea.

| Nota: Tenga en cuenta que su repositorio GitHub debe presentar una estructura base como por ejemplo:        Cop16/ src/            bin/           doc/     Dentro de los directorios src/ y bin/ estarán presentes estos directorios(representando cada uno de sus paquetes):       	ui/ 	model/ El directorio src (source code) contiene sus clases .java dentro del directorio ui/ y model/. Por otro lado, el directorio bin (binary files) contiene los archivos .class en el directorio ui/ y model/. El directorio doc tendrá toda la documentación de análisis y diseño Su código debería compilar de acuerdo con lo explicado en la diapositiva 15 de esta presentación: [http://tinyurl.com/y3bd9bg2](http://tinyurl.com/y3bd9bg2)  |
| :---- |

**Anexo**

**Manejo de Fechas** 

Se recomienda utilizar Calendar (ubicado en java.util) y SimpleDateFormat (ubicado en java.text) para formatear el despliegue de la fecha.

Para Obtener la instancia del Calendar :     

   Calendar calendarTime \= Calendar.getInstance();

De la instancia del Calendar se obtiene la fecha actual, con un formato dado:

   String timeStamp \= new SimpleDateFormat("dd-MM-yyyy").format(calendarTime.getTime()); 

Para mas inforamción: [https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html](https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html) 



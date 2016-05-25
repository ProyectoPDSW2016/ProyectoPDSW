# ProyectoPDSWElectroECI


DISEÑO DETALLADO DEL SOFTWARE
[ElectroECI]


		Autores: 
Manuel Felipe Sanchez
Santiago Chisco
Daniel Ayala
Sergio Aponte

		Co-autor/Asesor: Profesor Héctor Cadavid R.





Prefacio







Este documento describe el diseño detallado del software electroEci, cuyo objetivo principal es  facilitar equipos electrónicos de última tecnología con fines académicos y de investigación aplicada a una parte de la comunidad de la institución.
El objetivo principal de ElectroECI es automatizar el manejo de equipos del laboratorio de Ingeniería Electrónica de la Escuela Colombiana de Ingeniería, con el fin de facilitar a los estudiantes, profesores, investigadores y laboratoristas el manejo de préstamos y devoluciones de los diferentes equipos y herramientas existentes, adicionando nuevas funcionalidades para facilitar el inventario y control de los diferentes equipos por si se necesitan de algún mantenimiento.
Alcance
Este documento de diseño detallado del software de ElectroECI es la base de la codificación de este. Describe los siguientes tópicos: 
Generar un software para automatizar el servicio que presta el laboratorio de Ingeniería electrónica.
Realizar visitas al laboratorio para la revisión del proceso. 
Realizar diferentes análisis para determinar las diversas falencias que tiene el servicio actual y plantear la solución para el servicio a futuro.





Historia del Documento

Fecha
Versión
Comentarios
Autor
14 Abril 2016
0.1
Modelo relacional y Versión inicial
Equipo
18 Abril 2016
0.1
Modelo relacional y Versión inicial
Equipo
19 Abril 2016
0.1
Modelo relacional y Versión inicial
Equipo
21 Abril 2016
0.1
Modelo relacional y Versión inicial
Equipo
20 Abril 2016 
0.1.1
Implementación patron DAO
Manuel Sanchez
23 Abril 2016 
0.1.1
Implementación patron DAO
Manuel Sanchez
24 Abril 2016 
0.1.1
Implementación patron DAO
Manuel Sanchez
20Abril 2016 
0.1.2
Creacion ManagedBean
Sergio Aponte
22 Abril 2016 
0.1.2
Creacion ManagedBean
Sergio Aponte
24 Abril 2016 
0.1.3
Implementación pruebas
Santiago Chisco
20 Abril 2016 
0.1.4
Implementación parte de aplicación
Santiago Chisco
23 Abril 2016 
0.1.5
Implementación parte de aplicación
Santiago Chisco
25 Abril 2016
0.1.6
Unión parte de aplicación con la base de datos
Santiago Chisco
27 Abril 2016
0.1.7
Realización parte gráfica para mostrar la vida útil de los equipos
Daniel Ayala
30 Abril 2016
1.1.1
Verificación existencia TipoEquipo
Sergio Aponte
1 Mayo 2016
1.1.1
Verificación existencia TipoEquipo
Sergio Aponte
2 Mayo 2016
1.1.1
Verificación existencia TipoEquipo
Sergio Aponte
4 Mayo 2016
1.1.1
Verificación existencia TipoEquipo
Sergio Aponte
7 Mayo 2016
1.1.2
Modificación ManagedBean
Sergio Aponte
4 Abril 2016
1.1.2
Modificación ManagedBean
Sergio Aponte
5 Mayo 2016
1.1.2
Modificación ManagedBean
Sergio Aponte
30 Abril 2016
1.1.3
Modificación exixtencia de equipo en el sistema
Sergio Aponte
1 Mayo 2016
1.1.3
Modificación exixtencia de equipo en el sistema
Sergio Aponte
29 Abril 2016
1.1.4
Terminacion del Dao
Manuel Sanchez
1 Mayo 2016
1.1.4
Terminacion del Dao
Manuel Sanchez
2 Mayo 2016
1.1.4
Terminacion del Dao
Manuel Sanchez
28 Abril 2016
1.1.5
Terminación inserción TipoEquipo
Manuel Sanchez
3 Mayo 2016
1.1.5
Terminación inserción TipoEquipo
Manuel Sanchez
5 Mayo 2016
1.1.5
Terminación inserción TipoEquipo
Manuel Sanchez
30 Abril 2016
1.1.6
Implementación Pruebas
Santiago Chisco
2 Mayo 2016
1.1.7
Implementación parte de aplicación
Santiago Chisco
6 Mayo 2016
1.1.7
Implementación parte de aplicación
Santiago Chisco
8 Mayo 2016
1.1.8
Unión Aplicación con la base de datos
Santiago Chisco
28 Abril 2016
1.1.9
Comprobación de consultas
Santiago Chisco - Daniel Ayala
3 Mayo 2016
1.1.9
Comprobación de consultas
Santiago Chisco 
2 Mayo 2016
1.1.9
Comprobación de consultas
Daniel Ayala
4 Mayo 2016
1.1.9
Comprobación de consultas
Daniel Ayala
6 Mayo 2016
1.1.9
Comprobación de consultas
Daniel Ayala
3 Mayo 2016
1.1.10
Terminación parte gráfica para mostrar vida útil
Daniel Ayala
7 Mayo 2016
1.1.10
Terminación parte gráfica para mostrar vida útil
Daniel Ayala
4 Mayo 2016
1.1.11
Reporte ordenado de los equipos
Daniel Ayala
5 Mayo 2016
1.1.11
Reporte ordenado de los equipos
Daniel Ayala
5 Mayo 2016
1.1.12
Resumen al registrar un préstamo
Sergio Aponte
13 Mayo 2016
2.1.1
Implementación Pruebas
Santiago Chisco
14 Mayo 2016
2.1.1
Implementación Pruebas
Santiago Chisco
16 Mayo 2016
2.1.1
Implementación Pruebas
Santiago Chisco
20 Mayo 2016
2.1.1
Implementación Pruebas
Santiago Chisco
19 Mayo 2016
2.1.2
Implementación interfaz para seleccionar ficha
Santiago Chisco
18 Mayo 2016
2.1.3
Resumen al registrar un préstamo
Sergio Aponte
20 Mayo 2016
2.1.3
Resumen al registrar un préstamo
Sergio Aponte
20 Mayo 2016
2.1.4
Implementación aplicación y mappers
Daniel Ayala
18 Mayo 2016
2.1.5
Parte grafica al devolver un equipo
Sergio Aponte
21 Mayo 2016
2.1.5
Parte grafica al devolver un equipo
Sergio Aponte
22 Mayo 2016
2.1.6
Efectuar devolución del equipo
Sergio Aponte
23 Mayo 2016
2.1.7
Implementación ManagedBean
Santiago Chisco
24 Mayo 2016
2.1.7
Implementación ManagedBean
Santiago Chisco
14 Mayo 2016
2.1.8
Implementación de consultas
Daniel Ayala
16 Mayo 2016
2.1.8
Implementación de consultas
Daniel Ayala
21 Mayo 2016
2.1.9
Implementación del descargable y ManagedBean
Manuel Sanchez
22 Mayo 2016
2.1.9
Implementación del descargable y ManagedBean
Manuel Sanchez
23 Mayo 2016
2.1.9
Implementación del descargable y ManagedBean
Manuel Sanchez

Tabla de Contenidos

1	Definición del Software	
1.1	Visión del producto	
1.2	Descripción del contexto en el cual se utilizará el producto	
1.3	Historias de usuario	
1.4	Alcance	
1.5	Supuestos	
1.6	Dependencias	
1.7	Metodología de Prueba	
1.8	Estándares seguidos	
2	Diseño Detallado	
2.1	Arquitectura de alto nivel	
2.2	Modelo relacional	
2.3	Diseño por paquetes/capas	
2.3.1	Capa de persistencia	
2.3.2	Capa lógica	
2.3.3	Capa de presentación	
3	Descripción del proceso	
3.1	Descripción del proceso de desarrollo utilizado, y de las prácticas consideradas para el mismo	
3.2	Backlogs y Burndown-charts de los Sprints	
3.3	Release-Burndown-chart	
3.4	Métricas por desarrollador	
Glosario (Definiciones y Siglas)	


 
Definición del Software
Visión del producto
Desarrollar un software que le permita al laboratorio de Ingeniería Electrónica prestar un servicio para facilitar equipos electrónicos de última tecnología -con fines académicos y de investigación aplicada- a toda la comunidad de la institución, elaborando una plataforma tecnológica que permita llevar tanto el control del uso adecuado de los equipos como, como el aplicar más fácilmente las políticas de renovación y actualización de los mismos. Con ayuda de esta plataforma, el proceso de préstamo de equipos resulta bastante simple, tanto para el Laboratorista como para los estudiantes. Utilizando las codificaciones de códigos de barras disponibles en los carnets de los estudiantes y en los códigos de inventario de los equipos, la incorporación del lector de código de barras para reducir  el proceso de préstamo a la lectura del código del estudiante y a la posterior lectura de los códigos de los equipos que se van a prestar. El proceso de devolución es sumamente simple, haciendo uso de estos mismos códigos el sistema rápidamente identifica a quien debe descargar el equipo cuyo código se lee al momento de la devolución, y con ayuda de esto se puede determinar que tanto tiempo estuvo en uso el equipo para determinar acciones a realizar con esto.
Descripción del contexto en el cual se utilizará el producto
El sistema quiere automatizar el manejo de préstamos, devoluciones e inventarios de los diferentes equipos que se encuentran en el laboratorio de ingeniería electrónica, se quiere manejar el uso de una base de datos la cual indique a qué usuarios se realizó el préstamo o actividad que se desee con los equipos, ya sea para prácticas o  uso de estos, con una serie de permisos y restricciones dependiendo del usuario, teniendo la información tanto del equipo como del usuario que realiza alguna actividad y poder manejar de una manera mucho más eficiente el inventario y orden de las herramientas del laboratorio.
Historias de usuario
-Registro de los Equipos.

Detalle: Como Laboratorista, quiero registrar un equipo para poder dejar este disponible para que se realice un préstamo y que los diferentes usuarios puedan utilizar estos.
 
El sistema permite buscar si existe un modelo del equipo solicitado dentro del sistema, y agregarlo como un nuevo elemento de este.
Cuando se intenta registrar un equipo y este corresponde a un modelo que no está registrado dentro del sistema se solicita al usuario el ingreso de los diferentes detalles del modelo con su fotografía correspondiente.
No se permite el registro del mismo modelo más de dos veces, tampoco que se registre dos veces la misma placa o serie de este.

-Préstamo de Materiales.

Detalle: Como Laboratorista, quiero registrar un préstamo del equipo/s para poder ofrecer el equipo a los estudiantes llevando el control de la devoluciones.

Se solicita al usuario (cualquier tipo de usuario), mediante su carnet con el código de barras, su identificación para permitir el ingreso de este.
Ya identificado el tipo de usuario, se ingresa al sistema mediante carnet o código de barras los codigos de los equipos a solicitar, identificando el tipo de préstamo a realizar teniendo en cuenta el usuario que realizó el préstamo.
Se presenta el resumen del préstamo con el fin de ser verificado por quien realiza el préstamo.

-Ficha de un Equipo.

Detalle: Como Laboratorista, quiero consultar la ficha del equipo para poder mirar qué equipos necesitan de mantenimiento o existe alguna novedad con ellos.

Se presenta la ficha generada por el excel adjunto en moodle.
Se revisa la ficha del equipo ingresando el número de placa ya sea mediante el lector de codigo de barras o manualmente.
La ficha debe estar en un formato adecuado para que sea imprimible.

-Devolución de Equipos.

Detalle: Como Laboratorista, quiero registrar la devolución de uno o más equipos para poder actualizar el estado de cuenta del usuario y quede en limpio.

Para la devolución de un equipo basta con ingresar el código del equipo, mostrando el nombre del usuario que realiza la devolución y confirmando que el equipo ha sido quitado de los préstamos del usuario.
Para equipos que no están codificados, se ingresa el código del estudiante, seleccionando tipo de equipo e ingresando el número de ítems que se devuelven.
Alcance
Se tiene pronosticado para la implementación del software, basado en la metodología de desarrollo de software SCRUM durante todo el tercer corte, estableciendo 3 sprints con una duración de dos semanas por cada uno.

Supuestos
Por cada sprint se realizaron entre dos y tres historias de usuario.
Se usan metodologías ágiles.
Realizar integración/despliegue continuo.
Manejo de tiempos, realizando estimaciones basados en una proyección real.
Equipos identificados por un serial o placa.
Equipos simples no son identificados mediante código.
Se realizan amonestaciones o sanciones a las personas que incumplan con el tiempo de entrega del equipo.
El equipo tiene estados (activo, desactivo). 
Dependencias
Dependencia para el manejo de seguridad 
Dependencia para usar primefaces
Dependencia para manejo de pruebas
Dependencia para el uso de mybatis
Dependencia para la aplicación web
Dependencia para la conexión con la base de datos
Dependencia para el uso de la base de datos de prueba
Metodología de Prueba
Las pruebas de software son las investigaciones empíricas y técnicas cuyo objetivo es proporcionar información objetiva e independiente sobre la calidad del producto a la parte interesada o en este caso al stakeholder.Es una actividad más en el proceso de control de calidad.

Las pruebas se realizaron de forma estática permitiendo el uso de técnicas de caja negra.Para esto se tuvieron en cuenta todas las historias de usuario permitiendo el correcto uso dentro de la aplicación.Las pruebas de encuentran en la carpeta Test Packages haciendo uso de una base de datos de prueba se verificó el comportamiento de la aplicación.Entre las pruebas que se tuvieron en cuenta son:
-Prestamo de Equipos.
Hacer el préstamo de un equipo a un usuario y este tiene una fecha de entrega, pero después el sistema se modificará para que corresponda al plazo de entrega del equipo.	
-Tiempo de vida de los Equipos.
Se hizo con respecto a los Equipos que están se les hace la consulta de vida concuerdo se ha prestado.
Estándares seguidos

El proyecto se realizó en tres capas:

Presentación: Implementación de las diferentes vistas en las cuales los usuarios se pueden registrar o registrar un equipo o préstamo.
Lógica: se definen los servicios software comunicándose con las vistas por medio del ManagedBean.
Persistencia: se comunica con la base de datos mediante el patrón DAO para utilizar y solicitar información.

	Se trabajó desarrollo de software basado en SCRUM.


2  	Diseño Detallado
2.1      Arquitectura de alto nivel







2.2      Modelo relacional
2.3  	Diseño por paquetes/capas

2.3.1 	Capa de persistencia


2.3.2     Capa lógica


2.3.3     Capa de presentación

3 	Descripción del proceso
3.1      Descripción del proceso de desarrollo utilizado, y de las prácticas consideradas para el mismo
El proceso usado en el desarrollo del proyecto se basó en la metodología SCRUM donde se establecieron tres sprint con una duración de 2 semanas cada uno realizando todo lo propuesto por esta metodología, también se usó como práctica el manejo de historias de usuario, adicionalmente nos basamos en criterios como el desarrollo por TDD, documentación y estandares de java.
3.2      Backlogs y Burndown-charts de los Sprints

















 
 
 
 
 
 







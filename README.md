# Conversor de Monedas

Este es un sencillo programa de consola en Java que permite convertir valores entre diferentes monedas utilizando tasas de conversión obtenidas de una API externa. Los usuarios pueden seleccionar entre varias opciones predefinidas o ingresar cualquier par de monedas para realizar la conversión.

## Descripción

El programa consta de tres clases principales:

- **Moneda**: Representa un objeto que contiene la información de la moneda base, la moneda objetivo y la tasa de conversión.
- **ConsultaMoneda**: Se encarga de hacer la consulta a la API externa para obtener las tasas de conversión.
- **ConversionMoneda**: Maneja la lógica de la conversión de valores entre dos monedas.
- **Principal**: Es el punto de entrada del programa y maneja la interacción con el usuario a través de un menú interactivo.

## Estructura del Proyecto

```plaintext
src/
├── ConsultaMoneda.java
├── ConversionMoneda.java
├── Moneda.java
└── Principal.java

````

## Dependencias

Este proyecto utiliza la biblioteca Gson de Google para el procesamiento de JSON. Puedes agregarla a tu proyecto usando Maven o descargando el JAR directamente.

Si usas Maven, agrega lo siguiente en tu `pom.xml`:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version>
</dependency>
```

# Configuración de la API

El programa utiliza la API exchangerate-api para obtener las tasas de conversión entre diferentes monedas. Para hacer uso de la API, debes obtener una API Key desde su sitio web.

1. Visita [https://www.exchangerate-api.com/](https://www.exchangerate-api.com/)
2. Regístrate y consigue una API Key.
3. Reemplaza "f" en el archivo `ConsultaMoneda.java` con tu API Key.

```java
private static final String API_KEY = "TU_API_KEY";
```
# Funcionalidad

## Menú Principal

Al ejecutar el programa, se muestra un menú donde el usuario puede seleccionar entre varias opciones de conversión predefinidas o ingresar una conversión personalizada entre cualquier par de monedas.

### Opciones predefinidas:
- De USD (Dólar estadounidense) a MXN (Peso mexicano)
- De MXN (Peso mexicano) a USD (Dólar estadounidense)
- De USD (Dólar estadounidense) a COP (Peso colombiano)
- De COP (Peso colombiano) a USD (Dólar estadounidense)
- De USD (Dólar estadounidense) a BRL (Real brasileño)
- De BRL (Real brasileño) a USD (Dólar estadounidense)
- Convertir entre otras monedas
- Salir

## Conversión de Monedas

Dependiendo de la opción seleccionada, el programa:

1. Consulta la tasa de conversión entre las monedas.
2. Solicita al usuario la cantidad de la moneda base.
3. Muestra la cantidad equivalente en la moneda destino utilizando la tasa de conversión.

### Ejemplo de Uso

Cuando el usuario selecciona la opción 1:
```
Bienvenido/a al conversor de monedas  
Selecciona la conversión que deseas realizar:  
1. De USD (Dólar estadounidense) a MXN (Peso mexicano)  
2. De MXN (Peso mexicano) a USD (Dólar estadounidense)  
...
Elige una opción (1-8): 1  
Tasa de conversión para hoy: 1 USD = 18.25 MXN  
Ingrese la cantidad de USD: 10  
10.00 USD equivalen a 182.50 MXN.
```
# Modo Avanzado

En la opción 7, el programa permite al usuario ingresar cualquier código de moneda para realizar conversiones personalizadas entre dos monedas de su elección. Esto es útil si deseas realizar una conversión que no está disponible en las opciones predefinidas.

## Requisitos
- JDK 11 o superior
- Acceso a internet para consultar la API de tasas de conversión
- La API Key de exchangerate-api

## Cómo ejecutar el programa
1. Clona este repositorio o descarga los archivos fuente.
2. Asegúrate de tener configurado el entorno de desarrollo con JDK 11 o superior.
3. Agrega la dependencia de Gson si usas Maven o asegúrate de tener la librería en tu classpath.
4. Ejecuta el archivo `Principal.java` desde tu IDE o desde la línea de comandos con:
```bash
javac Principal.java
java Principal
```
Contribución
Si deseas contribuir a este proyecto, puedes:

Hacer un fork del repositorio.
Crear una nueva rama para tus cambios.
Hacer un pull request con tus mejoras.

# Contribución

Si deseas contribuir a este proyecto, puedes:

1. Hacer un fork del repositorio.
2. Crear una nueva rama para tus cambios.
3. Hacer un pull request con tus mejoras.

# Licencia

Este proyecto está bajo la licencia MIT. Puedes ver el archivo `LICENSE` para más detalles.

¡Gracias por usar el Conversor de Monedas!

# Nohuman01.github.io
Web API de Libro
Claro, aquí tienes un resumen de las tareas que se describen:

1. **Creación de la entidad Libro**: Se debe crear una nueva clase llamada `Libro` en el paquete `com.tuuniversidad.models`. Esta clase tendrá los campos `id`, `titulo`, `autor`, `editorial` y `anioPublicacion`.

2. **Creación del repositorio**: Se debe crear un repositorio en el paquete `com.tuuniversidad.repository`. Este repositorio contendrá objetos predefinidos de los libros.

3. **Creación del servicio**: Se debe crear un servicio en el paquete `com.tuuniversidad.service`. Este servicio llamará a una instancia del repositorio.

4. **Creación del controlador**: Se debe crear una clase `LibroController` en el paquete `com.tuuniversidad.controllers`. Este controlador tendrá los siguientes endpoints:
    - `GET /libros`: Retorna una lista de todos los libros.
    - `GET /libros/{id_libro}`: Retorna un libro por el id.
    - `POST /libros`: Crea un nuevo recurso libro.
  
5. **Creación del controlador**: Se debe crear una clase `LibroController` en el paquete `com.tuuniversidad.controllers`. Este controlador tendrá los siguientes endpoints:
   Si no existe el libro, lanzar un expcetion LibroException (GET /libros/{id_libro}). Enviar el estado NOT_FOUND con un mensaje personalizado
    Cuando se crea un libro, enviar el estado de CREATE

[![Captura-de-pantalla-2024-05-17-221750.png](https://i.postimg.cc/ZqThd1n1/Captura-de-pantalla-2024-05-17-221750.png)](https://postimg.cc/5XkGcKw3)
[![Captura-de-pantalla-2024-05-17-230942.png](https://i.postimg.cc/D0YM8MH3/Captura-de-pantalla-2024-05-17-230942.png)](https://postimg.cc/LgLTWNmx) 
[![Captura-de-pantalla-2023-07-02-184649.png](https://i.postimg.cc/mkHsvtmF/Captura-de-pantalla-2023-07-02-184649.png)](https://postimg.cc/8fN9WPQ1)
[![Captura-de-pantalla-2024-06-02-175401.png](https://i.postimg.cc/c4fKYHdH/Captura-de-pantalla-2024-06-02-175401.png)](https://postimg.cc/HVss1TcD)

# api-products
Esta aplicación, es una API desarrollada en SpringBoot 3.2.4, siguiendo una arquitectura hexagonal. Además, se incluye soporte para Docker para facilitar la gestión del entorno de desarrollo y despliegue de la aplicación.
Su propósito es, proporcionar funcionalidades para consultar productos almacenados en una base de datos. 


# Tecnologías
* Java 17
* SpringBoot 3.2.4
* Lombok
* Swagger
* H2
* JPA
* Mapstruct


## Instalación en windows
1. **Repositório Git:** git clone https://github.com/tu_usuario/api-consulta-productos.git

2. **Instalamos docker:**  https://www.docker.com/products/docker-desktop/

3. **Imagen docker:** creamos la imagen desde la carpeta raíz del proyecto, ejecutando el comando  _docker build -t api-products ._

4. **Desplegamos el container:**  _docker run -p 8080:8080 api-products_

## Probar
- **Swagger:** http://localhost:8080/swagger-ui.html
- **H2:** http://localhost:8080/h2-console URL: jdbc:h2:mem:products


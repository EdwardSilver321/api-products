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
1. **Repositório Git:** clonamos el proyecto  _git clone https://github.com/tu_usuario/api-consulta-productos.git_

2. **Instalamos docker:**  _https://www.docker.com/products/docker-desktop_

3. **Imagen docker:** creamos la imagen desde la carpeta raíz del proyecto, ejecutando el comando desde cmd _docker build -t api-products ._

4. **Desplegamos el container:**  _docker run -p 8091:8091 api-products_

## Probar
- **Swagger:** [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- **H2:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
-	 **url:** jdbc:h2:mem:products
-	 **user:** sa
-	 **pass:** 


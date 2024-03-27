# Usa una imagen base con Java 17 y Maven
FROM maven:3.8.4-openjdk-17-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia los archivos fuente 
COPY ./ /app

# Construye la aplicación utilizando Maven
RUN mvn clean package -DskipTests

# Expone el puerto en el que corre la app
EXPOSE 8080

# Comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "target/api-products-0.0.1-SNAPSHOT.jar"]
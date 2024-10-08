# Usa una imagen base de Maven para construir la aplicación
FROM maven:3.8.5-openjdk-17 AS build

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo pom.xml y el código fuente al contenedor
COPY pom.xml .
COPY src ./src

# Construye la aplicación
RUN mvn clean package -DskipTests

# Usa una imagen base de Java para ejecutar la aplicación
FROM openjdk:17-jdk-slim

# Copia el JAR construido desde la etapa anterior
COPY --from=build /app/target/consulta.jar app.jar

# Define el comando de inicio para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]


# Usar una imagen base de Java
FROM eclipse-temurin:23-jdk

COPY target/cuestionario.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
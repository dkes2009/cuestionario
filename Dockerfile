# Usar una imagen base de Java
FROM eclipse-temurin:21-jdk

COPY target/cuestionario-3.4.7.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
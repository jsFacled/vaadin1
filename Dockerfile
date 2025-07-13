FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

# Usamos el wrapper de Maven y le damos permisos
RUN chmod +x ./mvnw && ./mvnw clean install -Pproduction

# Puerto: usar el valor de PORT si Render lo define
ENV PORT=8080
EXPOSE 8080

# Spring Boot usará el valor de PORT automáticamente si lo configurás
CMD ["java", "-Dserver.port=${PORT}", "-jar", "target/vaadin1-0.0.1-SNAPSHOT.jar"]

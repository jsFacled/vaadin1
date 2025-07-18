FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -Pproduction

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/vaadin1-0.0.1-SNAPSHOT.jar app.jar
RUN useradd -m myuser
USER myuser
EXPOSE 8080
CMD ["java", "-jar", "-Dspring.profiles.active=prod", "app.jar"]

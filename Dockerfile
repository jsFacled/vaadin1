FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN chmod +x ./mvnw && ./mvnw clean install -Pproduction

EXPOSE 8080

CMD ["java", "-jar", "target/vaadin1-0.0.1-SNAPSHOT.jar"]

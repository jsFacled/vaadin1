# 🏗 Etapa 1: Build con Maven
FROM eclipse-temurin:17-jdk-alpine as build

WORKDIR /app

# Copiamos solo lo necesario para aprovechar caché
COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN chmod +x mvnw && ./mvnw dependency:go-offline -B

# Copiamos el código fuente y compilamos
COPY src ./src
RUN ./mvnw clean package -DskipTests

# 🚀 Etapa 2: Imagen final mínima
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Instalamos tini para mejor manejo de señales (opcional pero recomendado)
RUN apk add --no-cache tini

# Copiamos el JAR construido
COPY --from=build /app/target/vaadin1-0.0.1-SNAPSHOT.jar app.jar

# Puerto definido por Render (por defecto 8080)
ENV PORT=8080
EXPOSE ${PORT}

# Usamos tini como entrypoint
ENTRYPOINT ["/sbin/tini", "--"]
CMD ["java", "-Dserver.port=${PORT}", "-jar", "app.jar"]

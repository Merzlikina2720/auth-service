FROM eclipse-temurin:17-jre-alpine
EXPOSE 8080
ADD target/auth-service-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
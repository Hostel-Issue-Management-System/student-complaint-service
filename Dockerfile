FROM eclipse-temurin:17-jdk-alpine
COPY target/had-hospital-service-0.0.1-SNAPSHOT.jar had-hospital-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "had-hospital-service-0.0.1-SNAPSHOT.jar" ]
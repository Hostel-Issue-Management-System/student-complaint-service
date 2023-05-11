FROM eclipse-temurin:17-jdk-alpine
COPY target/student-complaint-service-0.0.1-SNAPSHOT.jar student-complaint-service-0.0.1-SNAPSHOT.jar
COPY /target/spe_major_project.log spe_major_project.log
ENTRYPOINT [ "java", "-jar", "student-complaint-service-0.0.1-SNAPSHOT.jar" ]

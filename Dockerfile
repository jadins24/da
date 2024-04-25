FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar .mvn/wrapper/maven-wrapper.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8081

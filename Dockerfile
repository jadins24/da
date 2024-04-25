FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY .mvn/wrapper/*.jar maven-wrapper.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8081

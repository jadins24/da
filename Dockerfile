FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY .mvn/wrapper/*.jar maven-wrapper.jar
ENTRYPOINT ["java","-jar","/maven-wrapper.jar"]
EXPOSE 8080

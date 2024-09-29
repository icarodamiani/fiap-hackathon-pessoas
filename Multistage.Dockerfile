FROM openjdk:17

VOLUME /pessoas
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]


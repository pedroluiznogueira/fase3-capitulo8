FROM openjdk:21-slim

LABEL maintainer="pedrol@hotmail.com"

VOLUME /tmp

EXPOSE 8081

ARG JAR_FILE=/target/fase3.capitulo8-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
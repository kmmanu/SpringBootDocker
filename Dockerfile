FROM openjdk:8-jdk
MAINTAINER Manu K M
VOLUME /tmp
EXPOSE 8990
#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar

COPY target/spring-boot-docker-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
FROM java:8
MAINTAINER Manu K M
VOLUME /tmp
ADD spring-boot-docker-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
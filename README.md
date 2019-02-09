To Build the docker image : `mvn clean install dockerfile:build`
To Run  : `docker run -p 8080:8080 -e SPRING_PROFILES_ACTIVE=esp  kmmanu/spring-boot-docker`


*FROM:* A docker image can use another image available in the docker registry as its base or parent image. In the above example, we use the openjdk:8-jdk-alpine image as our base image. It is a very lightweight OpenJDK 8 runtime image that uses Alpine Linux. (It’s perfect for small Java microservices.)

*LABEL:* The LABEL instruction is used to add metadata to the image. In the above Dockerfile, we have added some info about the maintainer of the image through LABEL instruction.

*VOLUME:* Volumes are a mechanism to persist data generated by the container on the Host OS, and share directories from the Host OS with the container.

The VOLUME instruction creates a mount point on the container with the specified path. When you run the container, you can specify the directory on the Hot OS to which the given mount point will be mapped to. After that, anything that the container writes to the mounted path is written to the mapped directory on the Host OS.

One of the most common use cases of volumes is to store the log files generated by the container on the Host OS. For example, Let’s say that your application writes log files to a location /var/log/app.log.

You can mount a VOLUME with path /var/log in the Dockerfile, and then specify the directory on the Host OS to which this mount point will be mapped to while running the container. After that, you’ll be able to access the logs from the mapped directory on the Host OS.

In the above Dockerfile, we created a mount point with path /tmp because this is where the spring boot application creates working directories for Tomcat by default. Although it’s not required for this spring boot application because who cares about tomcat directories. But if you want to store stuff like tomcat access logs, then VOLUMES are very useful.

You can learn more about Volumes from the official documentation.

*EXPOSE:* As the name suggests, this instruction allows you to expose a certain port to the outside world.

*ENTRYPOINT/CMD:* This will be the executable to start when the container is booting. We must define them as JSON-Array, because we will use an ENTRYPOINT in combination with a CMD for some application arguments

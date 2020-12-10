* To Build the docker image : `mvn spring-boot:build-image`
* To Run  : `docker run -p 8080:8080 -e SPRING_PROFILES_ACTIVE=esp  -e FOO="Hello World" kmmanu/spring-boot-docker`

see [Create Efficient Docker image with Spring Boot 2.3](https://spring.io/blog/2020/08/14/creating-efficient-docker-images-with-spring-boot-2-3)
see [Cloud Native Buildpacks with Paketo.io & layered jars for Spring Boot](https://blog.codecentric.de/en/2020/11/buildpacks-spring-boot/)



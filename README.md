* To Build the docker image : `mvn compile jib:dockerBuild`
* To Run  : `docker run -p 8080:8080 -e SPRING_PROFILES_ACTIVE=esp  -e FOO="Hello World" kmmanu/spring-boot-docker-jib`

see [Jib - (Java Image Builder)](https://github.com/GoogleContainerTools/jib/blob/master/README.md)



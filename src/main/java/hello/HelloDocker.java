package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class HelloDocker {
    @Value("${application.name}")
    private String appName;
    @Value("${greeting}")
    private String greeting;

    private static String applicationName;


    public static void main(String[] args) {
        SpringApplication.run(HelloDocker.class, args);
        System.out.println("\nApplication name is " + applicationName + "\n");
        System.out.println("Value for env variable foo = " + System.getenv("FOO")); // docker run -p 8080:8080 -e FOO="fooooooooo"  kmmanu/spring-boot-docker
    }

    @PostConstruct
    public void init() {
        applicationName = appName;
    }

    @RequestMapping("/")
    public String home() {
        return greeting;
    }
}

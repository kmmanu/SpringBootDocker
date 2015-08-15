package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloDocker {

    public static void main(String[] args) {
        SpringApplication.run(HelloDocker.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}

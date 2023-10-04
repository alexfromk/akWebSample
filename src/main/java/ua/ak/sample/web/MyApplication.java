package ua.ak.sample.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyApplication {

    @RequestMapping("/")
    String home() {

		String helpText="<html><body>It's my Spring Boot application"
				+ "</body></html>";
        return helpText;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}
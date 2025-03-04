package org.example.springboot3security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoot3SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3SecurityApplication.class, args);
    }
}
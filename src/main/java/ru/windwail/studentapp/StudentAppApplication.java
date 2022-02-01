package ru.windwail.studentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableJpaRepositories
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class StudentAppApplication {



    public static void main(String[] args) {;
        SpringApplication.run(StudentAppApplication.class, args);
    }



}

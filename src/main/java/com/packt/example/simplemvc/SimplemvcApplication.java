package com.packt.example.simplemvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.packt.example"})
public class SimplemvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimplemvcApplication.class, args);
    }
}

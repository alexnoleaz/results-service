package com.develtrex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ResultsController {
    @GetMapping("results/{number}")
    public String getResults(@PathVariable float number) {
        return "El resultado es = " + number;
    }

    public static void main(String[] args) {
        SpringApplication.run(ResultsController.class, args);
    }
}

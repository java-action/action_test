package com.waglewagle.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WaglewagleApplication {

    public static void main(String[] args) {

        System.out.println("test server on");
        SpringApplication.run(WaglewagleApplication.class, args);
    }

}

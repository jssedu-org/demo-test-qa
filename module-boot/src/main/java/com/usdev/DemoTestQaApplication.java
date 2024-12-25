package com.usdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.usdev"})
public class DemoTestQaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTestQaApplication.class, args);
    }

}

package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@SpringBootApplication
public class CloudEurekaProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaProvider8001Application.class, args);
    }

}

package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //标记eureka客户端
@SpringBootApplication
public class CloudEurekaConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaConsumer80Application.class, args);
    }

}

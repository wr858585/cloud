package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CloudConsumerFeignConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignConsumer80Application.class, args);
    }

}

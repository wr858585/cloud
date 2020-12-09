package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//注册中心无论是Eureka还是Zookeeper，@EnableDiscoveryClient都可以
//如果是@EnableEurekaClient，则注册中心只能是指定的Eureka
@EnableDiscoveryClient
@SpringBootApplication
public class CloudGatewayGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayGateway9527Application.class, args);
    }

}

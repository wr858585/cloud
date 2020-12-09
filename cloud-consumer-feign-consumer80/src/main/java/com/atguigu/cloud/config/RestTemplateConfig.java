package com.atguigu.cloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootConfiguration
public class RestTemplateConfig {

    @LoadBalanced//实现客户端负载均衡
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

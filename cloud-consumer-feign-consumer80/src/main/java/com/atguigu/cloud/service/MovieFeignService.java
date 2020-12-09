package com.atguigu.cloud.service;

import com.atguigu.cloud.bean.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("CLOUD-EUREKA-PROVIDER8001")//和主启动@EnableFeignClient不同
//括号中要写远程调用的服务的应用名 --> yml文件中的spring.application.name
public interface MovieFeignService {

    @GetMapping("/movie/latest")//要带上电影服务controller层方法的全路径
    public Movie getMovieById();//去掉方法体，接口嘛

}

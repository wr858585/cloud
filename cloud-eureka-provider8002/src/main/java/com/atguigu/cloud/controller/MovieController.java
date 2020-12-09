package com.atguigu.cloud.controller;

import com.atguigu.cloud.bean.Movie;
import com.atguigu.cloud.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/latest")
    public Movie getMovieById(){
        System.out.println(port);
        return movieService.getMovieById();
    }

}

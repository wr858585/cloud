package com.atguigu.cloud.service;

import com.atguigu.cloud.bean.Movie;
import com.atguigu.cloud.bean.User;
import com.atguigu.cloud.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserDao userDao;

    public User getUserById(Integer id){
        User user = userDao.getUser(id);
        return user;
    }

    public Map<String, Object> getUserAndMovie(Integer id){
        Map<String, Object> result = new HashMap<>();
        User user = getUserById(id);
        result.put("user",user);
        //这就是Ribbon的服务间远程调用，所以要写url呀，再封装到此客户端的封装类中
        //这里就是：用户服务 调用 电影服务
        //注意：url要写远程调用的电影服务的application name（在yml文件中的spring.application.name），而非localhost
        Movie movie = restTemplate.getForObject("http://cloud-eureka-provider8001:8001/movie/latest", Movie.class);
        result.put("movie", movie);
        return result;
    }



}

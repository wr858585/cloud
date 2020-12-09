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
    private UserDao userDao;

    @Autowired
    private MovieFeignService movieFeignService;//注入该接口的代理类对象

    public User getUserById(Integer id){
        User user = userDao.getUser(id);
        return user;
    }

    public Map<String, Object> getUserAndMovie(Integer id){
        Map<String, Object> result = new HashMap<>();
        User user = getUserById(id);
        result.put("user",user);
        //用Feign的方式进行远程调用
        Movie movie = movieFeignService.getMovieById();
        result.put("movie", movie);
        return result;
    }
}

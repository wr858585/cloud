package com.atguigu.cloud.service;

import com.atguigu.cloud.bean.Movie;
import com.atguigu.cloud.dao.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class MovieService {

    @Resource
    private MovieMapper movieMapper;

    public Movie getMovieById(){
        return movieMapper.getMovieById();
    }

}

package com.atguigu.cloud.dao;

import com.atguigu.cloud.bean.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MovieMapper {

    @Select("select id, movie_name movieName from movie where id = 1")
    Movie getMovieById();

}

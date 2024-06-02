package com.example.moviezip.service;

import com.example.moviezip.dao.mybatis.MybatisMovieDao;
import com.example.moviezip.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieImpl {

    public final MybatisMovieDao mybatisMovieDao;

    public MovieImpl(MybatisMovieDao mybatisMovieDao) {
        this.mybatisMovieDao = mybatisMovieDao;
    }


    public List<Movie> searchMoviesByTitle(String keyword) {

        return mybatisMovieDao.searchMovieByKeyword(keyword);
    }

    //최신 영화 조회
    public List<Movie> getRecentMovie(){
        return mybatisMovieDao.getRecentMovie();
    }


    //영화 디테일 조회

    public Movie getMoviedetail(int movie_id){
        return mybatisMovieDao.getMoviedetail(movie_id);
    }

    public Movie getMovieTitle(String movie_title){
        return mybatisMovieDao.getMovieTitle(movie_title);
    }
}

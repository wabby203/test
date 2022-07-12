package com.platzi.JavaTest2.movies.data;

import com.platzi.JavaTest2.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {
    //aqui es donde se guardaran las peliculas en la bd
    Movie findById(Long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}

package com.platzi.JavaTest2.movies.service;

import com.platzi.JavaTest2.movies.data.MovieRepository;
import com.platzi.JavaTest2.movies.model.Genre;
import com.platzi.JavaTest2.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    // esta clase es donde esta la parte del negocio
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection findMoviesByGenre(Genre genre) {
        //se filtran las peliculas por genero con stream
       //        Collection<Movie> allMovies = movieRepository.findAll().stream().filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
        return movieRepository.findAll().stream().filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByLengh(int lenght) {
        //se filtran las peliculas por tamaño
        return movieRepository.findAll().stream().filter(movie -> movie.getMinutes() <= lenght).collect(Collectors.toList());
    }
}

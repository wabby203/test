package com.platzi.JavaTest2.movies.service;

import com.platzi.JavaTest2.movies.data.MovieRepository;
import com.platzi.JavaTest2.movies.model.Genre;
import com.platzi.JavaTest2.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceTest {
    //comenzar revisando que cosas quiero que haga mi servicio
    MovieService movieService;
    MovieRepository movieRepository;

    @Before
    public void setUp() throws Exception {
        //con este mockito estoy llamando a la clase pero sin usarla si se usa pero es un repo falso
        //simulacion del repocitorio con datos que nosotros ingresamos para hacer las pruebas
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1,"Dark Knight", 152, Genre.ACTION),
                        new Movie(2,"Memento", 113, Genre.THRILLER),
                        new Movie(3,"There´s something about Mary", 119, Genre.COMEDY),
                        new Movie(4,"Super 8", 112, Genre.THRILLER),
                        new Movie(5,"Scream", 111, Genre.HORROR),
                        new Movie(6,"Home Alone", 103, Genre.COMEDY),
                        new Movie(7,"Matrix", 136, Genre.ACTION)
                )
        );
        movieService = new MovieService(movieRepository);

    }

    @Test
    public void return_movies_by_genre() {
        //se hace llamado al metodo que estamos probando y agregamos su valor a probar
        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);

        //a continuacion conseguiremos los id de las peliculas y los guardaremos en una lista
        // List<Integer> moviesId = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());
        List<Integer> moviesId = getMovieIds(movies);

        // comparamos que la coleccion de movies que nos regresa son los mismos que esperamos
        assertThat(moviesId, CoreMatchers.is(Arrays.asList(3,6)));
    }

    @Test
    public void return_movies_by_length() {
        //se hace llamado al metodo que estamos probando y agregamos su valor a probar
        Collection<Movie> movies = movieService.findMoviesByLengh(119);

        //a continuacion conseguiremos los id de las peliculas y los guardaremos en una lista
        // List<Integer> moviesId = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());
        List<Integer> moviesId = getMovieIds(movies);

        // comparamos que la coleccion de movies que nos regresa son los mismos que esperamos
        assertThat(moviesId, CoreMatchers.is(Arrays.asList(2,3,4,5,6)));
    }

    // para cuando tenemos lineas de codigo que se necesitan en varias pruebas se
    //se puede hacer un refactor -> extract -> Method y asi tener un metodo que se puede llamar en todas las pruebas

    private List<Integer> getMovieIds(Collection<Movie> movies) {
        List<Integer> moviesId = movies.stream().map(Movie::getId).collect(Collectors.toList());
        return moviesId;
    }



}
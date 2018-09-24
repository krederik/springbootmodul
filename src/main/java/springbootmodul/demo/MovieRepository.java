package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class MovieRepository {
    ArrayList<Movie>  movies = new ArrayList<>();


    public MovieRepository (){
    movies.add(new Movie("Harry Potter", "Ron and Harry", 1998, "Horror",250));
    movies.add(new Movie("Titanic", "Leonardo and Rose", 1998, "Romantic",250));
    movies.add(new Movie("Harry Potter", "Ron and Harry", 1998, "Horror",250));
    movies.add(new Movie("Harry Potter", "Ron and Harry", 1998, "Horror",250));
    movies.add(new Movie("Harry Potter", "Ron and Harry", 1998, "Horror",250));
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}

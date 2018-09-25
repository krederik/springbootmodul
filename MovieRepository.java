package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class MovieRepository {
    ArrayList<Movie>  movies = new ArrayList<>();


    public MovieRepository (){
    movies.add(new Movie("Harry Potter", "Ron and Harry", 1998, "Horror",2:50));
    movies.add(new Movie("Titanic", "Leonardo and Rose", 1998, "Romantic",2:00));
    movies.add(new Movie("Fast 8", "The Rock & and com", 2016, "Action",2:30));
    movies.add(new Movie("Harry Potter 2", "Ron and Harry", 2005, "Horror",2:00));
    movies.add(new Movie("Harry Potter", "Ron and Harry", 1998, "Horror",250));
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}

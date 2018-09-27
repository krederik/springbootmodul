package springbootmodul.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class MovieRepository {
     ArrayList<Movie> movies = new ArrayList<Movie>();




   Movie movie1 = new Movie("Harry Potter" ,1998, "Horror",250);
   Movie movie2 = new Movie("Harry Potter2" ,1998, "Horror",250);
   Movie movie3 = new Movie("Harry Potter3" ,1998, "Horror",250);
   Movie movie4 = new Movie("Harry Potter4" , 1998, "Horror",250);
   Movie movie5 = new Movie("Harry Potter5" , 1998, "Horror",250);
   Movie movie6 = new Movie("Harry Potter6" , 1998, "Horror",250);






    public void addMovie(Movie movie){
    this.movies.add(movie);
    }

    public void addMovies(){
    movies.add(movie1);
    movies.add(movie2);
    movies.add(movie3);
    movies.add(movie4);
    movies.add(movie5);
    movies.add(movie6);

}
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public MovieRepository(){
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
    }

}
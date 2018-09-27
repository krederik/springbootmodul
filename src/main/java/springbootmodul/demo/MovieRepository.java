package springbootmodul.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class MovieRepository {
     ArrayList<Movie> movies = new ArrayList<Movie>();




   Movie movie1 = new Movie("Harry Potter" ,1998, "Horror",250);
   Movie movie2 = new Movie("Harry Potter2" ,2000, "Thriller",250);
   Movie movie3 = new Movie("The Mask" ,2002, "Romantic",200);
   Movie movie4 = new Movie("Fast8" , 1998, "Action",300);
   Movie movie5 = new Movie("King Kong" , 2005, "Horror",200);
   Movie movie6 = new Movie("Spiderman" , 2012, "Action",250);






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
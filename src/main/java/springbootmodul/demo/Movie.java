package springbootmodul.demo;

import java.util.ArrayList;
import java.util.Objects;

public class Movie {
    private String MovieName;
    private int ProduceYear;
    private String Genre;
    private double Duration;

    public Movie() {
    }

    public Movie(String movieName, int produceYear, String genre, double duration) {
        MovieName = movieName;
        ProduceYear = produceYear;
        Genre = genre;
        Duration = duration;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public int getProduceYear() {
        return ProduceYear;
    }

    public void setProduceYear(int produceYear) {
        ProduceYear = produceYear;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public double getDuration() {
        return Duration;
    }

    public void setDuration(double duration) {
        Duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "MovieName='" + MovieName + '\'' +
                ", ProduceYear=" + ProduceYear +
                ", Genre='" + Genre + '\'' +
                ", Duration=" + Duration +
                '}';
    }

}

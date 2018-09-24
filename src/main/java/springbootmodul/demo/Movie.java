package com.example.demo;

import java.util.ArrayList;
import java.util.Objects;

public class Movie {
    private String MovieName;
    private String Actors;
    private int ProduceYear;
    private String Genre;
    private double Duration;

    public Movie() {
    }

    public Movie(String movieName, String actors, int produceYear, String genre, double duration) {
        MovieName = movieName;
        Actors = actors;
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

    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        Actors = actors;
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
        return "movie{" +
                "MovieName='" + MovieName + '\'' +
                ", Actors='" + Actors + '\'' +
                ", ProduceYear=" + ProduceYear +
                ", Genre='" + Genre + '\'' +
                ", Duration=" + Duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return ProduceYear == movie.ProduceYear &&
                Double.compare(movie.Duration, Duration) == 0 &&
                Objects.equals(MovieName, movie.MovieName) &&
                Objects.equals(Actors, movie.Actors) &&
                Objects.equals(Genre, movie.Genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MovieName, Actors, ProduceYear, Genre, Duration);
    }
}


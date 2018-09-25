package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class MovieControllor {
    private static String CREATE = "Create";
    private static String SEARCH = "Search";
    private static String MOVIES = "Movies";

    Logger log = Logger.getLogger(MovieRepository.class.getName());

    @Autowired
    MovieRepository movieRepository;

    @GetMapping
    public String index(Model model) {
        List<Movie> movies = movieRepository.getMovies();
        log.info("index called...");

        model.addAttribute("movies", movies);
        return "index";
    }
    @GetMapping("/Create")
    public String Create(){

        return "CREATE";
    }

    @GetMapping("/Search")
    public String Search(){

        return "SEARCH";
    }
    @GetMapping("/Movies")
    public String Movies(){

        return "MOVIES";
    }
    // @PostMapping

}

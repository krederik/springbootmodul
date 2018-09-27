package springbootmodul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class movieController {
    private static String Create = "Create";
    private static String Search = "Search";
    private static String Movies = "Movies";

    Logger log = Logger.getLogger(MovieRepository.class.getName());


    @Autowired
    MovieRepository movieRepository;

    @GetMapping
    public String Movies(Model model){

        log.info("Movies called...");
        List<Movie> movies = movieRepository.getMovies();
        model.addAttribute("movies", movies);
        //den nøgle vi bruger

        return "index";
    }

    @GetMapping("/Create")
    public String create(Model model){
        log.info("Create action called...");

        model.addAttribute("movie", new Movie());
        return "Create";
    }

    @PostMapping ("/Create")
    public String create(@ModelAttribute Movie movie, Model model){
        log.info("create post action called...");
        //movieRepository.save(movie);
        model.addAttribute("movies", movieRepository.getMovies());
        return "redirect:/";
    }
    @GetMapping("/Search")
    public String Search(){

        return "Search";
    }
    @GetMapping("/Movies")
    public String Movies(){

        return "Movies";
    }

}


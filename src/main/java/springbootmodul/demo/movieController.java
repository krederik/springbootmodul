package springbootmodul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.logging.Logger;

@Controller
public class movieController {

    Logger log = Logger.getLogger(MovieRepository.class.getName());
        private String CREATE = "Create";
        private String SEARCH = "Search";
        private String MOVIES = "Movies";
        MovieRepository movieList = new MovieRepository()
        //@Autowired
        //MovieRepository movieRepository;

    @GetMapping("/Movies")
    public String Movies(Model model){
        log.info("Movies called...");
        model.addAttribute("movies", movieList.getMovies());
        //den nøgle vi bruger
        return MOVIES;
    }

    //List<Movie> movies = movieRepository.getMovies();

        @GetMapping("/Create")
        public String Create(Model model){

            log.info("Create action called...");
            model.addAttribute("movie", new Movie());
            return "CREATE";
        }

    //@RequestMapping(value = "/", method = RequestMethod.GET)
    //public String index(Model model) {


        @RequestMapping(value = "/Create")
        public String addmovieToList(
            @RequestParam("movieName") String movieName
            @RequestParam("ProduceYear") int produceyear;
            @RequestParam("Genre") String genre;
            @RequestParam("Duration") int duration;

            movieList.movies.add(new Movie(movieName, produceyear, genre, duration ));
            return "redirect:/Movie";



}

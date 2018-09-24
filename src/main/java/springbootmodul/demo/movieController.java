package springbootmodul.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class movieController {
        private static String CREATE = "Create";
        private static String SEARCH = "Search";
        private static String MOVIES = "Movies";

        @GetMapping
        public String index(){

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
}

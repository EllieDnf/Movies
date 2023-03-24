package dev.ellie.movies.controller;

import dev.ellie.movies.Movie;
import dev.ellie.movies.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return  new ResponseEntity<>(movieService.allMovies(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id){
        return new ResponseEntity<>(movieService.singlemovie(id),HttpStatus.ACCEPTED);
    }
}

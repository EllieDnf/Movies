package dev.ellie.movies.service;

import dev.ellie.movies.Movie;
import dev.ellie.movies.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@ComponentScan("dev.ellie.movies.service")
@NoArgsConstructor


public class MovieService {
    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie>  allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singlemovie(ObjectId id){
        return movieRepository.findById(id);
    }
}

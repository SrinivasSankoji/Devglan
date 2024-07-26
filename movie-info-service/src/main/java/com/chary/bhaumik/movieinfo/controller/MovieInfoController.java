package com.chary.bhaumik.movieinfo.controller;

import com.chary.bhaumik.movieinfo.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/movieInfo")
public class MovieInfoController {

    @GetMapping ("/{movieId}")
    public Movie getMovieInfo(@PathVariable ("movieId") String movieId) {
        return new Movie("One", "Gang Leader");
    }

}

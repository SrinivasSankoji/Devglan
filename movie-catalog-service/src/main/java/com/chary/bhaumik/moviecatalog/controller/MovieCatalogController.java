package com.chary.bhaumik.moviecatalog.controller;

import com.chary.bhaumik.moviecatalog.model.CatalogItem;
import com.chary.bhaumik.moviecatalog.model.Movie;
import com.chary.bhaumik.moviecatalog.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping ("/catalog")
public class MovieCatalogController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping ("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable ("userId") String userId) {
        UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/" + userId, UserRating.class);
        return userRating.getUserRatings().stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://movie-info-service/movieInfo/" + rating.getMovieId(), Movie.class);
            return new CatalogItem(movie.getName(), "Nani", rating.getRating());
        }).collect(Collectors.toList());
    }
}

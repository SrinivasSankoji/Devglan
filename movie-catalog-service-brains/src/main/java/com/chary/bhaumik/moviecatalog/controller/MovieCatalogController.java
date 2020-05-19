package com.chary.bhaumik.moviecatalog.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chary.bhaumik.moviecatalog.model.CatalogItem;
import com.chary.bhaumik.moviecatalog.model.Movie;
import com.chary.bhaumik.moviecatalog.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController 
{
	/**
	 * http://localhost:6001/catalog/srinivas
	 */
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
	{
		/**
		 * Calling Ratings Data Service
		 */
		/**List<Rating> ratings=Arrays.asList(new Rating("Two", 2),
				new Rating("Three", 3));**/
		
		//UserRating userRating=restTemplate.getForObject("http://localhost:6003/ratingsdata/users/"+userId, UserRating.class);
		
		UserRating userRating=restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/"+userId, UserRating.class);
		
		/**
		 * Calling Movie Info Service
		 */
		
		return userRating.getUserRatings().stream().map(rating -> {
			Movie movie=restTemplate.getForObject("http://movie-info-service/movieInfo/"+rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), "Nani", rating.getRating());
			}).collect(Collectors.toList());
		
		/**return userRating.getUserRatings().stream().map(rating -> {
			Movie movie=restTemplate.getForObject("http://localhost:6002/movieInfo/"+rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), "Nani", rating.getRating());
			}).collect(Collectors.toList());**/
		
		/**return ratings.stream().map(rating -> {
		Movie movie=restTemplate.getForObject("http://localhost:6002/movieInfo/"+rating.getMovieId(), Movie.class);
		return new CatalogItem(movie.getName(), "Nani", rating.getRating());
		}).collect(Collectors.toList());**/
				
		/**return ratings.stream().map(rating -> new CatalogItem("Gang Leader", "Nani", 9))
		.collect(Collectors.toList());**/
		
		//return Arrays.asList((new CatalogItem("Gang Leader", "Nani", 9)));
	}

}

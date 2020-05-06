package com.chary.bhaumik.movieinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chary.bhaumik.movieinfo.model.Movie;

@RestController
@RequestMapping("/movieInfo")
public class MovieInfoController 
{
	
	/**
	 * http://localhost:6002/movieInfo/srinivas
	 */
	@GetMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId)
	{
		return new Movie("One", "Gang Leader");
	}

}

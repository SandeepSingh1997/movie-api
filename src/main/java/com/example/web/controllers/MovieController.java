package com.example.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.entities.Movie;
import com.example.web.repositories.MovieRepository;
import com.example.web.services.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value = "/movies/", method = RequestMethod.GET)
	public List<Movie> getAllMovies(){
		List<Movie> list =  movieService.getAllMovies();
		return list;
	}
	
	@RequestMapping(value = "/movies/", method = RequestMethod.POST)
	public Movie createMovie(Movie movie) {
		return movieService.createMovie(movie);
	}

}

package com.example.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.entities.Movie;
import com.example.web.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> getAllMovies(){
		return movieRepository.findAll();
	}

	public Movie createMovie(Movie movie) {
		return movieRepository.save(movie);
	}
}

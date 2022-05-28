package com.example.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}

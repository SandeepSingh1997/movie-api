package com.example.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}

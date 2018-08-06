package com.stackroute.movieservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.stackroute.movieservice.domain.Movie;

public interface MovieRepository extends CrudRepository<Movie,Integer> {
	
}

package com.jpa.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.demo.model.Alien;

@Repository
public interface AlienRepo extends CrudRepository<Alien, Integer>{
	public List<Alien> findByTech(String tech);
}

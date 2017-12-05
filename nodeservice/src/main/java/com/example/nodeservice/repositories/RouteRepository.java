package com.example.nodeservice.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.nodeservice.collections.Route;

public interface RouteRepository extends MongoRepository<Route,String>{
	
}
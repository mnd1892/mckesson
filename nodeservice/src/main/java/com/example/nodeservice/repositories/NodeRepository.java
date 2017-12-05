package com.example.nodeservice.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.nodeservice.collections.Node;

public interface NodeRepository extends MongoRepository<Node,String>{
	
	@Query("{routeId : ?0}")
	List<Node> findByrouteIdQuery(String routeId);
	
}

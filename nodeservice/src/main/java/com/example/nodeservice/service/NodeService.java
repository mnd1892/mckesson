package com.example.nodeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.query.Query;

import com.example.nodeservice.collections.Node;
import com.example.nodeservice.repositories.NodeRepository;
import com.mongodb.Mongo;

@Service
public class NodeService {

	private NodeRepository nodeRepository;
	Query query;
	MongoTemplate mongoTemplate;
	
	@Autowired
	public NodeService(NodeRepository nodeRepository){
		this.nodeRepository = nodeRepository;
	    mongoTemplate = new MongoTemplate(new SimpleMongoDbFactory(new Mongo(),"nodedb"));
	    query = new Query();
	}
	
	@Autowired
	public List<Node> getRouteData(){
		query.fields().include("longitude");
		query.fields().include("latitude");
		query.fields().include("routeId");
		query.fields().include("nodeName");
		return mongoTemplate.find(query,Node.class);
	}
	
	@Autowired
	public List<Node> getAllNodes(){
		return nodeRepository.findAll();
	}
	
}


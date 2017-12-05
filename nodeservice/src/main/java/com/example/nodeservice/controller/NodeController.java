package com.example.nodeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.nodeservice.collections.Node;
import com.example.nodeservice.repositories.NodeRepository;
import com.example.nodeservice.service.NodeService;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mongodb.Mongo;

@RestController
public class NodeController {
	
	NodeService nodeService;
	NodeRepository nodeRepository;
	Query query;
	MongoTemplate mongoTemplate;
	
	@Autowired
	public NodeController(NodeService nodeService,NodeRepository nodeRepository){
		this.nodeService = nodeService;
		this.nodeRepository = nodeRepository;
		mongoTemplate = new MongoTemplate(new SimpleMongoDbFactory(new Mongo(),"nodedb"));
	    query = new Query();
	}
	
	@CrossOrigin(allowedHeaders="*",allowCredentials="true")
	@RequestMapping(value="/nodes",method=RequestMethod.GET)
	public List<Node> getAllNodes(){
		return nodeService.getAllNodes();
	}
	
	
	@CrossOrigin(allowedHeaders="*",allowCredentials="true")
	@RequestMapping(value="/nodelist/{routeId}",method=RequestMethod.GET)
	public List<Node> getNodesByRoute(@PathVariable
			String routeId){
		 return nodeRepository.findByrouteIdQuery(routeId);
		
	}
	
	@CrossOrigin(allowedHeaders="*",allowCredentials="true")
	@RequestMapping(value="/routes",method=RequestMethod.GET)
	public List<Node> getRouteData(){
		return nodeService.getRouteData();
	}
	
	@CrossOrigin(allowedHeaders="*",allowCredentials="true")
	@RequestMapping(value="nodes/createNode",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResponseEntity<Node> createNode(
			@JsonProperty
			@RequestBody 
			Node node) {
			nodeRepository.save(node);
		return new ResponseEntity<>(new Node(),HttpStatus.CREATED);
		}

}

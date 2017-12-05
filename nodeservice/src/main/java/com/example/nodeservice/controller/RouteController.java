package com.example.nodeservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.nodeservice.collections.Route;
import com.example.nodeservice.service.RouteService;
import com.fasterxml.jackson.annotation.JsonProperty;

@RestController
public class RouteController {
	
	RouteService routeService;
	
	@Autowired
	RouteController(RouteService routeService){
		this.routeService = routeService;
	}
	
	@CrossOrigin(allowedHeaders="*",allowCredentials="true")
	@RequestMapping(value="routes/createRoute",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResponseEntity<Route> createRoute(
			@JsonProperty
			@RequestBody 
			Route route) {
			routeService.createRoute(route);
		return new ResponseEntity<>(new Route(),HttpStatus.CREATED);
		}
	
	@CrossOrigin(allowedHeaders="*",allowCredentials="true")
	@RequestMapping(value="/routelist",method=RequestMethod.GET)
	public List<Route> getRouteList(){
		return routeService.getAllRoutes();
	}
	

}

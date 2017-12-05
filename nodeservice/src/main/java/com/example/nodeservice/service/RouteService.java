package com.example.nodeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nodeservice.collections.Node;
import com.example.nodeservice.collections.Route;
import com.example.nodeservice.repositories.RouteRepository;

@Service
public class RouteService {
	
	private RouteRepository routeRepository;
	
	@Autowired
	public RouteService(RouteRepository routeRepository) {
		this.routeRepository = routeRepository;
	}
	
	public void createRoute(Route route) {
		routeRepository.save(route);
	}
	
	@Autowired
	public List<Route> getAllRoutes(){
		return routeRepository.findAll();
	}
	
	@Autowired
	public void addRoute() {
		Route objRoute = new Route();
		objRoute.setRouteId("1");
		objRoute.setRouteName("Route - 1");
		objRoute.setStartNodeId(1);
		objRoute.setEndNodeId(3);
		objRoute.setStartNodeLatitude("37.7293");
		objRoute.setStartNodeLongitude("-121.929133");
		objRoute.setEndNodeLongitude("-121.942828");
		objRoute.setEndNodeLatitude("37.725151");
		routeRepository.save(objRoute);
	}
}

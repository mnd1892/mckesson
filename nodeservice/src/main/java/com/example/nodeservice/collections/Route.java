package com.example.nodeservice.collections;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection="Route")
public class Route {
	
	@Id
	private String routeId;
	private String routeName;
	private int startNodeId;
	private int endNodeId;
	private String startNodeLatitude;
	private String endNodeLatitude;
	private String startNodeLongitude;
	private String endNodeLongitude;
	
	public Route(){
		
	}
	
	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	
	public String getRouteId() {
		return routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	public int getStartNodeId() {
		return startNodeId;
	}
	public void setStartNodeId(int startNodeId) {
		this.startNodeId = startNodeId;
	}
	public int getEndNodeId() {
		return endNodeId;
	}
	public void setEndNodeId(int endNodeId) {
		this.endNodeId = endNodeId;
	}
	public String getStartNodeLatitude() {
		return startNodeLatitude;
	}
	public void setStartNodeLatitude(String startNodeLatitude) {
		this.startNodeLatitude = startNodeLatitude;
	}
	public String getEndNodeLatitude() {
		return endNodeLatitude;
	}
	public void setEndNodeLatitude(String endNodeLatitude) {
		this.endNodeLatitude = endNodeLatitude;
	}
	public String getStartNodeLongitude() {
		return startNodeLongitude;
	}
	public void setStartNodeLongitude(String startNodeLongitude) {
		this.startNodeLongitude = startNodeLongitude;
	}
	public String getEndNodeLongitude() {
		return endNodeLongitude;
	}
	public void setEndNodeLongitude(String endNodeLongitude) {
		this.endNodeLongitude = endNodeLongitude;
	}

}

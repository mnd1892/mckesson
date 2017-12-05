package com.example.nodeservice.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Nodes")
public class Node {
	
	@Id
	private String nodeId;
	private long startNodeId;
	private long endNodeId;
	private String nodeLocation;
	private double longitude;
	private double latitude;
	private String routeId;
	private long prevNodeId;
	private long nextNodeId;
	private String startDropoffTime;
	private String endDropoffTime;
	private String nodeName;
	
	public Node(){
		
	}
	
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public long getStartNodeId() {
		return startNodeId;
	}
	public void setStartNodeId(long startNodeId) {
		this.startNodeId = startNodeId;
	}
	public long getEndNodeId() {
		return endNodeId;
	}
	public void setEndNodeId(long endNodeId) {
		this.endNodeId = endNodeId;
	}
	public String getNodeLocation() {
		return nodeLocation;
	}
	public void setNodeLocation(String nodeLocation) {
		this.nodeLocation = nodeLocation;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public String getRouteId() {
		return routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public long getPrevNodeId() {
		return prevNodeId;
	}

	public void setPrevNodeId(long prevNodeId) {
		this.prevNodeId = prevNodeId;
	}

	public long getNextNodeId() {
		return nextNodeId;
	}

	public void setNextNodeId(long nextNodeId) {
		this.nextNodeId = nextNodeId;
	}

	public String getStartDropoffTime() {
		return startDropoffTime;
	}

	public void setStartDropoffTime(String startDropoffTime) {
		this.startDropoffTime = startDropoffTime;
	}

	public String getEndDropoffTime() {
		return endDropoffTime;
	}

	public void setEndDropoffTime(String endDropoffTime) {
		this.endDropoffTime = endDropoffTime;
	}
	
	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

}

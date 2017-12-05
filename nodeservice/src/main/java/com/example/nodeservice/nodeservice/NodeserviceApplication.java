package com.example.nodeservice.nodeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EntityScan("com.example.nodeservice.collections")
@EnableMongoRepositories("com.example.nodeservice.repositories")
@ComponentScan({"com.example.nodeservice.service","com.example.nodeservice.controller"})
public class NodeserviceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(NodeserviceApplication.class, args);
	}
}

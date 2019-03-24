package com.in28minutes.springboot.microservice.example.forex.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages= {"com.in28minutes.springboot.microservice.example.forex.repo"})
@ComponentScan("com.in28minutes.springboot.microservice.example.forex.controller")
@EntityScan(basePackages = "com.microservice.example.forex.entity")
public class SpringBootMicroserviceForexServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceForexServiceApplication.class, args);
	}

}

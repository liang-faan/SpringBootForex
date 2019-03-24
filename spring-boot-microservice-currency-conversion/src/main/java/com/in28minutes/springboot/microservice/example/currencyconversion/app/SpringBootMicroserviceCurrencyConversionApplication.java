package com.in28minutes.springboot.microservice.example.currencyconversion.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients("com.in28minutes.springboot.microservice.example.currencyconversion.proxy")
@ComponentScan("com.in28minutes.springboot.microservice.example.currencyconversion.controller")
//@EnableEurekaClient
@EnableDiscoveryClient
public class SpringBootMicroserviceCurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceCurrencyConversionApplication.class, args);
	}

}

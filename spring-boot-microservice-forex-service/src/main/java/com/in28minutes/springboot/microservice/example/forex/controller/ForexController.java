package com.in28minutes.springboot.microservice.example.forex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.microservice.example.forex.repo.CurrencyCodesRepository;
import com.in28minutes.springboot.microservice.example.forex.repo.ExchangeValueRepository;
import com.microservice.example.forex.entity.CurrencyCodes;
import com.microservice.example.forex.entity.ExchangeValue;

//@EnableDiscoveryClient
@RestController
public class ForexController {
	@Autowired
	private Environment environment;

	@Autowired
	private ExchangeValueRepository repository;
	
	@Autowired
	private CurrencyCodesRepository cRepository;
	

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to) {

		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		return exchangeValue;

	}
	
	@GetMapping("/retrieve-currency-codes")
	public List<CurrencyCodes> retrieveCurrencyCodes(){
		return cRepository.findAll();
	}

}

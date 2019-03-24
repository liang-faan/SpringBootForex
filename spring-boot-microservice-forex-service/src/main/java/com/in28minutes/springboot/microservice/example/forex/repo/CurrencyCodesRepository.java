package com.in28minutes.springboot.microservice.example.forex.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.example.forex.entity.CurrencyCodes;

public interface CurrencyCodesRepository extends JpaRepository<CurrencyCodes, Integer> {

}

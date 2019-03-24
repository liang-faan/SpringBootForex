/**
 * 
 */
package com.in28minutes.springboot.microservice.example.forex.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.example.forex.entity.ExchangeValue;

/**
 * @author Lanphan
 *
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	public ExchangeValue findByFromAndTo(String from, String to);

}

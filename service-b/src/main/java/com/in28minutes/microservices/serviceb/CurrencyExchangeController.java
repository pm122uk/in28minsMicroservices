package com.in28minutes.microservices.serviceb;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CurrencyExchangeController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository repository;
		
	@GetMapping("/service-method-b/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeController(@PathVariable String from, 
													@PathVariable String to)
	{
		//ExchangeValue exchangeValue = new ExchangeValue(1000L,from,to,BigDecimal.valueOf(65)  );
		
		ExchangeValue exchangeValue = repository.findByFromAndTo( from, to  );
		
		//repository
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		logger.info("{}", exchangeValue);
		return exchangeValue;
	}
	
	

	
}

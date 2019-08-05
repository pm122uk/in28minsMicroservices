package com.in28minutes.microservices.servicea;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.in28minutes.microservices.servicea.CurrencyConversionBean;


@RestController
public class CurrencyConversionController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//@Autowired
	//private CurrencyExchangeServiceProxy proxy;
	
	@GetMapping("/service-method-a/length/{from}/width/{to}/height/{quantity}")
	public CurrencyConversionBean convertCurrency(	@PathVariable String from , 
											@PathVariable String to,
											@PathVariable BigDecimal quantity)
	{
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to); 
		
		ResponseEntity<CurrencyConversionBean> responseEntity= 
				new RestTemplate().getForEntity(
				"http://localhost:8000/service-method-b/from/{from}/to/{to}",
				CurrencyConversionBean.class,
				uriVariables);
		
		/* processes rest response , uses map to store from and to values  */
		
		CurrencyConversionBean response = responseEntity.getBody();
		
		return new CurrencyConversionBean(response.getId(),  from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()),
				response.getPort()); 
	}
	


}

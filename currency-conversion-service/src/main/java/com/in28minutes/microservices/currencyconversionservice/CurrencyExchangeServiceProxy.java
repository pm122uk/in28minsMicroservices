package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// rest service client that makes it easy to call other rest service. allows you to define a proxy
// @FeignClient(name="currency-exchange-service", url="localhost:8000")   // old way of calling before ribbon usage
// Implemented a API gateway, means that Feign client needs to call API gateway and the exchange proxy  

/*
@FeignClient(name="currency-exchange-service")    // old feign mapping for direct calls
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")   //  old service with out gateway
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable ("from") String from, @PathVariable ("to") String to);
}
*/

@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable ("from") String from, @PathVariable ("to") String to);
}

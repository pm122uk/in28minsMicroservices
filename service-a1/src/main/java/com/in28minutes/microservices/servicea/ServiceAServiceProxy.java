package com.in28minutes.microservices.servicea;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="netflix-zuul-api-gateway-server")   // now run though zuul
@RibbonClient(name="currency-exchange-service")
public interface ServiceAServiceProxy {
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable ("from") String from, @PathVariable ("to") String to);
}





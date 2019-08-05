package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix   // added in hystrix support
public class LimitsServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
	}

}

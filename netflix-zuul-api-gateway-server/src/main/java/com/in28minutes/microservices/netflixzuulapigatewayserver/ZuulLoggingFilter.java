package com.in28minutes.microservices.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;



@Component
public class ZuulLoggingFilter extends ZuulFilter{
	

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Override
	public boolean shouldFilter() {
		return true;
	}

	// logs the request could be used to for security or  rate limiting , 
	//
	//
	
	@Override
	public Object run() {
		HttpServletRequest request = 
				RequestContext.getCurrentContext().getRequest();
		logger.info("request -> {} request uri -> {}", 
				request, request.getRequestURI());
		return null;
	}


	@Override
	public String filterType() {
		return "pre";    // before , after or error requests
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}

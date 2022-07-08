package br.com.luiz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@RestController
@RequestMapping("book-service")
public class FooBarController {
	
	private Logger logger = LoggerFactory.getLogger(FooBarController.class);
	
	@GetMapping("/foo-bar")
//	@Retry(name = "foobar", fallbackMethod = "fallbackMethod")	
//	@CircuitBreaker(name = "default", fallbackMethod = "fallbackMethod")	
//	@RateLimiter(name = "default")	
	@Bulkhead(name = "default")	
	public String fooBar() {
//		logger.info("Request to foobar is received!");
//		var response = new RestTemplate().getForEntity("http://localhost:8080/foo-bar",String.class);
		return "fooBar!!!";
//		return response.getBody();
	}
	
	public String fallbackMethod(Exception ex) {
		
		return "fallbackMethod foo-bar!!";
	}
}

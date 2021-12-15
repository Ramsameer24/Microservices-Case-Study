package com.fis.training.microservice.subscriptionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "books-exchange", url = "localhost:8000")
public interface SubscriptionProxy {
	
	@GetMapping("books-exchange/name/{name}/author/{author}")
	public Subscription retrieveExchange(
			@PathVariable String name,
			@PathVariable String author) ;
}
